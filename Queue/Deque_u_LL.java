class Node{
    int data;
    Node next, prev;

    Node(int data){
        this.data = data;
    }
}

class DequeLL{
    Node front, rear;

    void insertAtFront(int val){
        Node newNode = new Node(val);

        if(front == null){
            front = rear = newNode;
            return;
        }

        newNode.next = front;
        front.prev = newNode;
        front = newNode;
    }

    void insertAtRear(int val){
        Node newNode = new Node(val);

        if(rear == null){
            front = rear = newNode;
            return;
        }

        newNode.prev = rear;
        rear.next = newNode;
        rear = newNode;
    }

    int deleteFromFront(){
        if(front == null){
            System.out.println("Deque Empty");
            return -1;
        }

        int val = front.data;
        front = front.next;

        if(front == null) rear = null;
        else front.prev=null;

        return val;
    }

    int deleteFromRear(){
        if(rear == null){
            System.out.println("Deque Empty");
            return -1;
        }

        int val = rear.data;
        rear = rear.prev;

        if(rear == null) front = null;
        else rear.next=null;

        return val;
    }
}

public class Deque_u_LL{
    public static void main(String[] args) {
        DequeLL dl = new DequeLL();
        dl.insertAtFront(10);
        dl.insertAtFront(20);
        dl.insertAtRear(40);
        dl.insertAtRear(60);

        System.out.println(dl.deleteFromFront());
        System.out.println(dl.deleteFromRear());
    }
}

