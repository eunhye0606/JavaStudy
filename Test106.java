 /*===============================================
���� �޼ҵ� �ߺ�����(Method Overloading) ����
================================================*/ 

// Method Overloading�� ������ ���¿� �Ұ����� ����
 public class Test106
 {
	 public static void main(String[] args)
	 {
		 print(3.14); //-- �ڹٴ� ���Կ����� ������ �����ʺ���ó��
		 			  //-- ����ȯ�̰� �����̰� ���� �Ѵ� ���� ��.
					  //-- ��ȯ�� ���� (void)�̵� double�̵� �ڹٴ� ����
		 double result = print(3.14);
	 }
	// public static void print() {}
	 //public static void print() {} //--default (x)

	// public static void print(int i) {}
	 //public static void print(int j) {} //-- �̰� �ȵ� (x)
	 								    //-- �ۿ��� �̸������°� �ƴ�

	// public static void print(char c) {}    //-- �ϴ� ��. �ٵ� �ڵ�����ȯ ��Ģ check~!!
	 
	// public static void print(int i,int j) {}

	// public static void print(double d) {}

	 //public static void print(double e) {return 10.0} //--���� �Ұ� void�ε� return�ڷ��� ��ȯ�̶�
	

	 public static double print(double e) {return 10.0;}//--(x) check~!!

 } 