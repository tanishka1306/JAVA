/*Create a class Box that uses a parameterized constructor to initialize
  the dimensions of a box_.The dimensions of the Box are width, height, depth.
  The class should have a method that can return the volume of the box_.
  Create an object of the Box class and test the functionalities.
*/public class box_ {
    double h,w,d;

    box_(double width, double height, double depth)
    {
        h=height;
        w=width;
        d=depth;
    }
    double volume()
    { double v;
        v=h*w*d;
        return v;
    }

    public static void main(String[] args) {

        box_ bc = new box_(8.5,80.3,9.6);
        System.out.println(bc.volume());

    }

}