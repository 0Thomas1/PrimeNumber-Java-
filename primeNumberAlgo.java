import java.util.*;

public class primeNumberAlgo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Which number do you want to check?");
        int num = in.nextInt();
        if (checkPrime(num)) {
            System.out.println(num + " is a prime number.");
        }
        else {
            System.out.println(num + " is  not a prime number.");
        }
        System.out.print("lower?");
        int low = in.nextInt();
        System.out.print("higher?");
        int high = in.nextInt();
        System.out.println(findPrimeInRange(low, high));
        System.out.println(findTwinPrimeInRange(low, high));
    }
    public static Boolean checkPrime(int num){
        //check if the input no. is prime or not,and return boolean expression
        int rem = 1;
        if (num <= 1){
            return false;
        }
        for (int i = 2; i <num && rem !=0; i++) {
            rem = num % i;
        }
        return rem != 0;
    }
    public static List<Integer> findPrimeInRange(int lower, int higher){
        //find all the prime no. in the range return a list
        List<Integer> primeLst = new ArrayList<Integer>();
        for (int i = lower; i <= higher; i++) {
            if (checkPrime(i)) {
                primeLst.add(i);
            }
        }
        return primeLst;
    }
    public static List<Integer> findTwinPrimeInRange (int lower, int higher){
        // input range, return a list with all twin prime
        List<Integer> primeLst = findPrimeInRange(lower, higher);
        List<Integer> twinPrimeLst = new ArrayList<Integer>();

        for (int i = 0; i < primeLst.size()-1; i++){
            if (primeLst.get(i+1) - primeLst.get(i) == 2){
                twinPrimeLst.add(primeLst.get(i));
                twinPrimeLst.add(primeLst.get(i+1));
            }
        }
        return twinPrimeLst;


    }
}
