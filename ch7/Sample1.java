import java.io.*;

class Sample1
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("�e�X�g�̎󌱎Ґ�����͂��Ă��������D");
		
		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num = Integer.parseInt(str);

		int[] test;
		test = new int[num];

		System.out.println("�l�����̓_������͂��Ă��������D");

		for(int i=0; i<num; i++) {
			str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i] = tmp;
		}	
			
		for(int i=0; i<num; i++) {
			System.out.println((i+1) +"�Ԗڂ̐l�̓_����"+ test[i] +"�ł��D");
		}


	}
}