package com.learn.java;

/**
 * This class is used to create node for the circular linked list
 *
 */
class CircularNode<T>{
    public T data;
    public CircularNode<T> next;
    CircularNode(T data){
        this.data=data;
        this.next=null;
    }
}

/**
 * this class is used to implement the methods of the circular linked list
 */
class CircularLinkedList<T>{
    CircularNode<T> last;
    private int count;

    public int getCount() {
        return count;
    }

    /**
     * This method is used to add a node(data) to the circular linked list
     * @param data The data which has to be added to the list
     */
    public void addNode(T data)
    {
        CircularNode<T> newnode= new CircularNode<>(data);
        if(last==null)
            newnode.next=newnode;
        else{
        newnode.next=last.next;
        last.next=newnode;
        }
        last=newnode;
        count++;
    }

    /**
     * This method adds a data to the start of the circular linked list
     * @param data The data which has to be added to the list
     */
    public void addAtStart(T data)
    {
        CircularNode<T> newnode = new CircularNode<>(data);
        if(last==null){newnode.next=last.next;
        last=newnode;
        }
        else{
            newnode.next=last.next;
            last.next=newnode;
        }
        count++;
    }


    /**
     * This method inserts the data after the specified data
     * @param data The data after which the new data has to be inserted
     * @param insertdata The data which has to be inserted
     * @throws NullPointerException The method throws null pointer exception if the linked list is empty
     */
    public void addAtAfter(T data,T insertdata)
    {
        if(last==null) throw new NullPointerException("Empty linked list");
        if(last!=null)
        {
            CircularNode<T> current=last;
            do{
                if(current.data==data)
                {
                    CircularNode<T> newnode=new CircularNode<>(insertdata);
                    newnode.next=current.next;
                    current.next=newnode;
                    count++;
                    break;
                }
                current=current.next;
            }while(current!=last);
        }
    }

    /**
     * This method is used to add a new data to the circular linked list
     * @param index The index in which the new data has to be added
     * @param data The data which has to be added
     * @throws IndexOutOfBoundsException This method throws this exception if the list count is greater or negative
     *
     */
    public void addAtIndex(int index,T data){
        if(index==0) addAtStart(data);
        else if(index==count) addNode(data);
        else if(index>count|| index<0) throw new IndexOutOfBoundsException("The entered index is greater than the count of the nodes");
        else {
            CircularNode<T> current = last;
            for (int i = 0; i < index; i++)
            {
                current = current.next;
            }
            CircularNode<T> newnode=new CircularNode<>(data);
            newnode.next=current.next;
            current.next=newnode;
            count++;
        }
    }

    /**
     * This method is used to remove the node at the end of the list
     * @throws NullPointerException The method returns this exception if the list is empty
     */

    public void removeAtEnd()
    {
        if(last==null) throw new NullPointerException("The list is empty");
        else{
            CircularNode<T> current=last;
            while(current.next!=last)
            {
                current=current.next;
            }
            current.next=last.next;
            last=current;
            count--;
        }
    }

    /**
     * This method is used to remove node in the starting of the circular linked list
     */
    public void removeAtStart()
    {
        if (last==null) throw new NullPointerException("List is empty");
        else {
            last.next=last.next.next;
            count--;
        }
    }

    /**
     * This method is used to remove the node after specified data
     * @param data The data after which the data has to be deleted
     */
    public void removeAfter(T data){
        if(last==null) throw new NullPointerException("List is empty");
        else{
            CircularNode<T> current=last;
            do{
                if(current.data==data)
                {
                    if(current.next==last){
                        current.next=last.next;
                        last=current;
                        count--;
                    }
                    else {
                        current.next = current.next.next;
                        count--;
                    }
                }
                current=current.next;

            }while (current!=last);
        }
    }
    public void removeAtIndex(int index)
    {
        if(index<0||index>count) throw new IndexOutOfBoundsException("list is empty");
        else if(index==0) removeAtStart();
        else if(index==count) removeAtEnd();
        else{
            CircularNode<T> current=last;
            for(int i=0;i<index;i++)
            {
                current=current.next;
            }
            current.next=current.next.next;
            count--;
        }

    }

    /**
     * This method prints the circular linked list
     */
    public void printList()
    {
        if(last==null) System.out.println("List is empty");
        CircularNode<T> current=last;
        for(int i=0;i<count;i++)
        {
            current=current.next;
            System.out.print(current.data+" ");
        }
        System.out.println();
    }
}



/**
 * This class acts as the driver class for the circular linked list
 */
public class circularLinkedlistMain {
    public static void main(String[] args) {
    CircularLinkedList<Integer> list =new CircularLinkedList<>();
    list.addNode(1);
    list.addNode(2);
    list.addAtStart(5);
    //list.printList();
    list.addAtIndex(1,3);
    //list.addAtAfter(1,3);
    list.printList();
    list.removeAtIndex(1);
        list.printList();
    //list.removeAtEnd();
       // list.removeAtStart();
      // list.removeAfter(3);
    //list.printList();

}
}
