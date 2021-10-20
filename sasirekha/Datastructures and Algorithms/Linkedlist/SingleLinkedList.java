package com.learn.java;

import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * This class creates a node for the linked list
 */
class Node <T>{
    public T data;
    public Node<T> next = null;
    Node(T data)
    {
        this.data=data;
    }

}

/**
 * This class is used to perform operations on the single linked list
 * Methods: addNode, addNodeAtStart, addNodeAtSpecific, removeNode,getcount,print,removeNodeATEnd,removenodeAtStart,MiddleElement
 * Params T This class takes data of the required type
 */

public class SingleLinkedList<T> {
    Node<T> head;
    private int count=0;
    public void addNode(T data)
    {
        Node<T> newNode=new Node<>(data);
        if (head==null){
            head=newNode;
        }
        else{
            Node<T> current=head;
            while(null != current.next)
                current=current.next;
            current.next=newNode;
        }
        count++;
    }
    public void addNodeAtStart(T data)
    {
        Node<T> newNode=new Node<>(data);
        newNode.next=head;
        head=newNode;
        count++;
    }
    public void addNodeAtSpecific(T data,int index)
    {
        Node<T> newnode = new Node<>(data);
        Node<T> current =head;
        for (int i=0;i<index-1;i++)
        {
            current=current.next;
        }
        Node<T> nextnode=current.next;
        current.next=newnode;
        newnode.next=nextnode;
        count++;
    }
    public int getCount()
    {
        return count;
    }
    public void print()
    {
        Node<T> current=head;
       for(int i=0;i<count;i++)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();

    }
    public void removeNode(T data)
    {
        if (count==0) throw new IndexOutOfBoundsException("The linked list is empty to remove data");
        Node<T> current =head;
        Node<T> todelete=null;

            for (int i = 0; i < count; i++) {
                if (current.data == data) {
                    assert todelete != null;
                    todelete.next = current.next;
                    count--;
                    break;
                }
                todelete = current;
                current = current.next;
            }
            if (todelete == null) throw new NoSuchElementException("The given data is not found!!");


    }
    public void removeNodeAtEnd()
    {
        if (count==0) throw new IndexOutOfBoundsException("The linked list is empty");
        Node<T> current =head;
        Node<T> todelete=null;

            for (int i = 0; i < count; i++) {
                if (Objects.requireNonNull(current).next == null) {
                    Objects.requireNonNull(todelete).next = null;
                    count--;
                }
                todelete = current;
                current = current.next;
            }
        }
        public T MiddleElement()
        {
            if(count==0) throw new IndexOutOfBoundsException("Linked list is empty");
            Node<T> current=head;
            for (int i=0;i<count/2;i++){
                current=current.next;
            }
            return current.data;
        }


}
class MainDriver{
    public static void main(String[] args) {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        list.addNode(10);
        list.addNode(20);
        list.addNode(40);
        list.addNodeAtStart(30);
        list.addNodeAtSpecific(15,2);
        list.removeNodeAtEnd();
        list.print();
        //System.out.println(list.getCount());
        System.out.println(list.MiddleElement());
    }
}