class ProfitLossCalculator {
    public static void main(String[] args) {
        // Define the cost price and selling price
        int costPrice = 129;
        int sellingPrice = 191;

        // Calculate profit
        double profit = sellingPrice - costPrice;

        // Calculate profit percentage
        double profitPercentage = (profit / costPrice) * 100;

        // Display the results in a single multiline print statement
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n"
                + "The Profit is INR " + profit + " and the Profit Percentage is " +  profitPercentage + "%");
    }
}

