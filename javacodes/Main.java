//Himanshu Kumar vtu19727

import java.util.*;
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
			int first = values[i] - '0';
		}
	    
		
	    
	    return 0;
	    
	}
}
