import java.util.Scanner;

public class CubeOfANumber {

	
	int cube(int x){
		
		return x*x*x;
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int x= sc.nextInt();
		
		CubeOfANumber c1= new CubeOfANumber();
		
		int result = c1.cube(x);
		
		System.out.println(" Cube of a Number is " +result);
		
		sc.close();
	}

}
