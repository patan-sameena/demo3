*/if the same method is present in both the superclass and subclass
the methodin the subclass overrides the methodin the superclass.
this concept is known as methodoverriding.
Redifining method of base class in derived class is method overriding.
ex:method overriding in java inheritance
*/
class Animal{
public void eat(){
System.out.println("I can eat");
}
}
class Dog extends Animal{

public void eat(){
System.out.println("I eat dog food");
}
public void bark(){
System.out.println("I can bark");
}
}
class Test{
public static void main(String args[]){
Dog labrator=new Dog();
labrador.eat();
labrador.bark();
}
}
