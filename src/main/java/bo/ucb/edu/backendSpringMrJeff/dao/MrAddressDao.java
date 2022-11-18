package bo.ucb.edu.backendSpringMrJeff.dao;

import bo.ucb.edu.backendSpringMrJeff.entity.MrAddress;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

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
                (MR_ADDRESS_ID, MR_USER_ID, STATUS, TX_DATE, TX_USER,
                TX_HOST, CREATED) VALUE
                ( #{ addressId } , #{ userId } , 1 , now() , 'admin',
                'localhost',now());
                """)
        void createNewAddressUser(Integer addressId, Integer userId );


}
