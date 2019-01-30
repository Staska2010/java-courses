import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Launch{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int index = 0;
		int [] massive = new int [10];
		String input = new String();
		while (!(input.toLowerCase().equals("ok"))) {
			input = sc.next();
			try{
				massive[index++] = Integer.valueOf(input);
			}
			catch (NumberFormatException e){}
		}
		Calculator obj = new Calculator();
		obj.calc(massive);
		System.out.println(obj.getResult());
		System.out.println(Arrays.toString(massive));

	}
}