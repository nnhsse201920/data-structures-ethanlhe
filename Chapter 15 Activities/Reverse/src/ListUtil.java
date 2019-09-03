import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse



    */
    public static void reverse(LinkedList<String> strings)
    {
        ListIterator<String> end = strings.listIterator();
        while(end.hasNext()) {
            end.next();
        }
        ListIterator<String> front = strings.listIterator();

        for(int i = 0; i<strings.size()/2; i++)
        {
            String n = end.previous();
            String a = front.next();
            front.set(n);
            end.set(a);
        }
    }
}