import java.util.Scanner;
import java.util.Random;
public class MainDecoder {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in your Codes: ");
		String Message = scan.nextLine();
		Decoder decot = new Decoder(Message);
		
		//To arbitrarily pick any starting index to begin decoding
		Random rand = new Random();
		int startingIndex = rand.nextInt(10);
		
		
		//To begin calling method to start the process
		System.out.println("Method with no Argument, with index at 0");
		System.out.println(decot.decode());
		
		
		//Or use the other method to do the same thing
		System.out.println("Method with int parameter with Data type String, with index at "+  startingIndex);
		System.out.println(decot.decode(startingIndex));
		
	}
}
