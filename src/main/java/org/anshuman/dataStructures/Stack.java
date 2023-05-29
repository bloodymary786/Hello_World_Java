package org.anshuman.dataStructures;

public class Stack<T> {
    private Node<T> head;
    private int size=0;

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

    public Node<T> pop(){
        if(head==null){
            System.out.println("Stack is Empty MF");
            return null;
        }
        Node<T> current = head;
        Node<T> temp;
        while(current.next.next!=null){
            current = current.next;
        }
        System.out.println("Removed " + current.data);
        temp = current.next;
        current.next = null;
        size--;
        return temp;
    }

    public int getSize(){
        return size;
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
