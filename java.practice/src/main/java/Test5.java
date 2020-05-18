
class Parent
{
void saving()
{
 System.out.println("Parent's saved money");
}
void lifeStyle()
{
 System.out.println("eat, sleep, work");
}
}
class Child extends Parent
{
void lifeStyle() // overriding method
{
 System.out.println("eat, sleep, work, play, party");
}
void keepLearning()
{
 System.out.println("keep Learning");
}
}
class Test5
{
 public static void main(String args[])
 {
  Parent p1=new Child();
  p1.lifeStyle();
  } 
}
