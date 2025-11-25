// Deque key conditions :-->
// 1. Empty Deque: front == -1
// 2. Full deque: (front == 0 && rear == size-1) || (front == rear + 1)

class Deque_Implementation{
    int [] arr;
    int front, rear, size;

    Deque_Implementation(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    boolean isFull(){
        return (front== 0 && rear == size-1)||(front == rear+1);
    }

    boolean isEmpty(){
        return front == -1;
    }

    void insertAtFront(int val){
        if(isFull()){
            System.out.println("Overflow");
            return;
        }

        if(isEmpty()){
            front = rear = 0;
        }
        else if(front == 0){
            front = size-1;
        }
        else{
            front--;
        }

        arr[front] = val;
    }

    void insertAtRear(int val){
        if(isFull()){
            System.out.println("Overflow");
            return;
        }

        if(isEmpty()){
            front = rear = 0;
        }
        else if(rear == size-1){
            rear = 0;
        }
        else{
            rear++;
        }                                   // or we can just write rear = (rear+1)%size in place of all these else if and else

        arr[rear] = val;
    }

    int deleteFront(){
        if(isEmpty()){
            System.out.println("Underflow");
            return -1;
        }

        int val = arr[front];

        if(front == rear){
            front = rear = -1;
        }
        else{
            front = (front+1)%size;
        }

        return val;
    }

    int deleteRear(){
        if(isEmpty()){
            System.out.println("Underflow");
            return -1;
        }

        int val = arr[rear];

        if(front == rear){
            front = rear = -1;
        }
        else if(rear == 0){
            rear = size-1;
        }
        else{
            rear--;
        }

        return val;

    }

    void display(){
        int i = front;
        while(i != rear){
            System.err.print(arr[i] + " ");
            i = (i+1)%size;
        }
        System.out.println(arr[i]);
    }
}

public class Deque_Circular_Array{
    public static void main(String[] args) {
        Deque_Implementation di = new Deque_Implementation(5);
        di.insertAtFront(10);
        di.insertAtFront(30);
        di.insertAtRear(90);
        di.display();
        di.insertAtRear(56);
        di.display();
        di.deleteFront();
        di.display();
        di.deleteRear();
        di.display();
        di.insertAtFront(10);
        di.insertAtFront(30);
        di.insertAtRear(90);
        di.display();
        di.insertAtRear(220);
        di.display();
    }
}