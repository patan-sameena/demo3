import java.util.Scanner;
class Trainer{
private int tid;
public void setTid(int tid){this.tid=tid;}
public int getTid(){return this.tid;}
public Trainer(int tid){this.tid=tid;}
public Trainer()
{this.tid=0;}
}
class Test{
public static void main(String args[]){
System.out.println("Enter Teacher ID:");
Scanner sc=new Scanner(System.in);
int tidin=sc.nextInt();
Trainer ob1=new Trainer(tidin);
System.out.println("tid:"+ob1.getTid());

System.out.println("Enter Teacher ID:");
int tid=sc.nextInt();
Trainer ob2=new Trainer(tid);
System.out.println("tid:"+ob2.getTid());
System.out.println("Enter Teacher ID:");
int tin=sc.nextInt();
Trainer ob3=new Trainer(tin);
System.out.println("tid:"+ob3.getTid());
}
}
