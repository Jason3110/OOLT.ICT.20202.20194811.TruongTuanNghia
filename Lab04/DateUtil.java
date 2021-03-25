public class DateUtil {
    public static int compare(MyDate date1, MyDate date2) {
        if(date1.getYear()<date2.getYear()) return 1;
        else if(date1.getYear()>date2.getYear()) return -1;
        else if(date1.getMonth()<date2.getMonth()) return 1;
        else if(date1.getMonth()>date2.getMonth()) return -1;
        else if(date1.getDay()<date2.getDay()) return 1;
        else if(date1.getDay()>date2.getDay()) return -1;
        else return 0;
    }
    public static void sort(MyDate... date) {
        int n = date.length;
        for (int i = 1; i < n; ++i) {
            MyDate key = date[i];
            int j = i - 1;
            while (j >= 0 && compare(date[j],key)==-1) {
                date[j + 1] = date[j];
                j = j - 1;
            }
            date[j + 1] = key;
        }
        for(int i=0;i<n;++i)
            date[i].print();
    }
}
