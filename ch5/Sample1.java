import java.io.*;

class Sample1
{
	public static void main(String[] args) throws IOException
	{
	
		System.out.println("��������͂��Ă��������D");

		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		switch(res){
			case 1:
				System.out.println("1�����͂���܂����D");
				break;
			case 2:
				System.out.println("2�����͂���܂����D");
				break;		
			default:
				System.out.println("1��2����͂��Ă�������.");
				break;
		}
	}
}
