public class Multidem{
    public static void main(String[] args) {
        int [][] arr = {{2,3,5,6}, {1,2,3}, {9,10,12}};
        System.out.println(arr[1]);               //  the outer array stores rfernece to the inner arrays'
        // to get the value
        System.out.println(arr[1][2]);

        System.out.println("With Loops:");
        // System.out.println(arr[0].length);

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }

            System.out.println("");
        }
    }
}