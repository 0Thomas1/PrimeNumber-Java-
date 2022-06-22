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
        System.out.println(findPrimeFactors(77));
    }
    public static Boolean checkPrime(int num){
        //check if the input no. is prime or not, and return boolean expression
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
        List<Integer> primeLst = new ArrayList<>();
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
        List<Integer> twinPrimeLst = new ArrayList<>();

        // iterate the  prime list then put twin primes into the twin prime list
        for (int i = 0; i < primeLst.size()-1; i++){
            int bigP = primeLst.get(i+1);
            int smallP = primeLst.get(i);
            if (bigP - smallP == 2){
                twinPrimeLst.add(smallP);
                twinPrimeLst.add(bigP);
            }
        }
        return twinPrimeLst;
    }
    public static List<Integer> findPrimeFactors(int number){
        List<Integer> primeLst = findPrimeInRange(0, number);
        List<Integer> primeFactorLst = new ArrayList<>();
        for(int i = 0; i< primeLst.size(); i++){
            for (int j = i+1; j < primeLst.size()&& primeFactorLst.size()==0;){
                if (primeLst.get(i) * primeLst.get(j) != number) {
                    j+=1;
                }
                else{
                        primeFactorLst.add(primeLst.get(i));
                        primeFactorLst.add(primeLst.get(j));
                }
            }
        }
        return primeFactorLst;
    }
}
