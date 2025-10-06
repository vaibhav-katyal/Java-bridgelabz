public class buffer{
    public static void main(String[] args) {
        StringBuffer strb1 = new StringBuffer();        // 16 capacity (chars)  --> default capacity

        StringBuffer strb2 = new StringBuffer("Hello");       // assigned string

        StringBuffer strb3 = new StringBuffer(25);        // assigned 25 capacity

        strb3.append("Hi");

        strb1.insert(0, "Bye Bye");

        System.out.println(strb2);
        System.out.println(strb1);
        System.out.println(strb3);


    }
}