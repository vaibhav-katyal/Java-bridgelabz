public class med_seven{
    static boolean findPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int a = 100;
        while(!findPrime(a)){
            a++;
        }

        System.out.println(a);
    }
}