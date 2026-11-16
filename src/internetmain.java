
class InternetPlan {
    private String planName;
    private int speedMbps;
    private double monthlyPrice;
    private boolean isUnlimited;


    public InternetPlan(String planName) {
        this(planName, 50); // Default speed to 50 Mbps
        System.out.println("Called: 1-argument constructor");
    }


    public InternetPlan(String planName, int speedMbps) {
        this(planName, speedMbps, 499.0, true); // Default price and unlimited status
        System.out.println("Called: 2-argument constructor");
    }


    public InternetPlan(String planName, int speedMbps, double monthlyPrice, boolean isUnlimited) {
        this.planName = planName;
        this.speedMbps = speedMbps;
        this.monthlyPrice = monthlyPrice;
        this.isUnlimited = isUnlimited;
        System.out.println("Called: Master (4-argument) constructor");
    }


    public void displayPlanDetails() {
        System.out.println("--- Plan Details ---");
        System.out.println("Plan Name     : " + planName);
        System.out.println("Speed         : " + speedMbps + " Mbps");
        System.out.println("Monthly Price : ₹" + monthlyPrice);
        System.out.println("Unlimited Data: " + (isUnlimited ? "Yes" : "No"));
        System.out.println();
    }
}


public class internetmain {
    public static void main(String[] args) {
        System.out.println("--- Creating Plan 1 (Using 1-arg constructor) ---");
        InternetPlan plan1 = new InternetPlan("Basic Starter");
        plan1.displayPlanDetails();

        System.out.println("--- Creating Plan 2 (Using 2-arg constructor) ---");
        InternetPlan plan2 = new InternetPlan("Gamer Pro", 300);
        plan2.displayPlanDetails();

        System.out.println("--- Creating Plan 3 (Using Master constructor) ---");
        InternetPlan plan3 = new InternetPlan("Corporate Ultra", 1000, 1999.0, true);
        plan3.displayPlanDetails();
    }
}

