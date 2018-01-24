public class List
{
	private int filledhead = -1;
	private int freehead = 0;
	int key[] = new int[5];
	int next[] = new int[5];
	public List()
	{
		for(int i = 0; i< (next.length-1); i++)
		{
			next[i] = i+1;
		}
		next[next.length -1] = -1;
	}
	public void append(int k)
	{
		try
		{
			int temp = freehead;
			freehead = next[freehead];
			key[temp] = k;
			if(filledhead == -1)
			{
				filledhead = temp;
				next[filledhead] = -1;
			}
			else
			{
				int pres = filledhead;
				int prev = -1;
				while(pres != -1)
				{
					prev = pres;
					pres = next[pres];
				}
				if(prev == -1)
				{
					
					filledhead = temp;
					next[temp] = pres;
				}
				else
				{
					next[prev] = temp;
					next[temp] = pres;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Out Of Bounds");
		}
	}
	public void begin(int k)
	{
		try
		{
			int temp = freehead;
			freehead = next[freehead];
			key[temp] = k;
			next[temp] = filledhead;
			filledhead = temp;
		}
		catch(Exception e)
		{
			System.out.println("Out Of Bounds");
		}
	}
	public void atPos(int k, int pos)
	{
		try
		{
			int temp = freehead;
			freehead = next[freehead];
			key[temp] = k;
			if(filledhead == -1)
			{
				filledhead = temp;
				next[filledhead] = -1;
			}
			else
			{
				int pres = filledhead;
				int prev = -1;
				int i =1;
				while(pres != -1 && i < pos)
				{
					prev = pres;
					pres = next[pres];
					i++;
				}
				if(prev == -1)
				{
					
					filledhead = temp;
					next[temp] = pres;
				}
				else
				{
					next[prev] = temp;
					next[temp] = pres;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Out Of Bounds");
		}
	}
	public void remove(int k)
	{
		int pres = filledhead;
		int prev = -1;
		while(pres != -1 && key[pres] != k)
		{
			prev = pres;
			pres = next[pres];
		}
		next[prev] = next[pres];
		next[pres] = freehead;
		freehead = pres;
	}
	public void disp()
	{
		int temp = filledhead;
		while(temp != -1)
		{
			System.out.print(key[temp] + " ");
			temp = next[temp];
		}
		System.out.println();
	}
}
