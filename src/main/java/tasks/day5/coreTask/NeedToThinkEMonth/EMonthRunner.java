package main.java.tasks.day5.coreTask.NeedToThinkEMonth;

public class EMonthRunner {
    public void printMonth(EMonth month) {
        switch (month) {
            case JANUARY:
            case FEBRUARY:
            case MARCH:
            case APRIL:
            case MAY:
            case JUNE:
            case JULY:
            case AUGUST:
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
            case DECEMBER:
                break;
        }
    }

    public void printMonthByMonth(String month){
        switch (EMonth.byMonth(month)){
            case JANUARY:
                break;
            case FEBRUARY:
            case MARCH:
            case APRIL:
            case MAY:
            case JUNE:
            case JULY:
            case AUGUST:
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
            case DECEMBER:
        }
    }
}

