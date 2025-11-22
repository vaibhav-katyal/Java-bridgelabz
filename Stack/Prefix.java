
import java.util.Stack;

class PreFixCalc{
    public int eval(String exp){
        Stack<Integer> st = new Stack<>();

        for(int i=exp.length()-1; i>=0; i--){
            char ch = exp.charAt(i);

            if(ch == ' ') continue;

            if(Character.isDigit(ch)){
                st.push(ch-'0');
            }else{
                int a = st.pop();
                int b = st.pop();

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

public class Prefix{
    public static void main(String[] args) {
        PreFixCalc pf = new PreFixCalc();
        System.out.println(pf.eval("+ 9 * 2 3"));
    }
}