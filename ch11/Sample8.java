class Car
{
	protected int num;
	protected double gas;

	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ԃ��쐬���܂����D");
	}
}

class Sample8
{
	public static void main(String[] args)
	{
		Car car1 = new Car();
		Car car2 = new Car();

		Car car3;
		car3 = car1;

		boolean bl1 = car1.equals(car2);
		boolean bl2 = car1.equals(car3);

		System.out.println("car1��car2�����������ׂ��Ƃ���"+ bl1 +"�ł����D");
		System.out.println("car1��car3�����������ׂ��Ƃ���"+ bl2 +"�ł����D");
	}
}