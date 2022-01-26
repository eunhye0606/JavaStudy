/*=======================
���� Ŭ���� ��� ����
=========================*/
// �߻� Ŭ���� (Abstract)

/*
�� �߻� Ŭ���� (abstract)��
   
   ���� �ְ� ���ǰ� ���� �ϳ� �̻��� �޼ҵ�(�߻� �޼ҵ�)�� ���� Ŭ������
   ���� Ŭ�������� �������̵�(Overriding)�� ������ ����Ǵ� �޼ҵ忡 ����
   �޸� ���� ���� �̸� ȣ�� ��ȹ�� �����α� ���� �����.

�� ���� �� ����
   
   [��������������] abstract class Ŭ������
   {
	   [��������������] abstract �ڷ��� �޼ҵ��([�Ű�����],...);
   }

�� Ư¡
   
   Ŭ������ ��� �ϳ� �̻��� �߻� �޼ҵ带 ������ ��
   �� Ŭ������ Ŭ���� �տ� ��abstract�� Ű���带 �ٿ�
   �߻� Ŭ������ ����ؾ� �ϸ�
   �߻� Ŭ������ ������ ��쿡��
   �ҿ����� ������ Ŭ�����̹Ƿ� ��ü�� ������ �� ����.
   �߻� �޼ҵ尡 �������� �ʴ� �߻� Ŭ����������
   ��ü�� ������ �� ���� ���̴�.

   ��, �߻� Ŭ������ ���������� ������ �� ���� ������
   ����� ���ؼ��� �����ϸ�
   �߻� Ŭ�������� ��ӹ��� ���� Ŭ����������
   �ݵ�� �߻� �޼ҵ带 �������̵�(Overriding) �ؾ� �Ѵ�.
   �� �������̵� ���ϸ� �ڽ� Ŭ������ �߻��̰� Ŭ�����ν��� ��ġ����.

�� ��abstract�� Ű�����
   Ŭ������ �޼ҵ忡���� ����� �� ������
   ��� ������ ���� ���������� ����� �Ұ����ϴ�.

   �߻� Ŭ�����ȿ� Ŭ�����޼ҵ峪 �ν��Ͻ� �޼ҵ� ���Ǵ� �����ϴ�.
   ��, �ν��Ͻ� ������ �ȵȴ�.
*/


// �߻� Ŭ���� ( �߻� �޼ҵ尡 1�� �̻� �ֱ� ������ )
// �� �ν��Ͻ� ���� �Ұ� ��.
abstract class SortInt117
{
	private int [] value;

	protected void sort(int[] value)
	//prtected�� �������������� ���� ��Ӹ���
	//���� ��Ű���� ���� ~ 
	{
		this.value = value;
		sorting();
	}

	// �߻� �޼ҵ� ( ���� �Ǿ����� )
	protected abstract void sorting();

	protected int dataLength()
	{
		return value.length;
	}

	//��final�� �� Ű����� ����
	// �� Ŭ����(SortInt117)�� ��ӹ޴� Ŭ��������
	// �� �޼ҵ带 ������(Method Overriding) �� �� ����.
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];
		if (x == y)
			return 0;
		else if (x>y)
			return 1;
		else
			return -1;
	}

	//��final��
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
}


//SortInt117 ( �߻� Ŭ���� ) �� ��� ���� Ŭ���� �� �ϴ��� �߻� Ŭ����
// �� �߻� �޼ҵ� (abstract)�� ������ (Method Overriding) �ϸ� 
//     Ŭ������ ���� �����ϴ�.
public class Test117 extends SortInt117
{
	int i, j;

	static int [] data = { 7, 8, 3, 8, 7};
	
	@Override
	protected void sorting()
	{

	// ���� �� �ϼ�

	//selection sort
		for (i = 0;i<dataLength()-1 ;i++ )
		{
			for (j = i+1;j<dataLength() ;j++ )
			{
				// ũ���
				if (compare(i,j)>0)
				{
					//�ڸ��ٲ�
					swap(i,j);
				}
			}
		}
	}


	


	public static void main(String[] args)
	{

		System.out.print("Source Data: " );
		for (int n:data)
			System.out.print(n + " " );
		System.out.println();
		

		// Ŭ����(���赵)���� �������̵��ؼ� �����ϰ� �ص�����
		// Ŭ���� ���� ����. �ν��Ͻ� ���� ����
		Test117 ob = new Test117();

		ob.sort(data);

		System.out.print("Sorted Data: " );
		for (int n:data )
			System.out.print(n + " " );

		System.out.println();
	}
}




//==========================================================================
	/*

	protected void sort(int[] value) 
	{
		this.value = value;
		sorting();
	}

	
	protected abstract void sorting();

	protected int dataLength()
	{
		return value.length;
	}

	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];
		if (x == y)
			return 0;
		else if (x>y)
			return 1;
		else
			return -1;
	}

	
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
	*/
	/*

	int i, j;

	static int [] data = { 7, 8, 3, 8, 7};
	//Test117 ob = new Test117();
		//(1). Overriding�� �ϸ� �ν��Ͻ� ���� ����.
		//     �������ķ� ��������.
	// �޼ҵ� ���Ǹ� Ŭ�������� �ؾ��� main()���� �ϰ��ִ�
	//             �� ���赵 �׸��°� Ŭ���������̴���~!
	// �۰� Override�� Overriding�� �ƴ϶� ����..


	// ��������.
	
	@Override
	protected void sorting()
	{
		for (int i = 1;i<data.length ;i++ ) // -- 1 2 3 4
		{
			for (int j = 0 ;j<data.length-i ;j++ ) // -- 0123   012   01   0
			{
					
				if (compare(j,j+1)==1)
					swap(j,j+1);
			}
		}
		
	}
	


	public static void main(String[] args)
	{

		System.out.print("Source Data: " );
		for (int n:data)
			System.out.print(n + " " );
		System.out.println();
		

		// Ŭ����(���赵)���� �������̵��ؼ� �����ϰ� �ص�����
		// Ŭ���� ���� ����. �ν��Ͻ� ���� ����
		Test117 ob = new Test117();

		ob.sort(data);

		System.out.print("Sorted Data: " );
		for (int n:data )
			System.out.print(n + " " );

		System.out.println();
	}
}
*/

/*

Source Data: 7 8 3 8 7
Sorted Data: 3 7 7 8 8
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/