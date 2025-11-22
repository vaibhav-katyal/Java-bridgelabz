
import java.util.Stack;

class PostFixCalc{
    public int eval(String exp){
        Stack<Integer> st =  new Stack<>();

        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);

            if(ch == ' ') continue;

            if(Character.isDigit(ch)){
                st.push(ch-'0');
            }else{
                int b = st.pop();
                int a = st.pop();

                switch (ch) { 
                    case '+': st.push(a+b);
                    break;
                    case '-': st.push(a-b);
                    break;
                    case '*': st.push(a*b);
                    break;
                    case '/': st.push(a/b);
                    break;
                }
            }
        }

        return st.peek();
    }
}

public class Postfix{
    public static void main(String[] args) {
        PostFixCalc pf = new PostFixCalc();
        System.out.println(pf.eval("5 1 2 + 4 * + 3 -"));
    }
}