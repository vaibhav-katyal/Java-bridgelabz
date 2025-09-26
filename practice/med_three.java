public class med_three{
    public static void main(String[] args){
        if(args[args.length-1].equals("--debug")){
            System.out.println("DEBUG mode on");
        }else{
            System.out.println("DEBUG mode off");
        }
    }
}