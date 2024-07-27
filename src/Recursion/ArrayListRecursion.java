package Recursion;


import java.util.ArrayList;

public class ArrayListRecursion {

    static ArrayList<Integer> List(int arr[], int target, int n, int idx){
        ArrayList<Integer> ans=new ArrayList<>();
        if(idx>=n){
            return  ans;
        }

        if(arr[idx]==target){

            ans.add(idx);
        }
    ArrayList<Integer>smallans=List(arr,2,6,idx+1);
        ans.addAll(smallans);
    return ans;
    }

    static ArrayList<Integer>List2(int arr[],int target,int n,int idx ,ArrayList<Integer>list){
        if(idx>=n){
            return list;
        }
     if(target==arr[idx]){
         list.add(idx);
     }
         return List2(arr,2,6,idx+1,list);



    }




    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,2};//ans=1,2,5
         int target=2;
         int n=arr.length;
         //ArrayList<Integer> ans=List(arr,2,6,0);
         //for(Integer i:ans){
           //  System.out.println(i);



        //ArrayList<Integer>list=new ArrayList<>();
        //use can also pass list in argument through below example or making above new list pass that list after the inx in ans2
             ArrayList<Integer>ans2=List2(arr,2,6,0,new ArrayList<>());
        System.out.println(ans2);

         }
    }


