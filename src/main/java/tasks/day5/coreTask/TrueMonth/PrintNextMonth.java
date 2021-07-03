package main.java.tasks.day5.coreTask.TrueMonth;

import main.java.tasks.day5.coreTask.TrueMonth.MonthConstant;

public class PrintNextMonth {
    static String printNextMonth(String month) {
        String aMonth = month;
        switch (aMonth) {
            case (MonthConstant.JANUARY):
                System.out.println(MonthConstant.FEBRUARY);
                break;
            case (MonthConstant.FEBRUARY):
                System.out.println(MonthConstant.MARCH);
                break;
            case (MonthConstant.MARCH):
                System.out.println(MonthConstant.APRIL);
                break;
            case (MonthConstant.APRIL):
                System.out.println(MonthConstant.MAY);
                break;
            case (MonthConstant.MAY):
                System.out.println(MonthConstant.JUNE);
                break;
            case (MonthConstant.JUNE):
                System.out.println(MonthConstant.JULY);
                break;
            case (MonthConstant.JULY):
                System.out.println(MonthConstant.AUGUST);
                break;
            case (MonthConstant.AUGUST):
                System.out.println(MonthConstant.SEPTEMBER);
                break;
            case (MonthConstant.SEPTEMBER):
                System.out.println(MonthConstant.OCTOBER);
                break;
            case (MonthConstant.OCTOBER):
                System.out.println(MonthConstant.NOVEMBER);
                break;
            case (MonthConstant.NOVEMBER):
                System.out.println(MonthConstant.DECEMBER);
                break;
            case (MonthConstant.DECEMBER):
                System.out.println(MonthConstant.JANUARY);
                break;
        }
        return aMonth;
    }
}
