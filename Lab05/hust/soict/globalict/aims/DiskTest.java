package hust.soict.globalict.aims;

import hust.soict.globalict.aims.disc.*;
import hust.soict.globalict.aims.utils.*;
import hust.soict.globalict.aims.order.*;

public class DiskTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(31, 8, 2017);
        Order Order1 = new Order(date1);
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        Order1.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        Order1.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        Order1.addDigitalVideoDisc(dvd3);
        DigitalVideoDisc x = Order1.getALuckyItem();
        Order1.printOrder();
    }
}
