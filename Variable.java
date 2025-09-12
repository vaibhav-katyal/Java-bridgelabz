public class Variable{
    public static void main(String[] args) {
        int num = 67;
        String name = "Vaibhav";

        System.out.println(num);
        System.out.println(name);

        int later;
        later = 167;
        System.out.println(later);

        int ovveride = 15;
        ovveride = 89;
        System.out.println(ovveride);

        // final keyword to declare as const so that cant override
        final int a = 15;
        // a= 12;       cant change
    }
}