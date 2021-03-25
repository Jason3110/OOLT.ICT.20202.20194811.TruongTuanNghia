public class TestDate {
    public static void main(String[] args) {
        MyDate date1, date2, date3, date4;
        date1 = new MyDate(16,12,2001);
        date2 = new MyDate(31,10,2012);
        date3 = new MyDate(16,2,2002);
        date4 = new MyDate(26,11,2020);
        System.out.println("Print test:");
        date4.print();
        MyDate.chooseformat(1,date1);
        System.out.println("\n" + "Compare test: ");
        if(DateUtil.compare(date2,date3)==1) {
            MyDate.chooseformat(2,date3);
            System.out.print(" is before ");
            MyDate.chooseformat(2,date3);
        }
        else {
            MyDate.chooseformat(3,date3);
            System.out.print(" is before ");
            MyDate.chooseformat(3,date4);
        }
        System.out.println("\n"+"Sorting test: ");
        DateUtil.sort(date1,date2,date3,date4);
    }
}
