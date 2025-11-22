import java.util.Stack;

class fact{
    public int calcFact(int n){
        Stack<Integer> st = new Stack<>();

        while(n>1){
            st.push(n);
            n--;
        }

        int result = 1;
        while(!st.empty()){
            result *= st.pop();
        }

        return result;
    }
}

public class NonRecursive{
    public static void main(String[] args) {
        fact f = new fact();
        System.out.println(f.calcFact(7));
    }
}