public class med_two{
    public static void main(String[] args) {
        int max_len = 0;
        String max_str = "";

        for(int i=0; i<args.length; i++){
            if(args[i].length() > max_len){
                max_len = args[i].length();
                max_str = args[i];
            }
        }

        System.out.println(max_str);
    }
}