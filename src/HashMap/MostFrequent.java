package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostFrequent {

    public static void frequency(int arr[]){
        Map<Integer,Integer>map=new HashMap<>();
        for (int ele: arr) {
            if(!map.containsKey(ele)){
                map.put(ele,1);
            }
            else {
                map.put(ele,map.get(ele)+1);
            }

        }
        System.out.println(map.entrySet());
    }

public static void frequency2(int arr[]) {//111234

    int count = 1;
    int max = 1;

    for (int i = 1; i < arr.length; i++) {
        if(arr[i]==arr[i-1]) {
        count++;
        }
        else if (count > max) {
            max = count;
            System.out.println(arr[i-1]+"-->"+max);
            max=1;
            count = 1;

        }
        else {
            System.out.println(arr[i]+"-->"+max);
        }

    }

    }



    public static void main(String[] args) {

        int arr[]={1,3,2,1,4,1};
        Arrays.sort(arr);
       frequency2(arr);


        //frequency(arr);

    }
}
