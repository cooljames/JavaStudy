/**
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
public class SecondApp {
	public static void main(String args[])
	// �й�

	{
		int StudentNo; // �Ľ�Į, pascal
		int studentNo; // ī��(��Ÿ) camel
		int Student_No; // _ǥ���
		StudentNo = 23;

		// �밡���� ǥ���
		int iStudentNo;
		String szName = "## �����ø��� ���������� ���۰������̴�.##";
		
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
