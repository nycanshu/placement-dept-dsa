import java.util.*;
//day 3 problem 2
// By Himanshu Kumar
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Number :");
		int n = sc.nextInt();
		
		int ans = calulatePower(n);
	    System.out.println(ans);
	    sc.close();

	}

	static int calulatePower(int n){
		int sum =0;  
	    String val = Integer.toString(n); 
	    char values[] = val.toCharArray();

		for(int i=0;i<values.length-1;i++){
			int first = values[i] - '0';  //converting char to int here
			int second = values[i+1] - '0';
			sum = sum +(int) Math.pow(first, second); //math.pow returns double so typecasting to int
		} 

	    return sum+1;
	}
}
