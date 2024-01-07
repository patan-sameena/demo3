class Student{
int rollno;
String name;
static String college="MTIE";
static void change(){
college="A.M.REDDY";
}
Student (int r,String n){
rollno=r;
name=n;
}
void display(){System.out.println(rollno+""+name+""+college);}
}
class TestStaticMethod{
public static void main(String args[]){
Student s1=new Student(111,"sam");
Student s2=new Student(222,"arun");
Student s3=new Student(333,"kavya");
s1.display();
s2.display();
s3.display();

}
}