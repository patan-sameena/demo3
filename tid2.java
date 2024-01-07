import java.util.Scanner;
class Trainer{
private int tid;
private String tname;
public void setTid(int tid){this.tid=tid;}
public void gettname(String tname){this.tname=tname;}
public int getTid(){return this.tid;}
publicint getTname(){return this.tname;}
public Trainer(int tid String tname){
public Trainer()
{this.tid=tid;
}
class Test{
public static void main(String args[]){
System.out.println("Enter Teacher ID:");
System.out.println("Enter Teacher NAME:");
Scanner sc=new Scanner(System.in);
int tidin=sc.nextInt();
int tidname=sc.nextInt();
Trainer ob1=new Trainer(tidin);
Trainer ob1=new Trainer(tidname);
System.out.println("tid:"+ob1.getTid());
System.out.println("tname:"+ob1.getTname());

System.out.println("Enter Teacher ID:");
System.out.println("Enter Teacher NAME:");
int tid=sc.nextInt();
int tname=sc.nextInt();

Trainer ob2=new Trainer(tid);
Trainer ob2=new Trainer(tname);

System.out.println("tid:"+ob2.getTid());
System.out.println("tname:"+ob2.getTname());

System.out.println("Enter Teacher ID:");
System.out.println("Enter Teacher NAME:");
int tin=sc.nextInt();
Trainer ob3=new Trainer(tin);
System.out.println("tid:"+ob3.getTid());
System.out.println("tname:"+ob3.getTname());

}
}
