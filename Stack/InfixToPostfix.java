import java.util.Stack;

class InToPost{

    static int prec(char c){                      // made static so that we can call it directly without making any object
        switch(c){
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;

        }

        return -1;
    }

    public String convert(String infix){
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(char c:infix.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                result.append(c);
            }

            else if(c == '('){
                st.push(c);
            }

            else if(c == ')'){
                while(!st.empty() && st.peek() != '('){
                    result.append(st.pop());
                }
                st.pop();
            }

            // if operator
            else{
                while(!st.empty() && prec(c) <= prec(st.peek())){
                    result.append(st.pop());
                }
                st.push(c);
            }
        }

        // all remaiming 

        while(!st.empty()){
            result.append(st.pop());
        }


        return result.toString();
    }
}

public class InfixToPostfix{
    public static void main(String[] args){
        InToPost in = new InToPost();

        String exp = "(A+B)*(C+D)";
        System.out.println(in.convert(exp));
    }
}