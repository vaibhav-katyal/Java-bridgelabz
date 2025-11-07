class Node{
    int data;
    Node next;
}

class LinkedList1{
    Node head;

    public void insert(int val){
        Node newNode = new Node();

        newNode.data = val;
        newNode.next = null;

        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}

public class two{
    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(60);
        ll.display();
    }
}