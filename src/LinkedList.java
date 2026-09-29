import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.*;

/**
 * Interface for a generic linked list that contains references to both the head and tail.
 * 
 * @author Kyle Robert Harrison
 * @version 08 Jan 2025
 */
public  class LinkedList<E> implements ListADT<E>{
    private Node firstNode = new Node(null);
    private Node lastNode = new Node(null);
    private int size = 0;
    public LinkedList() {
         firstNode.next = lastNode;
         firstNode.prev = null;
         lastNode.prev = firstNode;
         lastNode.next = null;
    }
    public class Node{
        public E val;
        Node next;
        Node prev;
        public Node(E val) {this.val = val;}
    }
    /**
     * Inserts the specified element at the supplied index of this list.
     * 
     * Precondition: The index is valid and the element is not null.
     * Postcondition: The element is inserted at the specified index.
     * 
     * @param index - the index (location) to insert the supplied element.
     * @param element - the element to add.
     */
    @Override 
    public void add(int index, E element){
        if(element == null || index > size|| index < 0){
            return;
        }
       Node currentNode = firstNode;
       for(int step = 0; step < index + 1; step ++){
            currentNode = currentNode.next;
       }
        Node newNode = new Node(element);
        newNode.next = currentNode;
        newNode.prev = currentNode.prev;
        currentNode.prev.next = newNode;
        currentNode.prev = newNode;
        size ++;
       
    }

    /**
     * Inserts the specified element at the beginning of this list.
     * 
     * Precondition: The element is not null.
     * Postcondition: The element is inserted at the front of the list.
     * 
     * @param element - the element to add.
     */
    public void addFirst(E element){
        Node newNode = new Node(element);
        newNode.prev = firstNode;
        newNode.next = firstNode.next;
        firstNode.next = newNode;
        newNode.next.prev = newNode;
        size ++; 
    }

    /**
     * Inserts the specified element at the end of this list.
     * 
     * Precondition: The element is not null.
     * Postcondition: The element is inserted at the end of the list.
     * 
     * @param element - the element to add.
     */
    public void addLast(E element){
        Node newNode = new Node(element);
        newNode.next = lastNode;
        newNode.prev = lastNode.prev;
        newNode.prev.next = newNode;
        lastNode.prev = newNode;
        size ++;  
    }

    
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
    public E get(int index){
         if(size == 0 ||  index >= size || index < 0  ){throw new NoSuchElementException();}
         Node currentNode = firstNode;
         for(int step  = 0; step < index + 1 ; step ++){
            currentNode = currentNode.next;
         }
         return currentNode.val;
    }

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
    public E removeFirst(){
        if( size == 0 ){throw new NoSuchElementException();}
        Node tempNode = firstNode.next;
        firstNode.next = tempNode.next;
        tempNode.next.prev = firstNode;
        tempNode.next = null;
        tempNode.prev = null;
        size -- ;
        return tempNode.val;

    }

    /**
     * Removes and returns the last element from this list.
     * If the list is empty, an exception is thrown.
     * 
     * Precondition: The list is not empty.
     * Postcondition: The last item is removed from the list.
     * 
     * @return The last element from this list.
     */
    public E removeLast(){
          if( size == 0 ){throw new NoSuchElementException();}
        Node tempNode = lastNode.prev;
        lastNode.prev = tempNode.prev;
        tempNode.prev.next = lastNode;
        tempNode.next = null;
        tempNode.prev = null;
        size -- ;
        return tempNode.val;
    }

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
    @Override 
    public E remove(int index){
         if(size == 0 ||  index >= size || index < 0  ){throw new NoSuchElementException();}
        Node currentNode = firstNode;
        for (int step = 0; step < index +1; step++) {
            currentNode = currentNode.next;
        }
        currentNode.prev.next = currentNode.next;
        currentNode.next.prev = currentNode.prev;
        currentNode.next = null;
        currentNode.prev = null;
        size --;
        return currentNode.val;
        
    }

    /**
     * Returns true if this list contains no elements.
     * 
     * Precondition: None
     * Postcondition: None
     * 
     * @return true if this list contains no elements.
     */
    public boolean isEmpty(){
        return size == 0;
       
    }

    /**
     * Returns the number of elements in this list.
     * 
     * Precondition: None
     * Postcondition: None
     * 
     * @return the number of elements in this list.
     */
    public int size(){
         return size;
    }    
    /**
     * Removes all of the elements from this list.
     * 
     * Precondition: None
     * Postcondition: The list is empty.
     */
    public void clear();
}
