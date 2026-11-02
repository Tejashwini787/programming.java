class Complex {
    private double real;
    private double imaginary;

    // Constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // A method add(Complex c) that accepts another object as a parameter
    public Complex add(Complex c) {
        double newReal = this.real + c.real;
        double newImaginary = this.imaginary + c.imaginary;
        return new Complex(newReal, newImaginary);
    }

    // A method multiply(Complex c) that multiplies two complex numbers
    public Complex multiply(Complex c) {
        double newReal = (this.real * c.real) - (this.imaginary * c.imaginary);
        double newImaginary = (this.real * c.imaginary) + (this.imaginary * c.real);
        return new Complex(newReal, newImaginary);
    }

    // A method compareMagnitude(Complex c) that compares their magnitudes
    public int compareMagnitude(Complex c) {
        double mag1 = Math.sqrt((this.real * this.real) + (this.imaginary * this.imaginary));
        double mag2 = Math.sqrt((c.real * c.real) + (c.imaginary * c.imaginary));

        if (mag1 > mag2) return 1;
        if (mag1 < mag2) return -1;
        return 0;
    }

    // A method copy() that returns a new Complex object with the same values
    public Complex copy() {
        return new Complex(this.real, this.imaginary);
    }

    // A method display() that prints the complex number in a readable format
    public void display() {
        if (this.imaginary >= 0) {
            System.out.println(this.real + " + " + this.imaginary + "i");
        } else {
            System.out.println(this.real + " - " + Math.abs(this.imaginary) + "i");
        }
    }

    // Setter to modify values (needed for the challenge verification)
    public void setReal(double real) {
        this.real = real;
    }
}

public class mi {
    public static void main(String[] args) {
        // Test: Create two objects
        Complex c1 = new Complex(3.0, 4.0);
        Complex c2 = new Complex(1.0, 2.0);

        System.out.print("Complex Number 1: ");
        c1.display();
        System.out.print("Complex Number 2: ");
        c2.display();

        // Perform operations
        Complex sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.display();

        Complex product = c1.multiply(c2);
        System.out.print("Product: ");
        product.display();

        int cmp = c1.compareMagnitude(c2);
        if (cmp > 0) {
            System.out.println("Magnitude of c1 is greater than c2.");
        } else if (cmp < 0) {
            System.out.println("Magnitude of c1 is less than c2.");
        } else {
            System.out.println("Magnitudes are equal.");
        }

        // Challenge: Modify one object after copying and verify the copied object remains unchanged
        System.out.println("\n--- Challenge Verification ---");
        Complex original = new Complex(5.0, 5.0);
        Complex replica = original.copy();

        System.out.print("Original before modification: ");
        original.display();
        System.out.print("Replica before modification: ");
        replica.display();

        // Modifying original object
        original.setReal(10.0);
        System.out.println("\n[Modifying original real part to 10.0...]");

        System.out.print("Original after modification: ");
        original.display();
        System.out.print("Replica after modification (Should remain unchanged): ");
        replica.display();
    }
}
