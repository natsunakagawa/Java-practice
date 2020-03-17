import java.io.*;

class Sample1
{
	public static void main(String[] args) throws IOException
	{
	
		System.out.println("®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢D");

		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		switch(res){
			case 1:
				System.out.println("1‚ª“ü—Í‚³‚ê‚Ü‚µ‚½D");
				break;
			case 2:
				System.out.println("2‚ª“ü—Í‚³‚ê‚Ü‚µ‚½D");
				break;		
			default:
				System.out.println("1‚©2‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢.");
				break;
		}
	}
}
