import java.io.*;

class SampleP1
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("５人のテストの点数を入力してください．");

		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));

		int [] test = new int[5];
		
		for(int i=0; i<test.length; i++) {
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
		}

		int max = test[0];

		for(int s=1; s<test.length; s++) {
			if(max < test[s]) {
				max = test[s];
			}
		}

		for(int j=0; j<test.length; j++) {
			System.out.println( (j+1) +"番目の人の点数は"+ test[j] +"です．");
		}
		
		System.out.println("最高点は"+ max +"です．");
	}
}			 