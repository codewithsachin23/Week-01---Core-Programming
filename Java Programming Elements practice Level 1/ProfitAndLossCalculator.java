public class ProfitAndLossCalculator {
    public static void main(String[] args) {
        // Declare and initialize the cost price and selling price
        int costPrice = 129;
        int sellingPrice = 191;

        // Calculate the total profit
        int totalProfit = sellingPrice - costPrice;

        // Calculate the profit percentage
        // Casting costPrice to double to avoid integer division
        double profitPercentage = (totalProfit / (double) costPrice) * 100;

        // Display the cost price, selling price, profit, and profit percentage
        System.out.println("The Cost Price is INR " + costPrice + 
                           " and Selling Price is INR " + sellingPrice +
                           ".\nThe Profit is INR " + totalProfit + 
                           " and the Profit Percentage is " + profitPercentage + "%");
    }
}
