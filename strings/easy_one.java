public class easy_one{
    public static void main(String[] args) {
        String str1 = "Hello";
        char[] arr = str1.toCharArray();

        System.out.println("Old char array: ");
        System.out.println(arr);

        arr[0] = 'B';
        System.out.println("New char array: ");
        System.out.println(arr);

    }
}