class MyPoint
{
	int x, y;

	void setX(int px)
	{
		x = px;
		
		System.out.println("X���W��"+ x +"�ɐݒ肵�܂����D");
	}

	void setY(int py)
	{
		y = py;
		
		System.out.println("X���W��"+ y +"�ɐݒ肵�܂����D");
	}
	
	int getX()
	{
		return x;
	}
	
	int getY()
	{
		return y;
	}
}

class SampleP1
{
	public static void main(String[] args)
	{
		MyPoint p1 = new MyPoint();

		p1.setX(10);
		p1.setY(5);

		int px = p1.getX();
		int py = p1.getY();

		System.out.println("X���W��"+ px +"�CY���W��"+ py +"�ł��D");
	}
}