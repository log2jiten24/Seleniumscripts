package javapractice;

public class Childclass extends Parentclass {
	
	static int x = 5 ;
	static int y = 10 ;
	static double multiply = 0;
	
	//static block cannot have any identifier and cannot be declared as private 
		//private static 
		static
		{
		//static block will only have the static variables 	
		x++;
		++y;
		multiply += x*y ;
		System.out.println ("multiply printed of child class static block : " + multiply);
		//System.exit(200);
		}
	
	//child class default constructor 	
	private Childclass ()
	{
	System.out.println ("Default constructor of child class ");	
	}
	
	public Childclass (String name , int age){
	
	//each constructor can have only one super keyword	
	super("Jiten",30);
	
	//private constructor cannot be called from parent class 	
	//super ("Jiten",30,"India");
	System.out.println ("child class  constructor values :" + name + age);
	
		
	}
	
	public static void main (String[]args) {
	
	//creating obj
	Childclass obj = new Childclass() ;
	
	//creating obj2
	Childclass obj2 = new Childclass("Priya", 25);
	
	if (obj.hashCode() == obj2.hashCode()) {
	System.out.println ("two objects hash code equals")	;
	}else if (obj.equals(obj2)) {
		System.out.println ("two objects equals")	;	
	}else {
	System.out.println ("two objects are not  equals")	;
	}
	
	}

}
