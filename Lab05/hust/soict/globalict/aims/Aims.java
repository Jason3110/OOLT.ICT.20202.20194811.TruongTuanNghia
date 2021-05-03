package hust.soict.globalict.aims;

import hust.soict.globalict.aims.disc.*;
import hust.soict.globalict.aims.utils.*;
import hust.soict.globalict.aims.order.*;

public class Aims {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyDate date1 = new MyDate(31, 8, 2017);
        MyDate date2 = new MyDate(26, 11, 2020);
        MyDate date3 = new MyDate(26, 1, 2021);
        Order Order1 = new Order(date1);
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        Order1.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        Order1.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        Order1.addDigitalVideoDisc(dvd3);
        System.out.println("Print test Order1:");
        Order1.printOrder();
        System.out.println();
        Order Order2 = new Order(date1);
        Order2.addDigitalVideoDisc(dvd1);
        Order2.addDigitalVideoDisc(dvd2);
        System.out.println("Print test Order2:");
        Order2.printOrder();
    }

}
