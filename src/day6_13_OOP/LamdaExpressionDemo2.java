package day6_13_OOP;

interface Sayable{  
    public String say(String Atik);  
}  

public class LamdaExpressionDemo2 {

	public static void main(String[] args) {
		
		// Lambda expression with single parameter. 
		
        Sayable s1=(Atik)->{  
            return "Hello, "+Atik;  
        }; 
        
        System.out.println(s1.say("Atik"));  
          
        // You can omit function parentheses
        
        Sayable s2= Israt ->{  
            return "Hello, "+Israt;  
        };  
        System.out.println(s2.say("Israt"));  
		

	}

}
