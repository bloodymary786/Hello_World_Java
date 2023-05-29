package org.anshuman.dataStructures;

public class Queue<T> {
    private Node<T> head;
    private int size;

    public void getSize(){
        System.out.println("Size of queue :: " + size);
    }

    public void add(T data){
        Node<T> temp = new Node<>(data);
        if(head==null){
            head = temp;
            size++;
            return;
        }
        Node<T> current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = temp;
        size++;
    }

    public void remove(){
        if(head==null){
            System.out.println("Queue is Empty MF");
            return;
        }
        head = head.next;
        size--;
    }

    public void display(){
        if(head==null){
            System.out.println("Stack is Empty");
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

}
