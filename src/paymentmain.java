
class Payment {


    public double calculateAmount(double amount) {
        return amount;
    }


    public double calculateAmount(double amount, double discountPercentage) {
        double discount = amount * (discountPercentage / 100.0);
        return amount - discount;
    }
}


class CardPayment extends Payment {

    @Override
    public double calculateAmount(double amount) {
        double fee = amount * 0.02;
        return amount + fee;
    }
}

class UPIPayment extends Payment {

    @Override
    public double calculateAmount(double amount) {
        double discount = amount * 0.005;
        return amount - discount;
    }
}


public class paymentmain {
    public static void main(String[] args) {
        double basePrice = 1000.0;
        double discountPercent = 10.0;

        System.out.println("=== 1. Compile-Time Polymorphism (Method Overloading) ===");
        Payment basePayment = new Payment();


        double finalPriceNoDiscount = basePayment.calculateAmount(basePrice);
        double finalPriceWithDiscount = basePayment.calculateAmount(basePrice, discountPercent);

        System.out.println("Original Price: $" + basePrice);
        System.out.println("Without Discount (Single Param): $" + finalPriceNoDiscount);
        System.out.println("With " + discountPercent + "% Discount (Two Params): $" + finalPriceWithDiscount);
        System.out.println();

        System.out.println("=== 2. Run-Time Polymorphism (Method Overriding) ===");

        Payment payment1 = new CardPayment();
        Payment payment2 = new UPIPayment();


        System.out.println("Card Payment Total (2% fee applied): $" + payment1.calculateAmount(basePrice));
        System.out.println("UPI Payment Total (0.5% discount applied): $" + payment2.calculateAmount(basePrice));
    }
}
