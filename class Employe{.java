class Employe {
    String firstName;
    String lastName;
    double salary;

    // Constructor
    Employe(String f1, String f2, double salary) {
        this.firstName = f1;
        this.lastName = f2;
        this.salary = salary;
    }

    // Getter for first name
    public String getFname() {
        return firstName;
    }

    // Getter for last name
    public String getLname() {
        return lastName;
    }

    // Getter for salary (returns double)
    public double getSalary() {
        return salary;
    }

    // Method to raise salary by 10%
    public void raiseSalary() {
        double newSalary = salary * 1.1; // 10% increase
        System.out.println("Raised salary: " + newSalary);
    }

    public static void main(String[] args) {
        // Creating an object of Employe class
        Employe e1 = new Employe("siddharth", "javale", 35000);

        // Printing details
        System.out.println("first name: " + e1.getFname());
        System.out.println("last name: " + e1.getLname());
        System.out.println("monthly salary: " + e1.getSalary());
        e1.raiseSalary();
    }
}
