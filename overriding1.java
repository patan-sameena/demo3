/*if the same method is present in both the superclass the method in the subclass overrides the method in the superclass.
this concept is known as method overriding in java.
Redifining method of base class in derived class is method overriding.
ex:ethod overriding in java inheritance
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
Dog labrador=new Dog();
labrador.eat();
labrador.bark();
}
}