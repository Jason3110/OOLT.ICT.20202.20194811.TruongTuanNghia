public class Aims {
    public static void main(String[] args){
        Order anOrder = new Order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("the lion king","animation","Roger Allers",87,19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science fiction","George Lucas",87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation","somebody",87,18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());
    }
}
