import java.io.*;

class SampleP4
{	
	public static void main(String[] args) throws IOException
	{
		System.out.println("���т���͂��Ă��������D");

		BufferedReader br  =
		 new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		switch(res) {
			case 1:
				System.out.println("�����Ɗ撣��܂��傤�D");
				break;
			case 2:
				System.out.println("���������撣��܂��傤�D");
				break;
			case 3:
				System.out.println("����ɏ��ڎw���܂��傤�D");
				break;
			case 4:
				System.out.println("�����ւ�悭�ł��܂����D");
				break;
			case 5:
				System.out.println("�����ւ�D�G�ł��D");
				break;
		}
	}
}