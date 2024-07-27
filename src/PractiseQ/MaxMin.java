package PractiseQ;
//Find Max and min ele in an array
public class MaxMin {
    public static void main(String[] args) {
        int arr[]={1,3,1,2,7};
        max(arr);
    }
   static void max(int arr[]){
        int max=arr[0];;
        int min=arr[0];
        int sum=0;
       for (int i = 0; i < arr.length ; i++) {
           if(arr[i]>max){
               max=arr[i];

           }
           if(arr[i]<min){
               min=arr[i];

           }
       sum=max+min;
       }

       System.out.println(+max);
       System.out.println(+min);
       System.out.println(sum);
   }
}
