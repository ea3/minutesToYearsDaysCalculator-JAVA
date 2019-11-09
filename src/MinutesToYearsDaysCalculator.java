public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }else{

            long minutesToYears = (minutes) / (525600);
            long remainderMinutes = (minutes) % (525600);
            long minutesToDays= (remainderMinutes)/(1440);
            System.out.println(minutes + " min = "+ minutesToYears + " y and "+ minutesToDays + " d");

        }

    }

}
