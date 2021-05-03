package hust.soict.globalict.aims.utils;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;


public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        super();
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void print(){
        switch(month) {
            case 1:
                System.out.print("January ");
                break;
            case 2:
                System.out.print("February ");
                break;
            case 3:
                System.out.print("March ");
                break;
            case 4:
                System.out.print("April ");
                break;
            case 5:
                System.out.print("May ");
                break;
            case 6:
                System.out.print("June ");
                break;
            case 7:
                System.out.print("July ");
                break;
            case 8:
                System.out.print("August ");
                break;
            case 9:
                System.out.print("September ");
                break;
            case 10:
                System.out.print("October ");
                break;
            case 11:
                System.out.print("November ");
                break;
            case 12:
                System.out.print("December ");
                break;
        }
        if (day == 1 || day == 11 || day == 21 || day == 31) System.out.print(day + "st ");
        else if (day == 2 || day == 12 || day == 22) System.out.print(day + "nd ");
        else if (day == 3 || day == 13 || day == 23) System.out.print( day + "rd ");
        else System.out.print(day + "th ");


        System.out.println(year);
    }

    public static void chooseformat(int option, MyDate date) {
        if (option == 1) {
            System.out.print(date.getYear());
            System.out.print("-");
            System.out.print(date.getMonth());
            System.out.print("-");
            System.out.print(date.getDay());
        } else if (option == 2) {
            System.out.print(date.getDay());
            System.out.print("/");
            System.out.print(date.getMonth());
            System.out.print("/");
            System.out.print(date.getYear());
        } else if (option == 3) {
            System.out.print(date.getDay());
            System.out.print("-");
            System.out.print(date.getMonth());
            System.out.print("-");
            System.out.print(date.getYear());
        } else if (option == 4) {
            System.out.print(date.getMonth());
            System.out.print(" ");
            System.out.print(date.getDay());
            System.out.print(" ");
            System.out.print(date.getYear());
        } else if (option == 5) {
            System.out.print(date.getMonth());
            System.out.print("-");
            System.out.print(date.getDay());
            System.out.print("-");
            System.out.print(date.getYear());
        }
    }
}