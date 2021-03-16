import java.util.Scanner;
import java.util.*;
public class Order {
    public static final int MAX_ORDERED_NUMBER = 10;
    private Stack<DigitalVideoDisc> itemOrdered = new Stack<DigitalVideoDisc>();
    private int QtyOrdered = itemOrdered.size();


    public int getQtyOrdered(){
        return QtyOrdered;
    }
    public void setQtyOrdered(int qtyOrdered) {
        QtyOrdered = qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
        if(QtyOrdered ==9){
            System.out.println("The order is almost full");
        }
        if(QtyOrdered ==10){
            System.out.println("The order is full ");
        }else{
            itemOrdered.add(dvd);
            QtyOrdered++;
        }
    }
    public float totalCost(){
        float total =0;
        while(itemOrdered.size() >0) total += itemOrdered.pop().getCost();
        return total;
    }
}
