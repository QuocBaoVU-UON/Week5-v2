/**
 * Interface for a generic linked list that contains references to both the head and tail.
 * 
 * @author Kyle Robert Harrison
 * @version 08 Jan 2025
 */
public interface ListADT<E> extends Iterable<E>{

    /**
     * Inserts the specified element at the supplied index of this list.
     * 
     * Precondition: The index is valid and the element is not null.
     * Postcondition: The element is inserted at the specified index.
     * 
     * @param index - the index (location) to insert the supplied element.
     * @param element - the element to add.
     */
    public void add(int index, E element);

    /**
     * Inserts the specified element at the beginning of this list.
     * 
     * Precondition: The element is not null.
     * Postcondition: The element is inserted at the front of the list.
     * 
     * @param element - the element to add.
     */
    public void addFirst(E element);

    /**
     * Inserts the specified element at the end of this list.
     * 
     * Precondition: The element is not null.
     * Postcondition: The element is inserted at the end of the list.
     * 
     * @param element - the element to add.
     */
    public void addLast(E element);

    
    /**
     * Returns true if this list contains the specified element.
     * 
     * Precondition: The element is not null.
     * Postcondition: None
     * 
     * @param element - element whose presence in this list is to be tested.
     * @return true if this list contains the specified element.
     */
    public boolean contains(E element);

    /**
     * Returns the element at the specified position in this list.
     * 
     * Precondition: The index is valid.
     * Postcondition: None
     * 
     * @param index - index of the element to return.
     * @return the element at the specified position in this list.
     */
    public E get(int index);

    /**
     * Retrieves, but does not remove, the head (first element) of this list.
     * 
     * Precondition: The list is not empty.
     * Postcondition: None
     * 
     * @return the head of this list
     */
    public E head();

    /**
     * Retrieves, but does not remove, the tail (last element) of this list.
     * 
     * Precondition: The list is not empty.
     * Postcondition: None
     * 
     * @return the tail of this list
     */
    public E tail();

    /**
     * Removes and returns the first element from this list.
     * If the list is empty, an exception is thrown.
     * 
     * Precondition: The list is not empty.
     * Postcondition: The first item is removed from the list.
     * 
     * @return The first element from this list.
     */
    public E removeFirst();

    /**
     * Removes and returns the last element from this list.
     * If the list is empty, an exception is thrown.
     * 
     * Precondition: The list is not empty.
     * Postcondition: The last item is removed from the list.
     * 
     * @return The last element from this list.
     */
    public E removeLast();

    /**
     * Removes and returns the item at the specified index from this list. 
     * If the list is empty or the index is out of range, an exception is thrown.
     * 
     * Precondition: The list is not empty and the index is valid.
     * Postcondition: The first item is removed from the list.
     * 
     * @param index - the index of the element to be removed.
     * @return The element that was (previously) at the specified index.
     */
    public E remove(int index);

    /**
     * Returns true if this list contains no elements.
     * 
     * Precondition: None
     * Postcondition: None
     * 
     * @return true if this list contains no elements.
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements in this list.
     * 
     * Precondition: None
     * Postcondition: None
     * 
     * @return the number of elements in this list.
     */
    public int size();

    /**
     * Removes all of the elements from this list.
     * 
     * Precondition: None
     * Postcondition: The list is empty.
     */
    public void clear();
}
