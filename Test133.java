/*=====================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
======================================*/
// Wrapper Ŭ����

public class Test133
{
	public static void main(String[] args)
	{

		boolean bi = true;
		Boolean wrapBi = new Boolean(bi); // �ڽ�. �ν��Ͻ� ������.
		Boolean wBi = bi; // ����ڽ�

		int n = 300;
		Integer wrapN = new Integer(n); //�ڽ�. �ν��Ͻ� ������.
		int n2 = wrapN; // ������Ƽ������ ��ü�� ����. �����ڽ�

		float f = 300.3f;  //���̻�f
		Float wrapF = new Float(f);  //��ü����

		System.out.println(wrapBi.toString());
		System.out.println(wrapN.toString());
		System.out.println(wrapF.toString());

		System.out.println(wrapBi);
		System.out.println(wrapN);
		System.out.println(wrapF);


		//Integer Ŭ����
		
		String sn = "12";
		int ni = Integer.parseInt(sn);
		System.out.printf("ni : %3d\n", ni);


		ni = Integer.parseInt("0101",2); //--�����ε�    ���ڿ��� 2������ ��ȯ�ϰڴ�.
		System.out.printf("ni : %3d\n",ni);
		//--==>> ni :  5


		ni = Integer.parseInt("12",8);
		System.out.printf("ni  : %3d\n",ni);
		//--==>>ni  :  10  ���ڿ��� 8������ �ٲ���.

		ni = Integer.parseInt("A",16);
		System.out.printf("ni  : %3d\n",ni);
		//--==>>ni  :  10 16������ 15�����ִµ� 9�������� ǥ�� ���ϴϱ�
		//                 A�� 10�̱���


		sn = Integer.toBinaryString(20);
		System.out.printf("sn : %s\n",sn);
		//--==>>sn : 10100
		// �� toBinaryString() �굵 static Ŭ���� �޼ҵ屸��
		// �ν��Ͻ� �������� �� �� �ֱ⶧����
		// to ~ () �� ��ȯ�� �����ϴ� �޼ҵ屸��~

		sn = Integer.toOctalString(31);
		System.out.printf("sn : %s\n",sn);
		//--==>>sn : 37
		// 8����

		sn = Integer.toHexString(31);
		System.out.printf("sn : %s\n",sn);
		//--==>>sn : 1f
		// 16����.

		Integer num = new Integer(50); // �ν��Ͻ�����
		System.out.println(num.toString());
		//--==>>50

		int n3 = 345;
		Integer n4 = Integer.valueOf(n3);
		System.out.println(n4); // Ŭ������@�ؽ��±װ� �ƴ϶� ���� �����±���
		//--==>>345

		
	}
}

/*
true
300
300.3
true
300
300.3
ni :  12
ni :   5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/