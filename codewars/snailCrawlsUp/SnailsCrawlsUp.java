package snailCrawlsUp;
import java.math.BigDecimal;
import java.util.ArrayList;

public class SnailsCrawlsUp {
    
    public static void main(String[] args) {
        
      System.out.println(snail(5,10,3));
    }
    
    public static int snail(int column, int day, int night) {
    	
    	int dailyClimbIncrement = day - night;
    	
    	double totalRequiredDaysClimb = (double) column / (double) dailyClimbIncrement;
    	double roundedTotalRequiredDaysClimb = Math.ceil((double) column / (double) dailyClimbIncrement);
        return (int) roundedTotalRequiredDaysClimb;
    }
   
}
