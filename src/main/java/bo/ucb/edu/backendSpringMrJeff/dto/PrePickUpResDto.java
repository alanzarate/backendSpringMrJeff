package bo.ucb.edu.backendSpringMrJeff.dto;

import bo.ucb.edu.backendSpringMrJeff.entity.MrAddress;
import bo.ucb.edu.backendSpringMrJeff.entity.MrSchedule;

import java.util.Date;
import java.util.List;

public class PrePickUpResDto {
    Integer daysPermited;
    List<String> holidays;
    List<AddressResDto> address;
    List<MrSchedule> horas;


    public Integer getDaysPermited() {
        return daysPermited;
    }

    public void setDaysPermited(Integer daysPermited) {
        this.daysPermited = daysPermited;
    }

    public PrePickUpResDto(){}

    public List<String> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<String> holidays) {
        this.holidays = holidays;
    }

    public List<AddressResDto> getAddress() {
        return address;
    }

    public void setAddress(List<AddressResDto> address) {
        this.address = address;
    }

    public List<MrSchedule> getHoras() {
        return horas;
    }

    public void setHoras(List<MrSchedule> horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "PrePickUpResDto{" +
                "daysPermited=" + daysPermited +
                ", holidays=" + holidays +
                ", address=" + address +
                ", horas=" + horas +
                '}';
    }
}
