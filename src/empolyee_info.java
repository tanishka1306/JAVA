import java.util.Scanner;

public class empolyee_info {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            String name = sc.next();
            int year_join = sc.nextInt();
            String address=sc.next();

            System.out.printf("%-15s%04d\t%10s%n", name,year_join,address);
        }

    }
}