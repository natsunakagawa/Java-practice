import java.io.*;

class SampleP1
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Ç†Ç»ÇΩÇÕâΩçŒÇ≈Ç∑Ç©?");

		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		System.out.println("Ç†Ç»ÇΩÇÕ"+ str +"çŒÇ≈Ç∑.");
	}
}