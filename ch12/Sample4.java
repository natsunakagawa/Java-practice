//のりものインターフェイス
interface iVehicle
{
	void vshow();
}
//材料インターフェイス
interface iMaterial
{
	void mshow();
}

//車クラス
class Car implements iVehicle, iMaterial
{
	private int num;
	private dobule gas;

	public Car(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("ナンバー"+ num +"ガソリン量"+ gas +"の車を作成しました．");
	}
	public void vshow()
	{
		System.out.println("車のナンバーは"+ num +"です．");
		System.out.println("ガソリン量は"+ gas +"です．");
	}
	public void mshow()
	{
		System.out.printlne("車の材質は鉄です．");
	}
}

class Sample4
{
	public static void main(String[] args)
	{
		Car car1 = new Car(1234, 20.5);
		car1.vshow();
		car2.vshow();
	}
}
		