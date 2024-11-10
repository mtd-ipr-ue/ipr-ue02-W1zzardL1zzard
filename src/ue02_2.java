import libraries.In;
import libraries.Out;


public class ue02_2 {
    public class MonthDaysCalculator {
    public static void main(String[] args) {
    
        Out.println("Enter a month: ");
            int month = In.readInt();

        Out.println("Enter a year: ");
            int year = In.readInt();

            if (month < 1 || month > 12) {
                System.out.println("Invalid monthly value. Please try a number between 1 and 12.");
                return;
            }
    
            int days = 0;

            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;

                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;

                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                default:
                    System.out.println("Unknown error with the month.");
                    return;
            }
            System.out.println("The month " + month + " has " + days + " days in the year of " + year + ".");
    }
}
}