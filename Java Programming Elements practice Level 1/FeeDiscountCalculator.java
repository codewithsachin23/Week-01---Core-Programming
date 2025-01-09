// This program calculates the discount on student fees and final fee after applying the discount
public class FeeDiscountCalculator {
    public static void main(String[] args) {
        // Declare and initialize the student fee and discount percentage
        int studentFee = 125000;
        int discountPercent = 10;

        // Calculate the discount amount by multiplying the student fee by the discount percentage
        // Then, divide by 100 to get the actual discount value
        int discountAmount = (studentFee * discountPercent) / 100;

        // Calculate the final fee after subtracting the discount amount from the original fee
        int finalFee = studentFee - discountAmount;

        // Display the discount amount and the final discounted fee
        System.out.println("The discount amount is INR " + discountAmount + 
                           " and final discounted fee is INR " + finalFee);
    }
}
