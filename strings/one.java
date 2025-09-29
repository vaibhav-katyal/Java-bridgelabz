public class one{
    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println(str1);

        String str2 = new String("Hi");
        System.out.println(str2);

        char[] str3 = {'B', 'Y', 'E'};
        System.out.println(str3);
 
        String str4 = str3.toString();
        System.out.println(str4);           // prints hashcode of object array

        // to print string
        String str5 = new String(str3);
        System.out.println(str5);

        char[] arr = str2.toCharArray();
        System.out.println(arr);

        System.out.println(str1+str2);
        System.out.println(str2.concat(str5));
    }
}