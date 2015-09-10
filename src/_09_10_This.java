class Test
{
	int a;
	int b;
	
	void Show(Test this){
		System.out.println(this.a + ":"+ this.b);
		}

	public static void main(String[] args) {
		
		Test a = new Test();
		a.a =10; a.b = 20;
		Test b = new Test();
		// 인스턴스는 각자 전부 메모리에 올라가게 되지만
		// 메서드는 객체의 참조가 this 라는 이름으로 넘어 오게 된다.
		// show()라는 메소드는 클래스가 로딩 될 때 한번만 로딩 돼서 공유되게 된다.
		
	    // 호출한 변수의 첫번째 매개변수의 참조를 this라는 이름으로 보내준다.
		// 따라서 생략이 가능하다.
		
		a.Show();
		b.Show();
	}
		// TODO Auto-generated method stub

	}

