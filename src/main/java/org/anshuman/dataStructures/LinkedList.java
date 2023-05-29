package org.anshuman.dataStructures;

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public void LinkedList(){
        this.head=null;
        this.size=0;
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if(head==null){
            head = newNode;
            size++;
            return;
        }
        Node<T> current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
        size++;
    }
    public void display(){
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node<T> current = head;
        while(current.next != null){
            System.out.print(current.data + " => ");
            current = current.next;
        }
        System.out.print(current.data);
        System.out.println();
    }

    public void displayAddress(){
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node<T> current = head;
        while(current.next != null){
            System.out.print(current+ " => ");
            current = current.next;
        }
        System.out.print(current);
        System.out.println();
    }
    }

