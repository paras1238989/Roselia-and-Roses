import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;



class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        Integer limit = s.nextInt();                 // Reading input from STDIN
        Integer quotient[];
        for(int i=0;i<limit;i++){
            int no_of_cities=s.nextInt();
            quotient = new Integer[no_of_cities];
            for(int j=0;j<no_of_cities;j++){
                quotient[j]=s.nextInt();
            }
            System.out.println(findMax(quotient));
        }

        // Write your code here
        
    }

    private static int findMax(Integer[] quotient) {
        Integer sums[]=new Integer[quotient.length];
        int positiveSums0;
        int negativeSums0;
        //start from 0
//        int positiveSums0=positiveSum(quotient,0);
//        int negativeSums0=negativeSum(quotient,1);
//        
//        //start from 1
//        int positiveSums1=positiveSum(quotient,1);
//        int negativeSums1=negativeSum(quotient,2);
        for(int i=0;i<(quotient.length);i++){
            positiveSums0=positiveSum(quotient, i);
            negativeSums0=negativeSum(quotient, i+1);
            sums[i]=(positiveSums0+negativeSums0);
        }
        return Collections.max(Arrays.asList(sums));
//        if((positiveSums0+negativeSums0)>(positiveSums1+negativeSums1)){
//            return (positiveSums0+negativeSums0);
//        }
//        else{
//            return (positiveSums1+negativeSums1);
//        }
    }

    private static int positiveSum(Integer[] quotient, int startingPoint) {
        int sum = 0;
        for(int i=startingPoint;i<quotient.length;i=i+2){
            if(quotient[i]>0){
                sum=sum+quotient[i];
            }
        }
        return sum;
    }

    private static int negativeSum(Integer[] quotient, int startingPoint) {
        
        int sum = 0;
        for(int i=startingPoint;i<quotient.length;i=i+2){
            if(quotient[i]<0){
                sum=sum+Math.abs(quotient[i]);
            }
        }
        return sum;    }
}
