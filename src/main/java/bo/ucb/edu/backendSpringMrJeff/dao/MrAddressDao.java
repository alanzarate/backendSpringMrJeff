package bo.ucb.edu.backendSpringMrJeff.dao;

import bo.ucb.edu.backendSpringMrJeff.entity.MrAddress;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MrAddressDao {

        @Insert("""
                    INSERT INTO MR_ADDRESS (LATITUDE, LONGITUDE, NAME, DETAIL, ADDRESS_LINK,
                                               STATUS, TX_DATE, TX_USER, TX_HOST, CREATED)
                        VALUES (#{ latitude },#{ longitude },#{ name }, #{ detail }, #{ addressLink } ,
                               1,now() , 'admin', 'localhost',now());
                    
                    """)
        void createNewAddress(MrAddress address);

        @Select("""
                SELECT currval('mr_address_mr_address_id_seq');
                """)
        Integer viewLastAddress();

        @Insert("""
                INSERT INTO MR_ADDRESS_USER
                ( MR_ADDRESS_ID, MR_USER_ID, STATUS, TX_DATE, TX_USER,
                TX_HOST, CREATED ) VALUES
                ( #{ addressId } , #{ userId } , 1 , now() , 'admin',
                'localhost', now() );
                """)
        void createNewAddressUser(Integer addressId, Integer userId );

        @Select("""
                
                SELECT ma.mr_address_id FROM MR_ADDRESS_USER mau
                JOIN MR_ADDRESS ma ON ma.mr_address_id = mau.mr_address_id
                WHERE mau.mr_user_id = #{ userId }
                AND mau.status = 1
                AND ma.status = 1;
                """)
        List<Integer> getAllAddressUserId(Integer userId);

        @Select("""
                SELECT ma.MR_ADDRESS_ID, ma.latitude, ma.longitude, ma.name, ma.detail,
                		ma.address_link, ma.status, ma.tx_date, ma.tx_user, ma.tx_host, ma.created
                FROM MR_ADDRESS ma
                JOIN MR_ADDRESS_USER mau ON ma.mr_address_id = mau.mr_address_id
                WHERE mau.mr_user_id = #{ userId }
                AND mau.status = 1
                AND ma.status = 1;
                                
                """)
        List<MrAddress> getAllAddressUserInfo(Integer userId);




}
