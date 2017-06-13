
public class Decoder {
public String encodedMessage;

	public Decoder(String encodedMessage)
	{
		this.encodedMessage = encodedMessage;
	}
	
	public String decode()
	{
		String decodedMessage = "";
		int size = encodedMessage.length();
		
		for(int i = 0; i<size; i+=10)
		{
			decodedMessage = decodedMessage + encodedMessage.substring(i, (i+1));
		}
		return decodedMessage;
	}
	
	public String decode (int StartingIndex)
	{
		String decodedMessage = "";
		int size = encodedMessage.length();
		
		for(int i = StartingIndex; i< size; i+=10)
		{
			decodedMessage += encodedMessage.substring(i, (i+1));
		}
		return decodedMessage;
	}
}
