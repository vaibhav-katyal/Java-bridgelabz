class StackQ1{
    int top;
    int size;
    int [] arr;

    StackQ1(int size){
        this.size = size;
        arr = new int [size];
        top = -1;
    }

    public void insert(int val){
        if(top == size-1){
            System.out.println("Cant do");
        }else{
            arr[++top] = val;
        }
    }

    public void undo(){
        System.out.println("Undoed the previous change.");
        top--;
        System.out.print("Old top: " + arr[top]);
    }

    public void redo(){
        System.out.println("Redoed the previous change.");
        top++;
        System.out.print("New top: " + arr[top]);
    }
}

public class one{
    public static void main(String[] args) {
        StackQ1 s1 = new StackQ1(5);
        s1.insert(10);
        s1.insert(50); 
        s1.insert(70); 
        s1.undo();
        s1.redo();
    }
}