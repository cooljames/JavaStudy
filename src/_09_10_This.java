class Test {
	int a;
	int b;

	static void Show() {
		// System.out.println(this.a + ":"+ this.b);
	}

	public static void main(String[] args) {

		Test a = new Test();
		a.a = 10;
		a.b = 20;
		Test b = new Test();
		// �ν��Ͻ��� ���� ���� �޸𸮿� �ö󰡰� ������
		// �޼���� ��ü�� ������ this ��� �̸����� �Ѿ� ���� �ȴ�.
		// show()��� �޼ҵ�� Ŭ������ �ε� �� �� �ѹ��� �ε� �ż� �����ǰ� �ȴ�.

		// ȣ���� ������ ù��° �Ű������� ������ this��� �̸����� �����ش�.
		// ���� ������ �����ϴ�.

		// static Method�� ���, this��� ������ �Ѿ���� �ʴ´�.
		// ���� ��ü ���̵� �޼ҵ带 �ҷ� �� �� �ִ�.

		a.Show();
		b.Show();
	}
	// TODO Auto-generated method stub

}
