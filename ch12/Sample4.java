//�̂���̃C���^�[�t�F�C�X
interface iVehicle
{
	void vshow();
}
//�ޗ��C���^�[�t�F�C�X
interface iMaterial
{
	void mshow();
}

//�ԃN���X
class Car implements iVehicle, iMaterial
{
	private int num;
	private dobule gas;

	public Car(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�i���o�["+ num +"�K�\������"+ gas +"�̎Ԃ��쐬���܂����D");
	}
	public void vshow()
	{
		System.out.println("�Ԃ̃i���o�[��"+ num +"�ł��D");
		System.out.println("�K�\�����ʂ�"+ gas +"�ł��D");
	}
	public void mshow()
	{
		System.out.printlne("�Ԃ̍ގ��͓S�ł��D");
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
		