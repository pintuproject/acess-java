abstract class Language2 {

   
  abstract void display();
void show(){
System.out.println("this is non abstract method");
}
      
}
class b extends Language2{
 void display()
{
 System.out.println("Hello world");
}
public static void main(String[] args)
{
b ob=new b();
ob.display();
ob.show();

}
}

