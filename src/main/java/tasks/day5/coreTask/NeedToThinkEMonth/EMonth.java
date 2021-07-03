package main.java.tasks.day5.coreTask.NeedToThinkEMonth;

public enum EMonth {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    String month;

    EMonth(String month) {
        this.month = month;
    }

    public static EMonth byMonth(String month) {
        switch (month) {
/*            case "1":
                return JANUARY;*/
            case "2":
                return FEBRUARY;
            case "3":
                return MARCH;
            case "4":
                return APRIL;
            case "5":
                return MAY;
            case "6":
                return JUNE;
            case "7":
                return JULY;
            case "8":
                return AUGUST;
            case "9":
                return SEPTEMBER;
            case "10":
                return OCTOBER;
            case "11":
                return NOVEMBER;
            case "12":
                return DECEMBER;
            default:
                return JANUARY;
        }
    }
}
