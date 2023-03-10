package com.bridgelabz.linkedlist;

public class LinkedList<E> {
    private Node<E> head;
    private Node<E> tail;

    /* adding new head to linked list */
    void push(E value) {
        Node<E> newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    /* adding new tail to linked list */
    void append(E value) {
        Node<E> newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    /* Showing the whole linked-list*/
    void display() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* delete the 1st node(head) of a linked list */
    /* change the head position to the next node */
    E pop() {
        if (head == null) {
            return null;
        } else {
            E popData = head.data;
            head = head.next;
            return popData;
        }
    }

    /* delete the last node(tail) of a linked list */
    /* change the tail position to the previous node */
    E popLast() {
        if (head == null)
            return null;

        E popLastData = tail.data;
        Node<E> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        tail = temp;
        temp.next = null;
        return popLastData;
    }

    /* Searching a node in linked list */
    Node<E> search(E value) {
        if (head == null)
            return null;

        Node<E> temp = head;
        while (temp != null) {
            if ((temp.data).equals(value))
                return temp;
            temp = temp.next;
        }
        return null;
    }


    /* Insert node in the middle of LinkedList */
    void insertAfter(E previous, E data) {
        if (head == null) {
            System.out.println("Node not found!!!");
            return;
        }
        Node<E> temp = head;
        while (temp != null) {
            if ((temp.data).equals(previous)) {
                Node<E> newNode = new Node(data);
                Node<E> nextNode = temp.next;
                temp.next = newNode;
                newNode.next = nextNode;

                System.out.println("Node added successfully");
                return;
            }
            temp = temp.next;
        }
    }

    /* Get the size of linkedList*/
    int size() {
        int count = 0;
        if (head == null)
            return count;
        Node<E> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Size of the linked list is : " + count);
        return count;
    }


    /* delete node in the middle of LinkedList */
    void deleteAfter(E data) {
        if (head == null) {
            System.out.println("Empty LinkedList");
            return;
        }
        Node<E> temp = head;
        while (temp != null) {
            if ((temp.next.data).equals(data)) {
                temp.next = temp.next.next;
                System.out.println(data + " successfully deleted.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not Found!!!");
    }
}