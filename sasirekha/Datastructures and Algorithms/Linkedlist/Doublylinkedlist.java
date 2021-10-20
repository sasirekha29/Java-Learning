package com.learn.java;

/**
 * This code builds double LinkedList from scratch
 * Classes: This contains three classes: DoublelinkedlistNode, Doublylinkedlist, DoublylinkedlistMain.
 */

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Description: This class is used to create node for the linked list of the required type
 * @param <T>
 */
class DoublelinkedlistNode<T>{
    public T data;
    DoublelinkedlistNode<T> next;
    DoublelinkedlistNode<T> previous;
    DoublelinkedlistNode(T data){
        this.data=data;
        this.previous=null;
        this.next=null;
    }
}
/**
 * Description: This class is used to create methods for the linked list of the required type
 * METHODS: addNode,addNodeAtStart,insertAtEnd,getcount,removeAtindex,removeByvalue,addNodeAtIndex,printArray,SearchByValue,removeAtstart,removeAtend
 * @param <T> this class accepts data of any specific type
 */
public class Doublylinkedlist<T> {
    DoublelinkedlistNode<T> head;
    private int count=0;

    /**
     * This method is used to get the total number of nodes or data present in the list
     * @return total count
     */
    public int getCount() {
        return count;
    }

    /**
     * This method adds a node to the linked list of the required type
     * @param data which takes data of any type
     */
    public void addNode(T data){

        DoublelinkedlistNode<T> newnode=new DoublelinkedlistNode<>(data);
        if(head==null)
        {
          head=newnode;
        }
        else {
            DoublelinkedlistNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            newnode.previous = current;
            current.next = newnode;
        }
        count++;
    }

    /**
     * This method is used to add node to the start of the linked list
     * @param data The data is the one which needs to be stored in the node of the linked list
     */
    public void addNodeAtStart(T data)
    {
        DoublelinkedlistNode<T> newnode=new DoublelinkedlistNode<>(data);
        if(head==null){head=newnode;}
        else{
            head.previous=newnode;
            newnode.next=head;
            head=newnode;
        }
        count++;
    }

    /**
     * This method adds the node at the specified index
     * @param index The index in which the new node should be added
     * @param data The data which has to be stored in the specified node (index)
     * @throws Exception This method throws IndexoutofBoundsException when the specified index is negative or greater than the nodes present
     */
    public void addNodeAtIndex(int index,T data) throws Exception {
        DoublelinkedlistNode<T> newnode = new DoublelinkedlistNode<>(data);
        if(index==0) addNodeAtStart(data);
        else if (index<0) throw new Exception("Invalid index");
        else if(index>count) throw new IndexOutOfBoundsException("Value of the index is greater than the size of the list");
        else if(index==count) insertAtEnd(data);
        else {
            DoublelinkedlistNode<T> current=head;
            for(int i=0;i<index-1;i++)
            {
                current=current.next;
            }

            newnode.next=current.next;
            current.next=newnode;
            newnode.previous=current;
            count++;
        }
    }

    /**
     * This method is used to add a node to the end of the linked list
     * @param data The data is which has to be stored in the node
     * @throws NullPointerException This method throws null pointer exception if the list is empty
     */
    public void insertAtEnd(T data)
    {
        if (head==null) throw new NullPointerException("The list is empty");
        DoublelinkedlistNode<T> newnode = new DoublelinkedlistNode<>(data);
        DoublelinkedlistNode<T> current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newnode;
        newnode.previous=current;
        count++;
    }

    /**
     * This method is used to remove the node which is present in the starting of the linked list
     * @throws NullPointerException This method throws NullPointerException when the linked list is empty
     */
    public void removeAtstart()
    {
        if(head==null) throw new NullPointerException("List is empty");
        DoublelinkedlistNode<T> current=head;
        head=current.next;
        count--;
    }
    /**
     * This method is used to remove the node which is present in the end of the linked list
     * @throws NullPointerException This method throws NullPointerException when the linked list is empty
     */
    public void removeAtEnd()
    {
        if(head==null) throw new NullPointerException("List is empty");
        DoublelinkedlistNode<T> current=head;
        while (current.next!=null)
        {
            current=current.next;
        }
        current.previous.next=null;
        count--;
    }
    /**
     * This method is used to remove the node which is present in the specified index of the linked list
     * @param index The index of the node which has to be removed
     * @throws NullPointerException This method throws NullPointerException when the linked list is empty
     */
    public void removeAtIndex(int index) {
        if(head==null) throw new NullPointerException("List is empty");
        if(index<0 || index>count) throw new IndexOutOfBoundsException("Entered index is not valid");
        DoublelinkedlistNode<T> current = head;
        for (int i=0;i<index;i++)
        {
            current=current.next;
        }
        current.previous.next=current.next;
        count--;
    }

