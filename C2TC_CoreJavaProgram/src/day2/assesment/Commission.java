package day2.assesment;

public class Commission {
    String name;
    String address;
    String phone;
    double salesAmount;

    // Method to accept employee details
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Phone: ");
        phone = sc.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
}
}[]
