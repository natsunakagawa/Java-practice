import java.io.*;

class SampleP3
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("‰È–Ú‚P`‚T‚Ì“_”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢D");
		
		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		String str4 = br.readLine();
		String str5 = br.readLine();

		int sum = 0;
		sum += Integer.parseInt(str1);
		sum += Integer.parseInt(str2);
		sum += Integer.parseInt(str3);
		sum += Integer.parseInt(str4);
		sum += Integer.parseInt(str5);

		System.out.println("‚T‰È–Ú‚Ì‡Œv“_‚Í"+ sum +"‚Å‚·D");
		System.out.println("‚T‰È–Ú‚Ì•½‹Ï“_‚Í"+ sum/(double)5 +"‚Å‚·D");
	}
}

		