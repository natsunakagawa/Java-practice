import java.io.*;

class SampleP3
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("0����10�܂ł̐�������͂��Ă��������D");

		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);
	
		if(res >= 0 && res <= 10) {
			System.out.println("�����ł��D");
		}
		
		else {
			System.out.println("�܂������ł��D");
		}
	}
}