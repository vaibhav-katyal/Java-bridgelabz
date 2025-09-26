public class med_four{
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Usage java Program <num1> <num2>");
        }else{
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);

            double pdt = a*b;

            System.out.println(pdt);

        }
    }
}