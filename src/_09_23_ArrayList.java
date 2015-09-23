import java.util.ArrayList;
import java.util.Iterator;

/**
 *  @author James
 *  
 *  =======================
 *         �ڷᱸ��
 *  =======================
 *   - �迭: ���ֹڽ�, ���ڽ�
 *    (c������ �迭�� �����Ѵ�.)
 *   
 *   - ���Ḯ��Ʈ 
 *    : Queue(First input First out)
 *  <�Ӽ�> ������ �뷮 ����
 *  
 *  <student> ��� Ŭ������ �迭�ȿ� ���� �� �ִ�.====== �߿�!!!!!!!!!
 *  <E> ���׸��� ����Ͽ�, �迭�ȿ� Ŭ������ ���� �� �ִ�.
 *  
 */

class MyArrayList<E>{
	private int size;
	private int capa;
	private int [] buf;
	
	public MyArrayList(){
		this(16);
	}
	public MyArrayList(int capa){
		this.capa = capa;
		this.size = 0;
		this.buf = new int[this.capa];
	}
	
	// �ൿ
	public int size(){return this.size;}
	
	public void Remove(int index)
	{
		if(index < size)
		{
			for(int i = index; i<size-1; i++)
			{
				buf[i] = buf[i+1];
			}
		}
		
	}
	public int add(int NewValue)
	{
		this.buf[size] = NewValue;
		size++;
		if(size == capa)
		{
			this.capa*=1.5;
			int [] temp = new int[capa];
			
			for (int i = 0; i < buf.length; i++) {
				temp[i] = buf[i];
			}
			buf = temp;
			// buf = null; garbage collection(�������÷���)�� reference count�� 0�� ���� �����.
			}
		return NewValue;

	}
	public int get(int index){
		return buf[index];
	}
	
}
public class _09_23_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyArrayList arr = new MyArrayList(5);
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.print("[" + arr.get(i) + "]");
			
		}
		
		System.out.println("");

	}
}
