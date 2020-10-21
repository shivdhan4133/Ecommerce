package ecom;

public class Customer {
	
	String Name,Add,mail,psw;
	long mob,pin;
	
	Customer(String Name,String psw)
	{
		System.out.println("New user please login");
		this.Name=Name;
		this.psw=psw;
	}
	Customer(String Name,String Add,String mail,long mob,long pin)
	{
		this.Name=Name;
		this.Add=Add;
		this.mail=mail;
		this.mob=mob;
		this.pin=pin;
	}
	
	
	
	void Show()
	{
		System.out.println("Name : "+Name);
		System.out.println("Address : "+Add);
		System.out.println("Email : "+mail);
		System.out.println("Postal code : "+pin);
		System.out.println("Contact : "+mob);
	}
}
