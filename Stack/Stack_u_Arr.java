class StackArray{
    int [] arr;
    int top;
    int size;

    StackArray(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int x){
        if(top == size-1){
            System.out.println("Stack Overflowed");
            return;
        }

        arr[++top] = x;
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack Undeflowed");
            return -1;
        }

        return arr[top--];
    }

    int peek(){
        if(top == -1){
            System.out.println("Stack underflowed");
            return -1;
        }

        return arr[top];
    }

    boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }

    void display(){
        for (int i=0; i<=top; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class Stack_u_Arr{
    public static void main(String[] args) {
        StackArray sa = new StackArray(8);
        sa.push(10);
        sa.push(20);
        sa.push(30);
        sa.push(40);
        sa.push(50);
        sa.display();

        System.out.println("");
        sa.pop();
        sa.display();
        System.out.println("");

        System.out.println(sa.isEmpty());
        System.out.println("");

        System.out.println(sa.peek());
        sa.push(10);
        sa.push(20);
        sa.push(30);
        sa.push(40);
        sa.push(50);
    }
}