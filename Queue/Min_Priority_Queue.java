class MinPriority{
    int [] arr;
    int capacity, size;

    public MinPriority(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    void insert(int val){
        if(size == capacity){
            System.out.println("Overflow");
            return;
        }

        arr[size++] = val;
    }

    int delete(){
        if(size == 0){
            System.out.println("Underflow");
            return -1;
        }

        int minIndex = 0;
        for(int i=1; i<size; i++){
            if(arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }

        int minEle = arr[minIndex];

        arr[minIndex] = arr[size-1];
        size--;

        return minEle;
    }

    void display(){
        if(size == 0){
            System.out.println("Empty");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
    }
}

public class Min_Priority_Queue{
    public static void main(String[] args) {
        MinPriority mp = new MinPriority(5);
        mp.insert(50);
        mp.insert(10);
        mp.insert(100);
        mp.insert(52);
        mp.display();
        mp.delete();
        mp.display();
        mp.delete();
        mp.display();
        mp.delete();
        mp.display();
    }
}