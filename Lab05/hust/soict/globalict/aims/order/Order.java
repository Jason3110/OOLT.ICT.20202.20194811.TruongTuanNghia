package hust.soict.globalict.aims.order;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.utils.MyDate;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public static final int MAX_LIMITTED_ORDERS = 5;
    private static int nbOrders = 0;
    private int qtyOrdered = 0;
    public float total_Cost = 0;
    public int check = 0;
    MyDate dateOrdered;

    public Order(MyDate dateOrdered) {
        super();
        if (nbOrders >= 5) {
            System.out.println("Orders list is full");
            return;
        }
        this.dateOrdered = dateOrdered;
        nbOrders++;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == 10) {
            System.out.println("The cart is full!");
        } else {
            itemsOrdered[qtyOrdered] = new DigitalVideoDisc(
                    disc.getTitle(),
                    disc.getCategory(),
                    disc.getDirector(),
                    disc.getLength(),
                    disc.getCost());
            qtyOrdered++;
            total_Cost = total_Cost + disc.getCost();
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] disclist) {
        for (int i = 0; i < disclist.length; i++) {
            addDigitalVideoDisc(disclist[i]);
            if (qtyOrdered == 10) {
                System.out.println("The cart is full!");
                System.out.println("List of items that cannot be added to the order: ");
                for (int j = i; j < disclist.length; j++) {
                    System.out.println(disclist[i].getTitle());
                }
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc d1, DigitalVideoDisc d2) {
        addDigitalVideoDisc(d1);
        addDigitalVideoDisc(d2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty!");
        } else {
            String s = disc.getTitle();
            for (int i = 0; i < qtyOrdered; i++) {
                if (s == itemsOrdered[i].getTitle()) {
                    total_Cost = total_Cost - disc.getCost();
                    for (int j = 1; j < qtyOrdered - 1; j++) {
                        itemsOrdered[j] = itemsOrdered[j + 1];
                    }
                    check = 1;
                    break;
                }
            }
            if (check == 0) {
                System.out.println("Cannot find the video!");
            }
        }
    }

    public float totalCost() {
        return total_Cost;
    }

    public void printOrder() {
        System.out.println("***********************Order***********************");
        System.out.print("Date: ");
        dateOrdered.print();
        System.out.println("Ordered Items:");
        for (int i = 1; i <= qtyOrdered; i++)
            System.out.println(i + ". DVD - " + itemsOrdered[i - 1].getTitle() + " - " + itemsOrdered[i - 1].getCategory()
                    + " - " + itemsOrdered[i - 1].getDirector() + " - " + itemsOrdered[i - 1].getLength() + ": " + itemsOrdered[i - 1].getCost() + " $");
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    public DigitalVideoDisc getALuckyItem() {
        int a = (int) (Math.random() * itemsOrdered.length - 1);
        total_Cost = total_Cost - itemsOrdered[a].getCost();
        return itemsOrdered[a];
    }
}