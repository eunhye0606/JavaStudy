/*=====================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
======================================*/
// Wrapper Ŭ����

public class Test136
{
	//java.lang.Number Ŭ����(�߻� Ŭ����)��
	//��� ������ Wrapper Ŭ�������� �θ� Ŭ����
	//(���� Ŭ����, ���� Ŭ����)�̴�.
	//b2, i2�ڷ����� Number�� �����鼭
	// ��ĳ������ �Ͼ��.
	// Auto-Boxting�� �Ͼ�� �ȴ�. �ν��Ͻ� �����ϸ鼭.
	//                        ��3
	static void printtt(Number n) //--Byte, Integer, ... �� ����.
								  //--�Ű������� Object�� ���ϴ� ���� : ������������.
								  //--�ڹٽ�ũ��Ʈ������ ���� �ڷ����� �������
								  //   �׷��� �� ���� ������. ���� ����.
								 
						
	{
		 //System.out.println("print �����ε� : " + o.getClass());
		 System.out.println(n);
		 System.out.println(n.intValue());
		 //--�����ν� �߸�! �̹� ��ĳ���� �Ȱ��� �����Ͷ� �̰���.

		 


	}
	public static void main(String[] args)
	{

		//byte b = 3;
		//int i = 256;

		//Byte b2 = new Byte(b);
		//Integer i2 = new Integer(i);

		//System.out.println("b2�� ��� : " + b2);
		//System.out.println("i2�� ��� : " + i2);
		//b2�� ��� : 3
		//i2�� ��� : 256


		//* wrapper Ŭ������ �ȿ� ���ڰ� �־�� �Ѵ�.
		//Byte b3 = new Byte();
		//System.out.println(b3);

		//=============================================

		byte b = 3;
		Byte b2 = new Byte(b);


		int i = 256;
		Integer i2 = new Integer(i);
		//print(b2);
		//print(i2);
		System.out.println(i2.hashCode()); //-- �̰� �����ư�. �� �־���.

		//Integer i3 = new Integer(i);
		//System.out.println(i2.hashCode());
		//System.out.println(i3.toString());
		//256
		//256
		Object obj = new Object();
		System.out.println(obj.toString());
		//--java.lang.Object@15db9742
		System.out.println(obj.hashCode());
		//--366712642
		/*
		System.out.println(toString(b));
		System.out.println(hashCode(b));
		// * ������Ƽ������ ��Ÿ���̶� toString()�� hashCode()�� ����� �� ����. �翬; ;;
		*/


		System.out.println("obj : " + obj.getClass());
		System.out.println("i2 : " + i2.getClass());
		System.out.println("b2 : " + b2.getClass());

		//obj : class java.lang.Object
		//i2 : class java.lang.Integer
		//b2 : class java.lang.Byte

		System.out.println("==========================");
		printtt(b2);
		System.out.println("==========================");
		//--==print �����ε� : class java.lang.Byte



		// Byte Ŭ������ byteValue() �޼ҵ� ȣ��
		byte b3 = b2.byteValue(); //��ڽ�


		//Integer Ŭ������ intValue() �޼ҵ� ȣ��
		int i3 = i2.intValue(); //��ڽ�
		System.out.println("===================");
		//��check��
		int i4 = b2.byteValue();
		System.out.println(i4); //3
		//byte b4 = i2.intValue(); //--�ڵ�����ȯ ����. �����Ͽ���.
		byte b4 = i2.byteValue();
		System.out.println(b4);//0
		b4 = (byte)i2.intValue(); //--�̰ŵ�����
		System.out.println(b4);//0
		//int���� byteŸ������ Ÿ���� �´µ� 0���� ����.
		//�߸��� ������ �����°���!!!!!!!!!!!!!!!!!!!!!!check!!!!!!!!!!!�ܡܡܡܡܡܡ�

	}
	
	
	
}

		
		



	
	/*
	static void print(Byte b)
	{
	}
	static void print(Integer i)
	{                        
	} 
	*/

	//�޼ҵ� �ϳ��θ� �����
	

	/*

	static void print(Object o)
	{
		//int ���̸� intValue
		// �Ἥ ��ü �� ������Ƽ�������� �ٲ㼭 ������ ������ �ɰŰ�����
		// �Ű������� �޴� ��üŸ���� ������ ��� �ϳ�.
		// ��ü Ÿ�Ժ��� ������ �� �ִ°� �ִٸ�?
		// �ؽ��ڵ�.... equal�Ἥ true�� intvalue�ϰ� ������ ���


		//�Ű������� ��ü�� �޾ƿͼ�
		//�װŸ� �����ڽ�? 
		//�����ڽ��� ������Ƽ���� = ��ü
		//�װ� �Ҷ�� ������Ƽ�� ���� �����ؾ���.
		// �ٵ� wrapperŬ������ ���� ���� ������Ƽ������ �����ض�


		//Object obj = new Object(o);
		//error: constructor Object in class Object cannot be applied to given types;

		
		*/