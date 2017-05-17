import java.util.Scanner;

public class Fizzy {

	public static void main(String[] args) {
		Scanner in = new Scanner(args[0]);
		in.useDelimiter(",");
		int num;			
		num = in.nextInt();	
		
		if(num % 3 == 0){
			System.out.print("fizz");
		}			
		if(num % 5 == 0){
			System.out.print("buzz");
		}
		
		in.close();
	}

}
