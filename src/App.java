import java.util.LinkedList;

/**
 * Demo file for testing the LinkedList class.
 * 
 * @author Kyle Robert Harrison
 * @version 21 Mar 2025
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("*** Testing LinkedList ***");

        ListADT<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addLast(3);
        list.add(1, 2);
        list.addLast(4);
        list.addFirst(0);
        list.addLast(5);

        System.out.println("List: " + list);

        list.remove(3);
        list.removeFirst();
        list.removeLast();

        System.out.println("Front: " + list.head());
        System.out.println("Back: " + list.tail());
        System.out.println("Size: " + list.size());
        System.out.println("List: " + list);
        System.out.println();
    }
}
