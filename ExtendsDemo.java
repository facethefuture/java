class ExtendsDemo 
{
	public static void main(String[] args) 
	{
		Dog dog =new Dog();
		dog.name="С��";
		dog.sayName();
	}
}
class Animal extends Creature
{
	String name="С��";
	int age ;
	public Animal(){
	System.out.println("����Animal�޲���������");
	}
	public Animal(String name,int age){
	System.out.println("����Animal���������Ĺ�����");
	}
	
	
	public void sayName(){
	System.out.println(name);
	}
}
class Dog extends Animal
{	
	public Dog(){
	System.out.println("����dog�޲���������");
	}
	
}
class Creature
{
	public Creature(){
		System.out.println("���Ƕ���Creature������");
	}
}
