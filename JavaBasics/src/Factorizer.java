import java.util.Scanner;
public class Factorizer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userNum;

        //user input for the number
        System.out.println("What number would you like to factor? ");
        userNum = Integer.parseInt(sc.nextLine());


        System.out.println("The factors of " + userNum+ " are: ");
        int count = printFactors(userNum); //using count makes it easier to type out during println

        System.out.println(userNum + " has " + count + " factors.");

        //true or false if perfect
       // since the method returns at true or a false.
        if(isPerfectNum(userNum)){
            System.out.println(userNum + " is a perfect number");
        } else {
            System.out.println(userNum + " is not a perfect number");
        }

        //true of false if prime as the method returns a boolean.
        if(isPrimeNum(userNum)){
            System.out.println(userNum + " is a prime number");
        } else {
            System.out.println(userNum + " is not a prime number");
        }

    }

    public static int printFactors(int x) {
        int count = 0; // Count the number of factors
        for (int i = 1; i <= x / 2; i++) { //only go up to number divide by two as no factors will be bigger than number divided by 2
            if (x % i == 0) { //checks if no remainders
                System.out.print(i + " "); //prints the factors with a space
                count++; //Adds one onto the count
            }
        }
        System.out.println(x);
        return count+1; // total amount of factors +1 will include the number itself
    }

    public static boolean isPerfectNum(int x) {
        int sum = 0; // used to add numbers that divide user number with no remainders
        for (int i = 1; i <= x / 2; i++) { //only go up to number divide by two as no factors will be bigger than number divided by 2
            if (x % i == 0) { // checks if no remainders are left
                sum += i;   // if  no remainders, add the iterator number i to int Sum
            }
        }
        return sum == x; //once the loop is completed if the sum is equal to the user input it returns true, else false.
    }


    public static boolean isPrimeNum(int x) {
        if (x == 1){ // if x is 1 returns false
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++){ // starts from 2 to the square root of X. As starting from 1 would make everything false.
            //Stops at the square root as the division pair has already been checked
            if (x % i == 0){ // if X is divided with no remainders by i it is not a prime number
                return false;
            }
        } return true; // if the loop finishes it is a prime number
    }


}