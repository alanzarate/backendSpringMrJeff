package bo.ucb.edu.backendSpringMrJeff.dto;

import java.sql.Time;
import java.util.Date;
import java.util.Timer;

public class PickUpDto
{
    private Date dateOpe;
    private String mrOrderComment;
    private String mrOperationState;
    private Time mrScheduleInit;
    private Time mrScheduleEnd;

    public PickUpDto(){}

    public PickUpDto(Date dateOpe, String mrOrderComment, String mrOperationState, Time mrScheduleInit, Time mrScheduleEnd) {
        this.dateOpe = dateOpe;
        this.mrOrderComment = mrOrderComment;
        this.mrOperationState = mrOperationState;
        this.mrScheduleInit = mrScheduleInit;
        this.mrScheduleEnd = mrScheduleEnd;
    }

    @Override
    public String toString() {
        return "PickUpDto{" +
                "dateOpe=" + dateOpe +
                ", mrOrderComment='" + mrOrderComment + '\'' +
                ", mrOperationState='" + mrOperationState + '\'' +
                ", mrScheduleInit=" + mrScheduleInit +
                ", mrScheduleEnd=" + mrScheduleEnd +
                '}';
    }

    public Date getDateOpe() {
        return dateOpe;
    }

    public void setDateOpe(Date dateOpe) {
        this.dateOpe = dateOpe;
    }

    public String getMrOrderComment() {
        return mrOrderComment;
    }

    public void setMrOrderComment(String mrOrderComment) {
        this.mrOrderComment = mrOrderComment;
    }

    public String getMrOperationState() {
        return mrOperationState;
    }

    public void setMrOperationState(String mrOperationState) {
        this.mrOperationState = mrOperationState;
    }

    public Time getMrScheduleInit() {
        return mrScheduleInit;
    }

    public void setMrScheduleInit(Time mrScheduleInit) {
        this.mrScheduleInit = mrScheduleInit;
    }

    public Time getMrScheduleEnd() {
        return mrScheduleEnd;
    }

    public void setMrScheduleEnd(Time mrScheduleEnd) {
        this.mrScheduleEnd = mrScheduleEnd;
    }
}
