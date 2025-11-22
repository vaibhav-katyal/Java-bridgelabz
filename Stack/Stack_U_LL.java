
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

// the top node is always the head of linked lists
class StackLL {

    Node top;

    void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack underflfowed");
            return -1;
        }

        int val = top.data;
        top = top.next;
        return val;
    }

    int peek() {
        if (top == null) {
            System.out.println("Stack underflfowed");
            return -1;
        }

        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }

    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class Stack_U_LL {
    public static void main(String[] args) {
        StackLL sl = new StackLL();

        sl.push(10);
        sl.push(20);
        sl.push(30);
        sl.push(40);

        sl.display();

        System.out.println("");
        System.out.println(sl.pop());
        sl.display();

        System.out.println("");
        System.out.println(sl.peek());
        sl.display();

        System.out.println("");
        System.out.println(sl.isEmpty());

    }

}
