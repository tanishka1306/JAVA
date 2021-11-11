import java.util.Scanner;


class CustomerPurchases {

 private String customerNumber;
 private String firstName;
 private String surname;
 private String product;
 private double price;
 private int quantity;

 public String getCustomerNumber() {
 return customerNumber;
 }

 public void setCustomerNumber(String customerNumber) {
 this.customerNumber = customerNumber;
 }

 public String getFirstName() {
 return firstName;
 }

 public void setFirstName(String firstName) {
 this.firstName = firstName;
 }

 public String getSurname() {
 return surname;
 }

 public void setSurname(String surname) {
 this.surname = surname;
 }

 public String getProduct() {
 return product;
 }

 public void setProduct(String product) {
 this.product = product;
 }
 public double getPrice() {
 return price;
 }

 public void setPrice(double price) {
 this.price = price;
 }

 public int getQuantity() {
 return quantity;
 }

 public void setQuantity(int quantity) {
 this.quantity = quantity;
 }
}

class Printing {
 private CustomerPurchases customerPurchases;


 
 public Printing(CustomerPurchases customerPurchases) {
 this.customerPurchases = customerPurchases;
 }

 public void PrintDetails() {
 System.out.println("CUSTOMER INVOICE");
 System.out.println("CUSTOMER NUMBER: " + this.customerPurchases.getCustomerNumber());
 System.out.println("CUSTOMER FIRST NAME: " + this.customerPurchases.getFirstName());
 System.out.println("CUSTOMER SURNAME: " + this.customerPurchases.getSurname());
 System.out.println("PRODUCT PRICE: R " + String.format("%.2f", this.customerPurchases.getPrice()));
 System.out.println("PRODUCT QUANTITY: " + this.customerPurchases.getQuantity());
 
 }


 /**
 * Method called Customer Purchase Report which will display the following
 * information: REPORT OPTION PERCENTAGE TAX 15% COMMISSION 8.5% DISCOUNT 10%
 * TOTAL (Price + Tax) – (Discount + Commission)
 */
 public void CustomerPurchaseReport() {
 double productPrice = this.customerPurchases.getQuantity() * this.customerPurchases.getPrice();
 double tax=0.15*productPrice;
 double commission=0.085*productPrice;
 double discount=0.1*productPrice;
 double total=(productPrice + tax) - (discount + commission);
 System.out.println("\nCUSTOMER PURCHASE REPORT");

 System.out.println("PRODUCT PRICE: R " + String.format("%.2f", productPrice));
 System.out.println("TAX (15%): R " + String.format("%.2f", tax));
 System.out.println("COMMISSION (8.5% ): R " + String.format("%.2f", commission));
 System.out.println("DISCOUNT (10% ): R " + String.format("%.2f", discount));
 System.out.println("TOTAL: R " + String.format("%.2f", total));
 }
}


public class purchase_report {
 public static void main(String[] args) {
 java.util.Locale.setDefault(new java.util.Locale("en-US", "en-US"));
 // Scanner object
 Scanner in = new Scanner(System.in);
 System.out.print("Enter the customer number: ");
 String customerNumber = in.nextLine();
 System.out.print("Enter the customer first name: ");
 String firstName = in.nextLine();
 System.out.print("Enter the customer surname: ");
 String surname = in.nextLine();
 System.out.print("Enter the customer product: ");
 String product = in.nextLine();
 System.out.print("Enter the customer price: ");
 double price = in.nextDouble();
 System.out.print("Enter the customer quantity: ");
 int quantity = in.nextInt();
 CustomerPurchases cp = new CustomerPurchases();
 cp.setCustomerNumber(customerNumber);
 cp.setFirstName(firstName);
 cp.setSurname(surname);
 cp.setProduct(product);
 cp.setPrice(price);
 cp.setQuantity(quantity);


 Printing printing = new Printing(customerPurchases);
 printing.PrintDetails();
 printing.CustomerPurchaseReport();


 // close Scanner
 in.close();
 }
}