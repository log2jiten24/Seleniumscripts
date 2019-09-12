package javapractice;

public class Parentclass {
	
	static int x = 5 ;
	static int y = 10 ;
	static int sum = 0;
	
	String name ;
	int age ;
	String countryname ; 
	
	//static block cannot have any identifier and cannot be declared as private 
	//private static 
	static
	{
	//static block will only have the static variables 	
	x++;
	++y;
	sum += x+y ;
	System.out.println ("sum printed of parent class static block : " + sum);
	//System.exit(200);
	}
	
	//default Public Parent class constructor 
	public Parentclass () {
	
	System.out.println ("parent class constructor loaded");	
	}
	
	//private constructor cannot be called from parent class to the child class 
	private Parentclass (String name , int age ,String countryname1) {
	
	//assigning global variable to the local constructor variables
	this.name = name ;
	this.age = age ;
	
	countryname = countryname ;
	
	System.out.println ("parent class private constructor name :" + name );
	System.out.println ("parent class private constructor age :" +  age );
	System.out.println ("parent class private constructor country :" +  countryname );
	
	
	}
	
	public Parentclass (String name , int age ) {
		
		//assigning global variable to the local constructor variables
		this.name = name ;
		this.age = age ;
		
		System.out.println ("parent class  constructor name :" + name );
		System.out.println ("parent class  constructor age :" +  age );
   }
	
	//protected constructor can be overridden with in the same package but not outside the package 
	protected Parentclass (String name ) {
		
		//assigning global variable to the local constructor variables
		this.name = name ;
	System.out.println ("parent class private constructor name :" + name );
   }
}