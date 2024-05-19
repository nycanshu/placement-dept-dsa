import java.util.*;
//Himanshu Kumar Vtu19727
public class sum_of_digit_cyclicOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        int ans = cyclicSumOfDigit(n);

        System.out.println(ans);
        sc.close();
    }


    //slicing the string into substring
    static int cyclicSumOfDigit(int n){
        int sum = 0;

        String number = Integer.toString(n);

        for(int i=0;i<number.length();i++){

            String subPartStr = number.substring(i); //getting each substring
            sum += sumOfDigit(subPartStr); //calculating the sum of each substring
        }
        return sum;
    }

    //for calculating the sum of digit in a string
    static int sumOfDigit(String s){
        int sum = 0;
        int num = Integer.parseInt(s); //convertng to int from str
        while (num>0) {
            int rem = num % 10;
            sum += rem;
            num = num/10;
        }
        return sum;
    }
}
