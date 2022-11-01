// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 7
// IDE Name: IntelliJ

// Generic code for class priority_queue_heap for Assignment 7

public class PQ_heap <E extends Comparable<E>> {

    private Heap<E> heap = new Heap();

    // Constructor method
    PQ_heap() {
        heap.add(object);
    };

    // Return true if priority queue is empty; otherwise return false
    public boolean is_empty() {
        return heap.getSize() == 0;
    };

    // Return true if priority queue is full; otherwise return false
    public boolean is_full() {
        return heap.getSize() == 100;
    };

    // Return (don't remove) the front element from the priority queue
    // Precondition: priority queue is not empty.
    public E front() {
        return null;
    };

    // return number of elements in the queue
    public int size() {
        return 0;
    };

    // Remove the largest value from this priority queue and return it.
    // Precondition: priority queue is not empty.
    public E dequeue() {
        return heap.remove();
    };
    // Inserts the 'value' into the priority queue
    // Precondition: priority queue is not full
    public void enqueue(E value) {
        heap.add(value);
    };
};