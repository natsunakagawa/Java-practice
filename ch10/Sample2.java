import java.io.*;

class Sample2
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("�p������͂��Ă��������D");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String stru = str.toUpperCase();
		String strl = str.toLowerCase();
		
		System.out.println("�啶���ɕϊ������"+ stru +"�ł��D");
		System.out.println("�������ɕϊ������"+ strl +"�ł��D");
		
	}
}