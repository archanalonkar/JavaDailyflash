

import java.io.*;


class EvenSeries{

        public static void main(String args[])throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.printf("Enter Limit of Series : ");
                int limit = Integer.parseInt(br.readLine());

		for(int i = 1; i <= limit; i++){

			if(i % 2 == 0)
				System.out.println("Cube of " + i + " : " + (i*i*i) + " & Square of " + i + " : " + (i*i));
		}
	}
}
