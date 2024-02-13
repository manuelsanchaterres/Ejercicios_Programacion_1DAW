package cuckooClock;

public class CuckooClock {

    public static void main(String[] args) {
        System.out.println(cuckooClock("7:22", 1));
        // System.out.println(cuckooClock(inputTime+","+chimes));
    }
    public static String cuckooClock(String inputTime, int chimes) {
        String[] inputTimeArray = inputTime.split(":");
        int hour = Integer.valueOf(inputTimeArray[0]);
        int minutes = Integer.valueOf(inputTimeArray[1]);
        int currentChimes = 0;
        String hourString = "";
        String minutesString = "";
        if (!(hour >= chimes && minutes == 0)){

            currentChimes += (60-minutes)/15;

            while (currentChimes < chimes){
                hour++;
                if (hour > 12){

                    hour %= 12;
                }  
                currentChimes += (hour + 3);
                       
            }

            int excedingChimes = currentChimes - chimes;
            
            if (excedingChimes > 3){
                if (excedingChimes - 3 < hour && minutes != 0){
                    minutes = 0;
                }
                // else if (excedingChimes - 3 > hour-- && minutes == 0){

                //     minutes = (excedingChimes -3 -hour)*15;
                // }
            } else {
                minutes = ((3- excedingChimes)*15);
            }

            if (hour < 10){

                hourString = "0"+hour;
            }else{

                hourString = ""+hour;
            }

            if (minutes < 10){

                minutesString = "0"+minutes;
            } else {

                minutesString = ""+minutes;
            }

            inputTime = hourString+":"+minutesString;
        }

        return inputTime;
    }
}
