import java.util.Scanner;
public class InputFromKeyboard {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's your name?");
        String strName = keyboard.next();
        System.out.println("How old are you? ");
        int iAge = keyboard.nextInt();
        System.out.println("How tall are you? ");
        double dHeight = keyboard.nextDouble();

        System.out.println("Mr/Mrs." + strName + "," + iAge + "year old."
                + "Your height is " + dHeight + ".");
    }

}