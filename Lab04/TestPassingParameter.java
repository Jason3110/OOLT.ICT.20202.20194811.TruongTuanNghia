public class TestPassingParameter {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc ("Aladin", "Jungle", 18.99f);
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc ("Aladin", "Cinderella", 18.99f);

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungleDVD title: " + jungleDVD.getTitle());
        System.out.println("cinderellaDVD title: " + cinderellaDVD.getTitle());

        changeTitle (jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungleDVD title: "+ jungleDVD.getTitle());
    }

    public static void swap (DigitalVideoDisc o1, DigitalVideoDisc o2)
    {
        DigitalVideoDisc tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
    public static void changeTitle (DigitalVideoDisc dvd, String title)
    {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc ("Aladin", oldTitle, 18.99f);
    }
}
