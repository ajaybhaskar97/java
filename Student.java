
02
03
04
05
06
07
08
09
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
public class Student{  
 private int id;  
 private String name;  
   
 public void setId(int id)
 {
   this.id = id;
 }
  
 public void setName(String name)
 {
   this.name = name;
 }
  
 public int getId()
 {
   return this.id;
 }
  
 public String getName()
 {
   return this.name;
 }
   
public static void main(String args[])
{  
  Student student=new Student();  
  student.setId(1034);
  student.setName("David Smith");
 
  System.out.println("Student id "+ student.getId());
  System.out.println("Student name "+ student.getName());
     
}  
 
}  