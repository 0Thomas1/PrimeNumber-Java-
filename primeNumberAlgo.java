import java.util.Scanner;

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
    /*public static int[] findPrime(int lower, int higher){
        //find all the prime no. in the range and organize them in a list
        int[] numLst = new int[higher - lower + 1];
        int numLstLen = numLst.length;
        int[] primeLst = new int[1];
        for (int i = 0; i < numLstLen; i++) {
            numLst[i] = i + lower;
        }
        for (int i = 0; i < numLstLen; i++) {
            if (checkPrime(numLst[i])) {
                int newPrimeLst[] = new int[primeLst.length+1];
                for(int j = 0; j < primeLst.length; j++) {
                    newPrimeLst[j] = primeLst[j];
            }
        }
        return newPrimeLst;
    }*/
}
