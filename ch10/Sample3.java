import java.io.*;

class Sample3
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("���������͂��Ă��������D");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		System.out.println("������������͂��Ă��������D");
		
		String str2 = br.readLine();
		
		char ch = str2.charAt(0);
		
		int num = str1.indexOf(ch);
		
		if(num != -1)
			System.out.println(str1 +"��"+ (num+1) +"�ԖڂɁu"+ ch +"�v��������܂����D");
		else
			System.out.println(str1 +"�Ɂu"+ ch +"�v�͂���܂���D");
		
	}
}