/*=======================
���� Ŭ���� ���� ����
=========================*/

// �������̽�(Interface)

/*
�� �������̽�(Interface)��
   
   ������ �̿ϼ��� ä�� ������
   �������̽� �ȿ� �����ϴ� �� � �޼ҵ嵵
   ��ü(���Ǻ�)�� ���� ������ ��ǻ� ���� �κ��� �������� �ʴ´�.
   Ŭ������ ���� ���ø����ν��� ����� �����ϴ�
   �߻� Ŭ������ �� �����̴�.

   �� �߻� Ŭ���� �ν��Ͻ� ���� �Ұ�
      ���� �̿ϼ��̱� ������!

�� �������̽��� Ŭ������ �޸� ���� ����� �����ϸ�
   �������̽� ��ü�� ��ӵȴ�.
   ������ C++ ��� ��� �����Ǵ� ���� �����
   ��� �������� ���� �������� ������ױ� ������
   �ڹٿ����� ���� ����� ������ �������̽���� �������� �����Ͽ�
   �������̽��� ���� ���� ����� �����ϴ� ����� �����Ѵ�.


�� �������̽��� ����� �߻� �޼ҵ常 ���� �� ������
   �������̽� ���� �޼ҵ���� �������������ڸ� �������� �ʾƵ�
   ��public������ �����Ǿ� Ŭ�������� ����(implements)�����ν�
   �ٷ� ������ �̷���� �� �ִ�.

�� Ư¡
   - �߻� Ŭ������ �������� ���� �ְ� ���ǰ� ����.
   - final ������ ���� �� �ִ�.(����� ����)
   - �������̽��� ��public static final�� ����� ���� �� �ִ�.
   - �������̽��� �����ϱ� ���ؼ��� ��extends�� ��ſ�
     ��implements���� �̿��Ѵ�.
   - �ϳ� �̻��� �������̽��� implements�� �� �ִ�.
   - �������̽��� ��� �޼ҵ带 Overriding �ؾ� �Ѵ�.

   	 �� �߻� �޼ҵ�� ��� Overriding �ؾ��Ѵ�.

   - �������̽��� �ٸ� �������̽��� ��ӹ��� �� ������
     �� ��, extends Ű���带 ����Ѵ�.
	 ��implemants �������̽�A extends �������̽�B. �������̽�C..
	 �� ��, Ŭ������ �޸� �������̽��� ���� ����� �����ϴ�.
   */


//�������̽�
interface Demo
{
	public static final double PI = 3.141592;

	// �������̽��� ��� ������
	// ��static final���� ������ �������� �ʾƵ�
	// �ڵ����� ��static final���� ����~!!!
	public int a = 10;
	//�� ����!



	// �������̽��� �޼ҵ�� ���� ����(���� �Ұ�)
	// �ڵ����� ��abstract���� ����
	// public abstract void print();
	public void print();
	/*
	{
		System.out.println("PI : " + PI);
	}
	*/

}


//Ŭ����
//class DemoImpl
//class DemoImpl extends Demo //--(X)
//class DemoImpl implements Demo
//                  ��
// implements�ϴ� ����. �߻� Ŭ������ ��.


// Ŭ���� - �������̽� ����
class DemoImpl implements Demo
{
	//���� class�տ� abstract�� �� ����.
	@Override
	public void print()
	{
		System.out.println("�������̽� �޼ҵ� ������..");
	}

	public void write()
	{
		System.out.println("Ŭ������ ���ǵ� �޼ҵ�...");
	}
}




// main() �޼ҵ带 �����ϰ� �ִ� �ܺ� Ŭ����
public class Test119
{
	public static void main(String[] args)
	{
		//Demo ob = new Demo(); //-- ���� �Ұ� ~!! 
		                        // �������̽��� �ν��Ͻ� ���� �Ұ�

		//DemoImpl ob = new DemoImpl();
		// -- print() �޼ҵ� ������ �� ����~!!

		//DemoImpl obTemp = new DemoImpl();

		//Demo ob = (Demo)obTemp;
		//Demo ob = obTemp; ������


		// �� �� ĳ����
		// �������̽� ��ü�� ���� ��ü
		Demo ob = new DemoImpl();
		//-----   --------------
		// ��             ��

		ob.print();
		//--==>>�������̽� �޼ҵ� ������..

		//ob.write();
		//--==>> ������ ���� �߻�. ã�� �� ���� ���� ��ü������

		((DemoImpl)ob).write();
		//--==>>Ŭ������ ���ǵ� �޼ҵ�...


		System.out.println(Demo.PI);
		// Ŭ������.������
		// PI�� static�̶� ������ ��
		//--==>>3.141592
		System.out.println(Demo.a);
		//--==>>10
		//�������̽����� �ڵ����� static

		//Demo.a = 30;
		// final�̶� �ٸ� �� ������ �ȵ�!!!





	}
}