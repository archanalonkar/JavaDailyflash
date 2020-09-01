
import java.io.*;


class FindMax{

        public static void main(String args[])throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.printf("Enter the number1 : ");
                int num1 = Integer.parseInt(br.readLine());
		System.out.printf("Enter the number2 : ");
                int num2 = Integer.parseInt(br.readLine());

		if(num1 > num2)
			System.out.println("The Maximum number amongst " + num1 + " & " + num2 + " is " + num1);
		else
			System.out.println("The Maximum number amongst " + num1 + " & " + num2 + " is " + num2);
		
	}
}
