package day2.assesment;

public class Main {
	public static void main(String[] args) {
        // Create Student object
        Student student = new Student();

        // Create Commission object and call methods
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();
    }
}
