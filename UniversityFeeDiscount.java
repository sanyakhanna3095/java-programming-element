import java.text.DecimalFormat;

public class UniversityFeeDiscount {
    public static void main(String[] args) {
        int fee = 125000; 
        int discountPercent = 10;

        // Calculating the discount amount
        float  discountAmount = (discountPercent / 100f) * fee;

        // Calculating the final fee after applying the discount
        float discountedFee = fee - discountAmount;

        // Formatting the output to two decimal places
        DecimalFormat df = new DecimalFormat("#,###.00");

        
        System.out.println("The discount amount is INR " + df.format(discountAmount)
                + " and the final discounted fee is INR " + df.format(discountedFee));
    }
}

