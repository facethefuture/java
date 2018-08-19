class ExtendsDemo 
{
	public static void main(String[] args) 
	{
		Dog dog =new Dog();
		dog.name="小黄";
		dog.sayName();
	}
}
class Animal extends Creature
{
	String name="小红";
	int age ;
	public Animal(){
	System.out.println("我是Animal无参数构造器");
	}
	public Animal(String name,int age){
	System.out.println("我是Animal连个参数的构造器");
	}
	
	
	public void sayName(){
	System.out.println(name);
	}
}
class Dog extends Animal
{	
	public Dog(){
	System.out.println("我是dog无参数构造器");
	}
	
}
class Creature
{
	public Creature(){
		System.out.println("我是顶层Creature构造器");
	}
}
