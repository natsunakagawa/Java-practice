import java.io.*;

class SampleP3
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�ȖڂP�`�T�̓_������͂��Ă��������D");
		
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

		System.out.println("�T�Ȗڂ̍��v�_��"+ sum +"�ł��D");
		System.out.println("�T�Ȗڂ̕��ϓ_��"+ sum/(double)5 +"�ł��D");
	}
}

		