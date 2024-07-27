package PractiseQ;


import java.util.ArrayList;
import java.util.List;

public class candles {
    public static int birthdayCakeCandles(List<Integer> candles) {

        int count=0;
        int max=0;
        for(int i=0;i<candles.size();i++){
            if(max<candles.get(i)){
                max=candles.get(i);
                count++;
            }
            else if (max==candles.get(i)){
                count++;
            }

        }
        return count;
    }



    public static void main(String[] args) {

        List<Integer>candles=new ArrayList<>();
        //10
        //18 90 90 13 90 75 90 8 90 43
        candles.add(18);
        candles.add(90);
        candles.add(90);
        candles.add(13);
        candles.add(90);
        candles.add(75);
        candles.add(90);
        candles.add(8);
        candles.add(90);
        candles.add(43);
        int ans=birthdayCakeCandles(candles);
        System.out.println(ans);

    }
}
