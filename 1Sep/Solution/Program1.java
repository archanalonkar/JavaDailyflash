

import java.io.*;

class OddSeries {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Min of Series : ");
		int min = Integer.parseInt(br.readLine());
		System.out.print("Max of Series : ");
                int max = Integer.parseInt(br.readLine());

		System.out.print("Odd Numbers ranging between " + min + "& " + max + " are : ");
		
		for(int i = min; i <= max; i++){

			if(i % 2 != 0)
				System.out.print(i + " ");
		}
	}
}
