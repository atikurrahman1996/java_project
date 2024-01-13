package day6_13_OOP;

//Hierarchical Inheritance


class Parent {
   int a;
   void dispaly (){		
   	System.out.println(a);		
}
   
}

  class Child1 extends Parent {
       int x;
       void show(){
	System.out.println(x);
    }      
}

class Child2 extends Parent {

	 int y;
	 void print(){
		 System.out.println(y);
	 }
}

public class InheritanceExample3 {

	public static void main(String[] args) {
		
		Child1 chi = new Child1();
		chi.a=400;
		chi.x=500;
		
		chi.dispaly();
		chi.show();
		
		Child2 child2 = new Child2();
		
		child2.a = 600;
		child2.y = 700;
		
		child2.dispaly();
		child2.print();
		
		
		
	}

}
