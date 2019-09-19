import java.util.List;
import java.util.NoSuchElementException;

/**
   A list iterator allows access of a position in a linked list.    
   This interface contains a subset of the methods of the 
   standard java.util.ListIterator interface. The methods for
   backward traversal are not included.
*/
//Class Node
   class Node
{
   public Object data;
   public Node next;
}
class LinkedListIterator implements ListIterator
{
   //private data
   private Node position;
   private Node previous;
   private boolean isAfterNext;
   public Object next()
   {
      if(!hasNext())
      {
         throw new NoSuchElementException();
      }
      previous = position;
      isAfterNext = true;
      if(position == null)
      {
         position = first;
      }
      else
      {
         position = position.next;

      }
      return position.data;
   }
   public boolean hasNext()
   {
      if (position == null)
      {
         return first != null;
      }
      else
      {
         return position.next != null;
      }
   }
}
public interface ListIterator

{
   /**
      Moves the iterator past the next element.
      @return the traversed element
   */
   Object next();

   /**
      Tests if there is an element after the iterator position.
      @return true if there is an element after the iterator position
   */
   boolean hasNext();

   /**
      Adds an element before the iterator position
      and moves the iterator past the inserted element.
      @param element the element to add
   */
   void add(Object element)

   /**
      Removes the last traversed element. This method may
      only be called after a call to the next() method.
   */
   void remove();

   /**
      Sets the last traversed element to a different value.
      @param element the element to set
   */
   void set(Object element);
   }
