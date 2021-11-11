/*) Write a program to print the area of two rectangles having sides (4,5) and (5,8) 
respectively by creating a class named 'Rectangle' with two instance variables, length and breadth and
 a  method named 'Area' which returns the area. Initialise the object attributes 
 by taking the input from the user in the constructor*/ 
class Rectangle{
  int length;
  int breadth;
  public Rectangle(int l, int b){
    length = l;
    breadth = b;
  }
  public int getArea(){
    return length*breadth;
  }
  public int getPerimeter(){
    return 2*(length+breadth);
  }
}

class Ans{
  public static void main(String[] args){
    Rectangle a = new Rectangle(4,5);
    Rectangle b = new Rectangle(5,8);
    System.out.println("Area : "+a.getArea()+" Perimeter is "+a.getPerimeter());
    System.out.println("Area : "+b.getArea()+" Perimeter is "+b.getPerimeter());
  }
}		