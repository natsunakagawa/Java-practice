//�ԃN���X
class Car
{
	private int num;
	private double gas;
	private String name;

	public Car()
	{
		num = 0;
		gas = 0.0;
		name = "������";
		System.out.println("�Ԃ��쐬���܂����D");
	}

	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�i���o�[��"+ num +"�ɃK�\�����ʂ�"+ gas +"�ɂ��܂����D");
	}

	public void setName(String nm)
	{
		name = nm;
		System.out.println("���O��"+ name +"�ɂ��܂����D");
	}

	public void show()
	{
		System.out.println("�Ԃ̃i���o�[��"+ num +"�ł��D");
		System.out.println("�K�\�����ʂ�"+ gas +"�ł��D");
		System.out.println("���O��"+ name +"�ł��D");
	}
}

class Sample8
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();

		car1.show();

		int number = 1234;
		double gasoline = 20.5;
		String str = "1����";

		car1.setCar(number, gasoline);
		car1.setName(str);

		car1.show();
	}
}