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

    public void insertAtstart(int val){
        Node newNode = new Node();

        newNode.data = val;
        newNode.next = head;

        head = newNode;
    }

    public void insertAtIndex(int ind, int val){

        if(ind == 0){
            insertAtstart(val);
        }else{
            Node temp = head;
            for(int i=0; i<ind-1; i++){
                if(temp == null){
                    System.err.println("Out of range");
                    return;
                }

                temp = temp.next;
            }

            Node newNode = new Node();
            newNode.data = val;
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void DeleteFromStart(){
        if(head == null) return;
        head = head.next;
    }

    public void DeleteFromEnd(){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;
    }

    public void DeleteFromIndex(int ind){
        Node temp = head;
        for(int i=0; i<ind-1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }

    public void Search(int val){
        Node temp = head;
        while(temp != null){
            if(temp.data == val){
                System.out.println("Found");
                return;
            }

            temp = temp.next;
        }
        System.out.println("Not found");
    }

    public void reverse(){
        Node prev = new Node();
        Node curr = new Node();
        Node nextNode = new Node();

        prev = null;
        curr = head;
        nextNode = curr.next;

        while(curr != null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        head = prev;
    }

    public int size(){
        Node temp = head;
        int ans = 0;
        while(temp != null){
            ans++;
            temp = temp.next;
        }

        return ans;
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
        ll.insert(550);
        ll.display();
        System.out.println("");

        ll.insertAtstart(200);
        ll.display();
        System.out.println("");

        ll.insertAtIndex(2, 89);
        ll.display();
        System.out.println("");

        ll.DeleteFromStart();
        ll.display();
        System.out.println("");

        ll.DeleteFromEnd();
        ll.display();
        System.out.println("");

        ll.DeleteFromIndex(2);
        ll.display();
        System.out.println("");

        ll.Search(30);
        ll.Search(302);
        System.out.println("");

        ll.reverse();
        ll.display();
        System.out.println("");

        System.out.println("Size of LL: " + ll.size());

    }
}