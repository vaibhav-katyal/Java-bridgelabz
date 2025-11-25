class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class CircularLL{
    Node front,rear;

    void enqueue(int val){
        Node newNode = new Node(val);

        if(rear == null){
            front = rear = newNode;
            rear.next = front;
            return;
        }else{
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
    }

    int dequeue(){
        int ele;
        if(front == null && rear == null){               // queue empty
            System.out.println("Queue Empty");
            return -1;
        }
        else if(front == rear){
            ele = front.data;
            front = rear = null;
        }
        else{
            ele = front.data;
            front = front.next;
            rear.next = front;
        }

        return ele;

    }

    int peek(){
        if(front == null){
            System.out.println("Queue empty");
            return -1;
        }

        return front.data;  
    }

    void display(){
        if(front == null && rear == null){
            System.out.println("Queue empty");
            return;
        }
        else{
            Node temp = front;
            while(temp.next != front){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }   
    }
}


public class Circular_queue_LL{
    public static void main(String[] args) {
        CircularLL cl = new CircularLL();
        cl.enqueue(10);
        cl.enqueue(30);
        cl.enqueue(40);
        cl.enqueue(50);
        cl.display();

        cl.dequeue();
        cl.dequeue();
        cl.display();

        System.out.println(cl.peek());
    }
}