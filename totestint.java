/*Write a program to create interface named test. In this interface the member function is square
Implement this interface in arithmetic class. Create one new class called ToTestInt 
in this class use the object of arithmetic class. */

public interface Test
{
public int square(int a);
}
// Implements
class arithmetic implements Test
{
int s = 0;
public int square(int b)
{
System.out.println(“Inside arithmetic class – implemented method square”);
System.out.println(“Square of “ + “ is “+s);
return s;
}
void armeth()
{

System.out.println(“Inside method of class Arithmetic”);
}
}

// use the object
class ToTestInt
{
public static void main(String a[])
{
System.out.println(“calling from ToTestInt class main
method”);
Test t = new arithmetic();
System.out.println(“created object of test interface – reference Arithmetic class “);
System.out.println(“Hence Arithmetic class method square called”);
System.out.println(“This object cannot call armeth method ofArithmetic class”);
t.square(10);
}
}