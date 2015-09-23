import java.util.ArrayList;
import java.util.Iterator;

/**
 *  @author James
 *  
 *  =======================
 *         자료구조
 *  =======================
 *   - 배열: 소주박스, 라면박스
 *    (c에서는 배열만 제공한다.)
 *   
 *   - 연결리스트 
 *    : Queue(First input First out)
 *  <속성> 사이즈 용량 버퍼
 *  
 *  <student> 라는 클래스를 배열안에 넣을 수 있다.====== 중요!!!!!!!!!
 *  <E> 제네릭을 사용하여, 배열안에 클래스를 넣을 수 있다.
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
	
	// 행동
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
			// buf = null; garbage collection(가비지컬렉션)은 reference count가 0인 것을 지운다.
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
