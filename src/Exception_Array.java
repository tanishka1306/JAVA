import java.util.Scanner;
public class Exception_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        try {
            System.out.println("Enter the elements in array ");
            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < a; i++) {
                System.out.println(arr[i]);
            }
            System.out.println("Enter the index of the array element you want to access ");
            int b = sc.nextInt();
            System.out.println("the element at index " + b + "=" + arr[b]);
            System.out.println("The array elements successfully accessed.");
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException o)
        {
            o.printStackTrace();
        }

    }
}
