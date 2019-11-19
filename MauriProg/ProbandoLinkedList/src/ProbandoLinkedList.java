import java.util.Iterator;
import java.util.LinkedList;
import java.util.Comparator;

public class ProbandoLinkedList {
    public static void main(String[] args) {
        /*
            add == addLast -> boolean
            addFirst
            addLast
            getFirst
            getLast
            removeFirst
            removeLast
            element - devuelve el 1 elemento(NoSuchElementException)
            peek - (null) -> devuelve y no borra
            peekFirst - (null)
            peekLast - (null)
            pollFirst == null -> devuelve y borra
            pollLast == null -> devuelve y borra
            indexOf()
            contains

        */
        LinkedList<ElementoTest> linkedList = new LinkedList<>();
        linkedList.addFirst(new ElementoTest("1", 1));
        linkedList.addFirst(new ElementoTest("2", 2));
        linkedList.addFirst(new ElementoTest("3", 3));

        linkedList.addLast(new ElementoTest("4",4));
        linkedList.addLast(new ElementoTest("5",5));
        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList);
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList);
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);

        Iterator<ElementoTest> it = linkedList.descendingIterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
