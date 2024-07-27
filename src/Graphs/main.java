package Graphs;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class main {


    static void reverseArray(List<Integer>Input){
        int sum;
        int max=0;
        int min=Input.get(0);
        for (int i = 0; i <Input.size() ; i++) {
            for (int j = i+1; j <Input.size() ; j++) {
                System.out.print(Input.get(j));
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        List<Integer> Input=new ArrayList<>();
        Input.add(1);
        Input.add(2);
        Input.add(3);
        Input.add(4);

        reverseArray(Input);
    }
}
