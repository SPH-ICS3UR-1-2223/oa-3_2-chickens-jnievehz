public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
        int totalEggs = 0;
    int eggsPerChicken = 4;
        int chickenCount = 8;
        // MONDAY
        totalEggs = eggsPerChicken * chickenCount;
        // TUESDAY
        totalEggs += eggsPerChicken * chickenCount;
        //WEDNESDAY
        chickenCount /= 2;
        totalEggs += eggsPerChicken * chickenCount;
       
        double eggCount = 100;
        double dailyAverage = 0;
        double monthlyAverage = dailyAverage * 30;
        double monthlyProfit = 0;
       
        //Monday
        eggCount += 100; //Collect 100 eggs
        //Tuesday
        eggCount += 121; //Collect 121
        //Wednesday
        eggCount += 117; //Collect 117 eggs
       
        //Calculate Daily Average
        dailyAverage = eggCount / 3;
        System.out.println("Daily Average:   " +dailyAverage);
        //Calculate Monthly Average
        monthlyAverage = dailyAverage * 30;
        System.out.println("Monthly Average: " +monthlyAverage);
        //Calculate Monthly Profit
        monthlyProfit = monthlyAverage * 0.18;
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
   
}

