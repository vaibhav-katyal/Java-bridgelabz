class Node{
    int data;
    Node next;

    Node(int val){
        data = val;
        next = null;
    }
}

class LinkedList{


    Node head;

    public LinkedList() {
        head = null;
    }

    void traverse(){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }

        System.out.println("Null");
    }

    void insertAtBegining(int value){
        Node newNode = new Node(value);
        newNode = head;
        head = newNode;
    }
    
}

public class intro{
    public static void main(String[] args) {
        
    }
}