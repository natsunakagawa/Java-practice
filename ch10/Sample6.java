//�ԃN���X
class Car
{
	private int num;
	private double gas;

	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ԃ��쐬���܂����D");
	}

	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�i���o�[��"+ num +"�ɃK�\�����ʂ�"+ gas +"�ɂ��܂����D");
	}

	public void show()
	{
		System.out.println("�Ԃ̃i���o�[��"+ num +"�ł��D");
		System.out.println("�K�\�����ʂ�"+ gas +"�ł��D");
	}
}

class Sample6
{
	public static void main(String[] args)
	{
		Car car1;
		System.out.println("car1��錾���܂����D");
		car1 = new Car();
		car1.setCar(1234, 20.5);

		Car car2;
		System.out.println("car2��錾���܂����D");

		car2 = car1;
		System.out.println("car2��car1�������܂����D");

		System.out.print("car1������");
		car1.show();
		System.out.print("car2������");
		car2.show();
	}	
}
		