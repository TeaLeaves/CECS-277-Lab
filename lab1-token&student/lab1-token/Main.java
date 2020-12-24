/******************************************************************************
CECS 277
FAll 2020
Lab Assignment 1
Tina L Vu
08/26/20
*******************************************************************************/
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) {
	    String sentence = "it's,fleece,was,white,as,snow";
	    StringTokenizer mystery = new StringTokenizer(sentence,",");
	    
	    System.out.println(mystery.countTokens());
		System.out.println(mystery.nextToken());
		System.out.println(mystery.nextToken());
	}
}



