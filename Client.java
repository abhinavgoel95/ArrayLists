public class Client
{
	public static void main(String args[])
	{
		List list = new List();
		list.atPos(200, 20);
		list.begin(3);
		list.append(2);
		list.begin(1);
		list.begin(4);
		//list.begin(5);
		list.disp();
		list.remove(200);
		list.disp();
		list.atPos(500,4);
		list.disp();
	}
}
