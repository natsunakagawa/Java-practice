//�ԃN���X
class Car
{
	public static int sum = 0;

	private int num;
	private double gas;

	public Car()
	{
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("�Ԃ��쐬���܂����D");
	}

	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�i���o�[��"+ num +"�ɃK�\�����ʂ�"+ gas +"�ɂ��܂����D");
	}

	public static void showSum()
	{
		System.out.println("�Ԃ͑S����"+ sum +"�䂠��܂��D");
	}
	
	public void show()
	{
		System.out.println("�Ԃ̃i���o�[��"+ num +"�ł��D");
		System.out.println("�K�\�����ʂ�"+ gas +"�ł��D");
	}
}

class Sample2
{
	public static void main(String[] args)
	{
		Car.showSum();

		Car car1 = new Car();
		car1.setCar(1234, 20.5);

		Car.showSum();

		Car car2 = new Car();
		car2.setCar(4567, 30.5);

		Car.showSum();
	}
} 