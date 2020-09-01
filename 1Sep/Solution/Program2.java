

import java.io.*;


class Swap{

	public static void main(String args[])throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.printf("Enter the number1 : ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.printf("Enter the number2 : ");
		int num2 = Integer.parseInt(br.readLine());
		
		System.out.println("Before Swap : " + num1 + " " + num2);

		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swap : " + num1 + " " + num2);

		}
}
