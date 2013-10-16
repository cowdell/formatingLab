import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