    /**
     * This method is used to remove the node which contains the specified data
     * @param data The data which has to be removed
     * @throws NullPointerException This method throws this exception if the list is empty
     * @throws NoSuchElementException This method throws this exception if the specified data is not present in the list
     */
    public void removeByValue(T data)
    {
        if(head==null) throw new NullPointerException("The linkedlist is empty");
        DoublelinkedlistNode<T> current = head;
        boolean check=false;
        while (current.next!=null)
        {
            if(current.data==data)
            {
                current.previous.next=current.next;
                count--;
                check=true;
            }
            current=current.next;
        }
        if(check==false) throw new NoSuchElementException("the requested data is not found in the list for to be removed");
    }

    /**
     * This method is used to print the list
     */
    public void printLinkedList()
    {
        if(head==null) throw new NullPointerException("The linkedlist is empty");
        DoublelinkedlistNode<T> current =head;
        for(int i=0;i<count;i++)
        {
            System.out.print(current.data+" ");
            current=current.next;

        }
        System.out.println();
    }

    /**
     * This method is used to search data in the linked list
     * @param data the data which has to be searched
     */
    public void searchvalue(T data)
    {
        if(count==0) throw new NullPointerException("List is empty");
        DoublelinkedlistNode<T> current=head;
        for(int i=0;i<count;i++)
        {
            current=current.next;
            if(current.data==data) System.out.println("Value found at the index "+i);
            else System.out.println("Data not found");
        }
    }
}

/**
 * This class is the main function to run the above classes.
 */
class DoublylinkedlistMain{
    public static void main(String[] args) throws Exception {
        Doublylinkedlist<Integer> dlist =new Doublylinkedlist<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Doubly linked list");
        boolean k=true;
    do{
            System.out.println("Enter 1 to add the elements to the list" +
                            "Enter 2 to remove the element from the list" +
                            "Enter 3 to search an element in the list" +
                            "other operations enter 4" +
                            "Enter 5 for printing the list"+
                    " enter 0 to quit");

            System.out.println("Enter the choice to proceed");
            int i = scanner.nextInt();
        switch (i) {
            case 1 -> {
                System.out.println("Enter the number of elements to add to the list");
                int numberofelements = scanner.nextInt();
                for (int j = 0; j < numberofelements; j++) {
                    int value = scanner.nextInt();
                    dlist.addNode(value);
                }
                dlist.printLinkedList();
            }
            case 2 -> {
                System.out.println("enter one to enter the data or two to enter the index");
                int response = scanner.nextInt();
                if (response == 1) {
                    System.out.println("Enter the data");
                    int todelete = scanner.nextInt();
                    dlist.removeByValue(todelete);
                } else if (response == 2) {
                    System.out.println("enter the index");
                    int todelete = scanner.nextInt();
                    dlist.removeAtIndex(todelete);
                } else System.out.println("Enter valid response");
                dlist.printLinkedList();
            }
            case 3 -> {
                System.out.println("enter one to enter the data or two to enter the index");
                int searchelement = scanner.nextInt();
                dlist.searchvalue(searchelement);
            }
            case 4 -> {
                System.out.println("1. ");
                int responses = scanner.nextInt();
                if (responses == 1) {
                    System.out.println("enter the value to insert at the end");
                    int value = scanner.nextInt();
                    dlist.insertAtEnd(value);
                }
                if (responses == 2) {
                    System.out.println("enter the value to insert at the start");
                    int value = scanner.nextInt();
                    dlist.addNodeAtStart(value);
                }
                if (responses == 3) {
                    System.out.println("Enter the value to insert at specific index");
                    int value = scanner.nextInt();
                    System.out.println("Enter the specific index");
                    int index = scanner.nextInt();
                    dlist.addNodeAtIndex(index, value);
                }
                if (responses == 4) {
                    System.out.println("Enter 1 to remove the element at the start and 2 for end");
                    int value = scanner.nextInt();
                    if (value == 1) dlist.removeAtstart();
                    if (value == 2) dlist.removeAtEnd();
                    else System.out.println("Enter valid response");
                }
                dlist.printLinkedList();
            }
            case 5 -> {
                System.out.println("___________________");
                dlist.printLinkedList();
            }
            case 0 -> k = false;
        }
        }while (k);


    }
}
