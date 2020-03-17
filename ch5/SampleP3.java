import java.io.*;

class SampleP3
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("0‚©‚ç10‚Ü‚Å‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢D");

		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);
	
		if(res >= 0 && res <= 10) {
			System.out.println("³‰ğ‚Å‚·D");
		}
		
		else {
			System.out.println("‚Ü‚¿‚ª‚¢‚Å‚·D");
		}
	}
}