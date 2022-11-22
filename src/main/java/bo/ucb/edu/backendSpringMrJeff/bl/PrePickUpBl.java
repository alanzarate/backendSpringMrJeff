package bo.ucb.edu.backendSpringMrJeff.bl;

import bo.ucb.edu.backendSpringMrJeff.dao.MrAddressDao;
import bo.ucb.edu.backendSpringMrJeff.dao.MrBranchDao;
import bo.ucb.edu.backendSpringMrJeff.dao.MrHolidayDao;
import bo.ucb.edu.backendSpringMrJeff.dao.MrScheduleDao;
import bo.ucb.edu.backendSpringMrJeff.dto.AddressResDto;
import bo.ucb.edu.backendSpringMrJeff.dto.OutBranchDto;
import bo.ucb.edu.backendSpringMrJeff.entity.MrAddress;
import bo.ucb.edu.backendSpringMrJeff.entity.MrBranch;
import bo.ucb.edu.backendSpringMrJeff.entity.MrHoliday;
import bo.ucb.edu.backendSpringMrJeff.entity.MrSchedule;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PrePickUpBl {
    private MrScheduleDao mrScheduleDao;
    private MrHolidayDao mrHolidayDao;
    private MrBranchDao mrBranchDao;
    private MrAddressDao mrAddressDao;

    public PrePickUpBl(
            MrScheduleDao mrScheduleDao,
            MrHolidayDao mrHolidayDao,
            MrBranchDao mrBranchDao,
            MrAddressDao mrAddressDao
    ) {
        this.mrScheduleDao = mrScheduleDao;
        this.mrHolidayDao = mrHolidayDao;
        this.mrBranchDao = mrBranchDao;
        this.mrAddressDao = mrAddressDao;
    }

    public List<MrSchedule> getAllSchedule(){
        return mrScheduleDao.getSchedule();
    }

    public List<String> getHolidaysInOneMonthStrings(){
        return mrHolidayDao.getHolidaysInOneMonthStrings();
    }

    public List<Date> getHolidaysInOneMonth(){
        List<Date> dates = new ArrayList<>();
        List<MrHoliday> mrHolidays = mrHolidayDao.getHolidaysInOneMonth();

        for(MrHoliday mrs: mrHolidays){
            System.out.println(mrs.getDateHoliday());
            dates.add(mrs.getDateHoliday());
        }
        return dates;
    }

    public List<OutBranchDto> getBranchesInfoWithNoStatus(){
        List<MrBranch> branches = mrBranchDao.getListOfBranches();
        List<OutBranchDto> returned = new ArrayList<>();
        for(MrBranch branch: branches){
            OutBranchDto out = new OutBranchDto();
            out.setBranchId(branch.getMrBranchId());
            out.setBranchName(branch.getBranchName());
            out.setLatitude(branch.getLatitude());
            out.setLongitude(branch.getLongitude());
            out.setAddressLink(branch.getAddressLink());
            out.setRatio(branch.getAtentionRatioM());

            returned.add(out);

        }
        return returned;
    }

    public List<Integer> getAddressesIdFromUser(Integer userId){
        return mrAddressDao.getAllAddressUserId(userId);

    }

    public List<MrAddress> getAddressInfoFromUser(Integer userId){
        return mrAddressDao.getAllAddressUserInfo(userId);
    }

    public List<AddressResDto> getAddressInfoFromUserDto(Integer userId){
        List<MrAddress> mrAddresses = this.getAddressInfoFromUser(userId);
        List<AddressResDto> response = new ArrayList<>();
        for (MrAddress mrAd : mrAddresses){
            response.add(new AddressResDto(mrAd.getMrAddressId(), mrAd.getLatitude(), mrAd.getLongitude(), mrAd.getName(),
                    mrAd.getDetail(), mrAd.getAddressLink()));
        }
        return response;
    }

    public MrBranch isThisAddressValidForService(Double lat, Double lng){
        List<MrBranch> branches = mrBranchDao.getListOfBranches();
        int pointer = -1;
        double distance = 100000000;
        for(int j = 0; j < branches.size(); j++){
            MrBranch currentBranch = branches.get(j);
            double distanceCalculated = distance(currentBranch.getLatitude(), lat, currentBranch.getLongitude(), lng, 0, 0);
            if(distanceCalculated < currentBranch.getAtentionRatioM()){

                if(distanceCalculated < distance){
                    distance = distanceCalculated;
                    pointer = j;
                }
            }
        }

        if(pointer == -1){
            return null;
        }else{
            return branches.get(pointer);
        }



    }


    /**
     * Calculate distance between two points in latitude and longitude taking
     * into account height difference. If you are not interested in height
     * difference pass 0.0. Uses Haversine method as its base.
     *
     * lat1, lon1 Start point lat2, lon2 End point el1 Start altitude in meters
     * el2 End altitude in meters
     * @returns Distance in Meters
     */
    public static double distance(double lat1, double lat2, double lon1,
                                  double lon2, double el1, double el2) {

        final int R = 6371; // Radius of the earth

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters

        double height = el1 - el2;

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }
}
