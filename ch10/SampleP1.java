import java.io.*;

class SampleP1
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("•¶š—ñ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢D");

		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		StringBuffer sb = new StringBuffer(str);
		sb.reverse();

		System.out.println(str +"‚ğ‹t‡‚É‚·‚é‚Æ"+ sb +"‚Å‚·D");
	}
}