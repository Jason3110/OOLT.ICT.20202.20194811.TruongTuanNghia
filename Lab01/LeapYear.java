import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        String month;
        do {
            System.out.print("Enter the year: ");
            year = input.nextInt();
            if(year<0) System.out.print("Invallid input\nYear must be a non-negative number\n");
        }while(year<0);
        boolean leap;
        if(year%4==0) {
            if(year%100==0) {
                if(year%400==0) leap=true;
                else leap=false;
            }
            else leap=true;
        }
        else leap=false;
        int check;
        do {
            System.out.print("Enter the month: ");
            month = input.next();
            switch(month) {
                case "January":
                case "Jan.":
                case "Jan":
                case "1":
                case "March":
                case "Mar.":
                case "Mar":
                case "3":
                case "May":
                case "May.":
                case "5":
                case "July":
                case "Jul.":
                case "Jul":
                case "7":
                case "August":
                case "Aug.":
                case "Aug":
                case "8":
                case "October":
                case "Oct":
                case "Oct.":
                case "10":
                case "December":
                case "Dec.":
                case "Dec":
                case "12":
                    System.out.println("This month has 31 days");
                    check=1;
                    break;
                case "February":
                case "Feb.":
                case "Feb":
                case "2":
                    if(leap) System.out.println("This month has 29 days");
                    else System.out.println("This month has 28 days");
                    check=1;
                    break;
                case "April":
                case "Apr.":
                case "Apr":
                case "4":
                case "June":
                case "Jun.":
                case "Jun":
                case "6":
                case "September":
                case "Sep.":
                case "Sep":
                case "9":
                case "November":
                case "Nov.":
                case "Nov":
                case "11":
                    System.out.println("This month has 30 days");
                    check=1;
                    break;
                default:
                    System.out.println("Invalid month");
                    check=0;
                    break;
            }
        }while(check==0);
    }
}