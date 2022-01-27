/*=======================
���� Ŭ���� ���� ����
=========================*/
// ��� ���迡 �ִ� Ŭ������ ���� ĳ����
// �� ĳ����, �ٿ� ĳ����



// super class , �θ� Ŭ���� , ���� Ŭ����
class SuperTest118
{
	public int a = 10, b = 20;
	
	public void write()
	{
		System.out.println("���� Ŭ���� write() �޼ҵ�...");
	}

	public int hap()
	{
		return a+b;
	}

}


//sub class , �ڽ� Ŭ���� , ���� Ŭ����
class SubTest118 extends SuperTest118
{
	public int b = 100, c = 200;

	@Override
	public int hap()
	{
		return a+ b+ c; // a ������ ��ӹ޾Ƽ�!
	}

	public void print()
	{
		System.out.println("���� Ŭ���� print() �޼ҵ� ...");
	}
}



//main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test118
{
	public static void main(String[] args)
	{
		//sub class ��� �ν��Ͻ� ����
		SubTest118 ob1 = new SubTest118();

		System.out.println("ob1.b : " + ob1.b);
		//--==>> ob1.b : 100
		
		//SuperTest118Ÿ������ ob2��� ������ ��������
		//���·� ���Ŷ�� �����Ѱ���.
		// �� �� ĳ����
		//    ���� �����Ѱ� �ڽ� ��ü
		//    �θ� ��ü�� ĳ���õ�.
		SuperTest118 ob2;
		ob2 = ob1;
		// ���� �Ʒ� ������ �ڵ�����ȯ ��Ģ��.��
		//  ���� �� ū ���� ��� �� ����.
		//-- ��SuperTest118 ob2 = (SuperTest118)ob1;��

		System.out.println("ob2.b : " + ob2.b);
		// --==>> ob2.b : 20
		// -- ������ ��ü���� ���� �Ҵ�ǹǷ�
		//    ���� b�� ob2�� �����̴�.
		//    �޸� ����! ���ٹ�Ŀ� ���� ������ ���� ���� ����.
		System.out.println("ob2.a : " + ob2.a);
		//System.out.println("ob2.c : " + ob2.c);
		// ���� ��ü�� ������ �Ⱥ���!
		
		System.out.println("��		" + ob2.hap());

		// -- hap() �޼ҵ� �� Override�ż� �ڽ� Ŭ���� hap() 
		// -- ���� b��? �� 100 �� hap������ �ڽ� b�� ������
		// -- ���� a��? �� hap������ �θ� a�� ������ ��ӹ޾Ƽ�
		// == a + b + c == 10 + 200 + 100 == 310
		// hap()�� �޼ҵ� �������̵�(Overriding)�Ǿ� �ְ�
		// ob2�� ob1�� ��ĳ������ ������ ��ü�̹Ƿ�
		// ��SuperTest118���� hap() �޼ҵ带 ȣ���ϴ� ���� �ƴ϶�
		// ��SubTest118������ �������� hap() �޼ҵ带 ȣ���ϰ� �ȴ�.
		//  ��, �޼ҵ�� ��ĳ������ �Ǵ���
		//  ������(�����)�� �̻�... ������ ������� �ǵ��� �� ����..

		ob2.write(); 
		//--==>>���� Ŭ���� write() �޼ҵ�.
		//ob2.print();
		//--==>> cannot find symbol
		// �θ�ü������ �ڽ� �޼ҵ尡 �Ⱥ�����


		//�� �ٿ� ĳ����
		((SubTest118)ob2).print();
		//-->>���� Ŭ���� print() �޼ҵ� ...
		//�ڽİ�ü�� ������

		//�� �߰����� ----------------------------
		//    �ٿ� ĳ���� ���� ����

		SuperTest118 ob3 = new SuperTest118();
		SubTest118 ob4;

		//System.out.println(((SubTest118)ob3).c);
		//�̰ŵ� �Ұ��� �ֳ��ϸ� SuperTest118�Ҷ�
		//SubTest118�� ���� �Ұ�
		//
		//System.out.println(ob3.c);
		//--== �θ����� c�� �Ⱥ����� �����Ͽ���!
		//-- ���� ��ü�� ���� ��ü�� ����� �����ϴ� ���� �Ұ����ϴ�.

		//ob4 = ob3;
		//--==>>���� �߻�(������ ����)
		// -- ���� ��ü�� ���� ��ü�� ���� �� (������ �� ) ����.
		//ob4 = (SubTest118)ob3;
		//ClassCastException: ��Ÿ�ӿ���!
		//Ŭ������ ĳ�����ϴ� �������� ������ �߻��߽��ϴ�.
		// -- �ۼ��� ������ �������� ������ ���� ��
		//    �ٿ� ĳ������ �̷���� ��Ȳ�̴�.
		//    ������, �������� ĳ������ �̷������ �ʴ´�.

		// ���� SubTest118 ��ü�� ���� �޸� �Ҵ��� �̷������ ���� �����̱� ������
		// �ν��Ͻ� ����, �޸� �Ҵ��� �ϸ� �Ǵ� ���ΰ�?����
		// -- �׷��� �ȵ�. �׷��� ������
		//    ����Ŭ������ ���� ��ü ������ �ϱ��ߴµ�
		//    �޸� �Ҵ��� �ƴ϶� ����Ŭ������ ���� �ڽ�Ŭ������ ������ �� 
		//    �ֳ� ���İ� ����.
		// �ٿ� ĳ������ �Ұ����� ���̴�.



	}
}

/*
�� �� ĳ����, �ٿ� ĳ���� ���������� �̷������ ��� ------------------------
   
	1. ���� ��ü ����;	//-- check~!!!!!
	2. ���� = ����;	// �� ĳ����. ����
	3. ���� = ����; // ���� �߻�.
	4. ���� = (����)����; �� ������	// �ٿ� ĳ����.����


�� �� ĳ����, �ٿ� ĳ���� ���������� �̷������ �ʴ� ��� ------------------------
   
   1. ���� ��ü ����; //-- check~!!!!!
   2. ���� = ����; //���� �߻�.
   3. ���� = (����)����; //�ٿ� ĳ����. ��Ÿ�ӿ���.

�� �� ĳ������ �׻� ����. 
   �ٿ� ĳ������ ���(1��)�� ���� ����.

class �л� 
{
}

class ȣ��
{
}

�л� ob = new �л�();
ȣ�� ob1 = new ȣ��();

�л� ob = new ȣ��();
����.
*/