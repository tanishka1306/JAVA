import java.util.Scanner;

//write a program to take care of the number format exception if the user enters value other than
// integer for calculating the avegare marks of the two students and marks in 3 subjects are taken
// from the user at while executing the program.
//In the same program write your own exception classes to take care of the  negative values and values out
// of range (i.e other then the rage of 0 - 100). Exception handling: Throws and user defined Exception.
public class average_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++)
        {
            String name = "";
            int subA = 0;
            int subB = 0;
            int subC = 0;

            try {
                name = sc.next();

                if (sc.hasNextInt())
                    subA = sc.nextInt();
                else
                    throw new NumberFormatException();

                if (sc.hasNextInt())
                    subB = sc.nextInt();
                else
                    throw new NumberFormatException();

                if (sc.hasNextInt())
                    subC = sc.nextInt();
                else
                    throw new NumberFormatException();

                if (subA < 0) {
                    throw new NegativeValuesException();
                }
                if (subA > 100) throw new ValuesOutOfRangeException();

                if (subB < 0) throw new NegativeValuesException();
                if (subB > 100) throw new ValuesOutOfRangeException();

                if (subC < 0) throw new NegativeValuesException();
                if (subC > 100) throw new ValuesOutOfRangeException();


            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (NegativeValuesException e) {
                System.out.println(e.getMessage());
            } catch (ValuesOutOfRangeException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Name: " + name);
            System.out.println("Marks of subject A: " + subA);
            System.out.println("Marks of subject B: " + subB);
            System.out.println("Marks of subject C: " + subC);
            System.out.println("average is "+((subA +subB+subC)/3));
        }


    }
    public static class NegativeValuesException extends Exception {
        public NegativeValuesException() {
            super();
            System.out.println("NegativeValuesException occured");
        }
    }
    public static class ValuesOutOfRangeException extends Exception {
        public ValuesOutOfRangeException() {
            super();
            System.out.println("ValuesOutOfRangeException occured");
        }
    }

}