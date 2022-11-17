package bo.ucb.edu.backendSpringMrJeff.bl;

import bo.ucb.edu.backendSpringMrJeff.dao.MrBranchDao;
import bo.ucb.edu.backendSpringMrJeff.dao.MrHolidayDao;
import bo.ucb.edu.backendSpringMrJeff.dao.MrScheduleDao;
import bo.ucb.edu.backendSpringMrJeff.dto.OutBranchDto;
import bo.ucb.edu.backendSpringMrJeff.entity.MrBranch;
import bo.ucb.edu.backendSpringMrJeff.entity.MrHoliday;
import bo.ucb.edu.backendSpringMrJeff.entity.MrSchedule;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrePickUpBl {
    private MrScheduleDao mrScheduleDao;
    private MrHolidayDao mrHolidayDao;
    private MrBranchDao mrBranchDao;

    public PrePickUpBl(
            MrScheduleDao mrScheduleDao,
            MrHolidayDao mrHolidayDao,
            MrBranchDao mrBranchDao
    ) {
        this.mrScheduleDao = mrScheduleDao;
        this.mrHolidayDao = mrHolidayDao;
        this.mrBranchDao = mrBranchDao;
    }

    public List<MrSchedule> getAllSchedule(){
        return mrScheduleDao.getSchedule();
    }

    public List<String> getHolidaysInOneMonthStrings(){
        return mrHolidayDao.getHolidaysInOneMonthStrings();
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
}
