/** 2015. 09.01
 * 1. Java Development Kit 
 * 	JDK 8.0.
 * 	www.oracle.com �ٿ�ε� ��.
 * 2. IDE(���հ���ȯ��) - Eclipse�� �����.
 *  www.eclipse.org���� �ٿ�ε� ��.
 * 3. ȯ�溯�� ����
 *   - JAVA_HOME(�����̸�) : 'C:\Program Files\Java\jdk1.8.0_45'(������)
 * 4. �ý��� ���� ����(�ڹ� ��� �߰�)
 *   - path(�����̸�)';%JAVA_HOME%\bin' (������)�� �߰��Ѵ�.
 *    
 * @author James 2015 .09 .02
 * 
 * �ĺ���(id): �ٸ� ���е�� �����ϱ� ���� �̸�
 * ==============================
 * - ����, Ŭ����, �޼���(�Լ�), �������̽� ����� ������ �̸��� �ִ� ��Ģ
 * - Ư����ȣ�� ���� �� ����.(_.$) Student_No(o)
 * - ������ Ű���带 �ټ� ����. int No(o), int interface(x)
 * - ���ڷ� ������ �� ����. 
 * - �Ϲ������δ� �ǹ��ִ� �� �ܾ �����ؼ� ���.
 * ===============================
 * 
 * �Ϲ����� �ڹ��� �ڵ� ��Ģ
 *  - Ŭ����(Class)�� �̸��� �빮���� ���� ����
 *  - �޼ҵ�(Method)�� �̸��� �ҹ����� ����
 *  - �ʵ�(field)�� �ҹ��ڸ��
 *  - ���(constant)�� �빮�� ���
 *  
 *  ==============================
 *  �ڹ��� �⺻����
 *  - 1) ������ ���� ';'�� ������.
 *  - 2) �ڵ��� ������ ���� : ���� �������� �����ؼ� �ۼ��Ѵ�.
 *  - 3) c���� Ư¡�� �״�� ���´�.
 *  
 *  ==============================
 *  �ڹ��� �⺻ �Լ�
 *  - 1) ����� System.out.println
 *  - 2) out ��ü���� print(����: �ٹٲ� ����)�� println(������ ����)�� �ִ�.
 *  - 3) �żҵ� �����ε� ������� �������� Ÿ���� �Ű������� �ν��ϴ� ����� ������ �ִ�.
 */


public class _09_02_Environment {
	public static void main(String args[]) 
	{
	System.out.println ("�ȳ�~ �ڹ� ����....!");

	// �й�

		int StudentNo; // �Ľ�Į, pascal
		int studentNo; // ī��(��Ÿ) camel
		int Student_No; // _ǥ���
		StudentNo = 23;

		// �밡���� ǥ���
		int iStudentNo;
		String szName = "## �����ø��� ���������� ���۰������̴�.##";
		System.out.print(" ");
		
		String javaRule1 = " �Ϲ����� �ڹ��� �ڵ� ��Ģ  "
						+ "- Ŭ����(Class)�� �̸��� �빮���� ���� ���� "
						+ "- �޼ҵ�(Method)�� �̸��� �ҹ����� ����"
						+ "- �ʵ�(field)�� �ҹ��ڸ��"
						+ "- ���(constant)�� �빮�� ���";
		int cbByte;

		System.out.println(szName + "�ڹ� ��� ��Ģ" + StudentNo);
		System.out.println(szName + "�ڹ� ��� ��Ģ" + StudentNo);
		System.out.println(szName + "�ڹ� ��� ��Ģ" + StudentNo);
		
		System.out.print(szName + "�ڹ� ��� ��Ģ" + StudentNo);
		System.out.println(szName + "�ڹ� ��� ��Ģ" + StudentNo);
		System.out.print(javaRule1);
	}
}

// 2015 .09 .03 githut ���� ����~!
