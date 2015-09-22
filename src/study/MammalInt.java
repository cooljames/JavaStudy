package study;


/* File name : MammalInt.java */
public class MammalInt implements Animal{

   public void eat(){
      System.out.println("Mammal eats");
   }

   public void travel(){
      System.out.println("Mammal travels");
   } 


   public static void main(String args[]){
      MammalInt m = new MammalInt();
      m.eat();
      m.travel();
      m.sleep();
      m.run();
   }
@Override
public void sleep() {
	// TODO Auto-generated method stub
	System.out.println("Mammal Sleep");
}

@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("Mammal run");
}
}