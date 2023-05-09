package com.Alpha.Linkedlist;


public class LinkedL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node Head;
    public static Node Tail;
    public static int size;

    public void AddNodeFirst(int data){
        // created new node
        Node new_node = new Node(data);
        size++;
        //there will be case the linked list is empty then the head and tail will point to new created node
        if (Head == null){
            Head = Tail = new_node;
            return;
        }
        // the next address of new node will point to head.
        new_node.next = Head;
        // then the new node will be the head node
        Head = new_node;
    }

    public void AddNodeLast(int data){
        //create a new node
        Node new_node = new Node(data);
        size++;
        //if the LL is empty
        if (Head == null){
            Head = Tail = new_node;
            return;
        }
        //current tail next will be the new created node
        Tail.next = new_node;
        //now new node will be the tail node
         Tail = new_node;
         Tail.next = null;
    }

    public void printlist(){
        if (Head == null){
            System.out.println("the LL is empty");
            return;
        }
        Node temp = Head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

//    public void SizeOfLL(){
//       int count = 0;
//        Node temp = Head;
//        while (temp != null){
//            count++;
//            temp = temp.next;
//        }
//        System.out.println("the size is: " + count);
//    }

    public void InsertAtIndex(int index , int data){
        if (index ==0){
            AddNodeFirst(data);
            return;
        }
        Node new_node = new Node(data);
        size++;
        Node Temp = Head;
        int i =0;
        while (i < index - 1){
            Temp = Temp.next;
            i++;
        }
        new_node.next = Temp.next;
        Temp.next = new_node;
    }

    public void RemoveNodeFirst(){
        if (Head == null){
            Tail = null;
            System.out.println("the list is empty");
            return;
        }
        Head = Head.next;
        size--;
    }

    public void  RemoveNodeLast(){

    }

    public static void main(String[] args) {
        LinkedL list = new LinkedL();
        list.AddNodeFirst(1);
        list.AddNodeLast(2);
        list.AddNodeLast(3);
        list.AddNodeLast(4);
//        list.InsertAtIndex(0 ,6);
        list.printlist();
        list.RemoveNodeFirst();
        list.printlist();
//        list.SizeOfLL();
    }
}
