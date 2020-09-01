
import java.io.*;


class Pattern{

        public static void main(String args[]){

		char ch1 = 'A',ch2 = 'a';

		for(int i = 0; i < 5; i++){
			for(int j = 0; j <= i; j++){

				if(i % 2 == 0)
					System.out.print(ch2 + " ");
				else
					System.out.print(ch1 + " ");
			}

			System.out.println();
		}
	}
}
		
