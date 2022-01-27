 /*===============================================
	  ���� Ŭ���� ���� ����
================================================*/
// ���(Inheritance)

/*
�� �޼ҵ� �������̵�(Method Overriding)�� Ư��
   - �޼ҵ� �̸�, ����Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� �Ѵ�.
   - �ݵ�� ��� ���谡 �־�� �Ѵ�.
   - �����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ�
     ���� Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų� ���ƾ� �Ѵ�.
	 ���� ���, ���� Ŭ���� �޼ҵ��� �������������ڰ� ��protected���� ���
	 ���� Ŭ������ �� �޼ҵ带 �������̵�(Overriding)�ϴ� ���
	 �������������ڴ� ��protected�� �Ǵ� ��public���̾�� �Ѵ�.
   - ��static��,��final��,��private�� �޼ҵ�� �������̵�(Overriding)�� �� ����.
	  --------
	  �̹� Ŭ������ �����Ǹ鼭 ��������� �޸� ��Ƽ�
	  �ٲٱ� ����. ź�������� �ٸ�

	              -------
				  ��ӿ� �־ ���ȭ�� ����~

				  		    ---------
							�������̵� ���� ���� ����� �����ؾ���.
							private�� �����ü�� �Ұ���! ���� ���� ����!

   
   - Exception�� �߰��� �Ұ����ϴ�.
     ��, ���� �޼ҵ尡 ������ �ִ� ���� ���� ���׿�
	 ���ο� Exception�� �߰��ϴ� ���� �Ұ��� �ϴٴ� ���̴�.
	 �ڹٿ��� Exception�� ��ü�Դϴ�! 
	 ����ó���� �߰��߰��߰��ϸ� ���� �ٸ��ְ� �ǹ���
	 ����� Exception�� �߰��ϸ� ���̵������ �� ��������!
	 */


// �θ� Ŭ����(���� Ŭ����, super class)
class SuperTest116
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
	} 
}


// �ڽ� Ŭ����(���� Ŭ����, sub class)
class SubTest116 extends SuperTest116
{
	/*
	private �������������ڴ� �ƹ��� ���� ���ؼ�
	�ڽ��� �� �������� ��!

	protected int b = 10;
	�� ����� ���� ��������������.

	public int c = 20;

	public void write()
	{
		System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
	} 
	*/
	protected int b = 100;

	public void print()
	{
		//System.out.println("Sub print() �޼ҵ� : " + a + " : " + b + " : " + c );
		// -- ����Ŭ�������� ����� ���� a ���� ������ �� ����.
		//    �� private �����̱� ������...

		//System.out.println("Sub print() �޼ҵ� : "  + b + " : " + c );
		//System.out.println("Sub print() �޼ҵ� : "  + this.b);
		//System.out.println("Sub print() �޼ҵ� : "  + super.b + " : " + c );
		// -- ���� b �� ���� ����� ���� �ٸ� b �� ���� �� ����� �̷������.
		//    ���� Ŭ�������� ����� b, ���� Ŭ�������� ����� b
		

		//System.out.println("Sub print() �޼ҵ� : " + c );
		//System.out.println("Sub print() �޼ҵ� : " + this.c );
		//System.out.println("Sub print() �޼ҵ� : " + super.c );
		// -- ���� c �� �����ϴµ� �ƹ��� ����� ������ ����.
		//    ���� Ŭ�������� ����� c

		System.out.println("Sub print() �޼ҵ� : "+ b + " : " + c);

		
	}

	@Override
	public void write()
	{
		//System.out.println("Sub write() �޼ҵ� : " + a + " : " + b + " : " + c);
						// -- super�� �ƴմϴ�. �������̵��߾��.
						//    sub�� �Դϴ�.
		// -- ���� Ŭ�������� ����� ���� a ���� ������ �� ����.
		//    �� private �����̱� ������...
		System.out.println("Sub write() �޼ҵ� : " + b + " : " + c);

	}
}


//main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test116
{
	public static void main(String[] args)
	{
		SubTest116 ob = new SubTest116();

		ob.print();
		//--==>>Sub print() �޼ҵ� : 100 : 20

		ob.write();
		//--==>> Super write() �޼ҵ� : 5 : 10 : 20

		/*
		Sub print() �޼ҵ� : 100 : 20
		Sub write() �޼ҵ� : 100 : 20
		*/

		System.out.println("-----------------------���м�");

		System.out.println(ob.b);
		//--==>> 100

		System.out.println(((SuperTest116)ob).b);
		//--==>> 10
		// ���� ���� ��� : �θ� ����, �ڽ� ���� �޸� ��ġ�� �ٸ�
		//                   �׷��� �̰� ����

		((SuperTest116)ob).write();

		// 100
		//	10
		//	Sub write() �޼ҵ� : 100 : 20

	// check~!!
	// �޼ҵ�� ������ �� �����Ͽ� ������ ��
	// �޼ҵ�� �������̵��ϸ� �θ𲬷� �����ư�
	// �ٵ� �θ�ؿ� �ڽ��� �����̸� a�� �������̵��Ѱ�
	// b�� �׳� �θ� �޳�? ���� ����?????????

	}
}