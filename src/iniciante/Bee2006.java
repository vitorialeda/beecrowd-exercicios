
/*
 * Nível 1
 * beecrowd | 2006
 * Identificando o Chá
 * https://judge.beecrowd.com/pt/problems/view/2006
*/

package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2006 {

	 public static void main(String[] args) throws IOException {
	        int tipoCha, palpitesCertos = 0;
	        
	        Scanner s = new Scanner(System.in);
	        
	        tipoCha = s.nextInt();
	        s.nextLine();
	        String guess[] = s.nextLine().split(" ");
	        
	                        
	        for (int i = 0; i < guess.length; i++){
	        	if( Integer.parseInt(guess[i]) == tipoCha) {
	        		palpitesCertos++;
	        	}
	        }
	        
	        
	        System.out.println(palpitesCertos);
	        s.close();
	    }

}
