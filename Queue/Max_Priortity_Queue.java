class MaxPriority{
    int [] arr;
    int capacity, size;

    public MaxPriority(int capacity) {
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

        int maxIndex = 0;
        for(int i=1; i<size; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }

        int maxEle = arr[maxIndex];
        // now here we will play a smart move, in array, we cant direclty reemove an element from middle so we will move the last element in place of that removed element and do the size--

        arr[maxIndex] = arr[size-1];
        size--;

        return maxEle;
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

public class Max_Priortity_Queue{
    public static void main(String[] args) {
        MaxPriority mp = new MaxPriority(5);
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