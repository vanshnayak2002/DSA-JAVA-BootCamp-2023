package PRACTISE2024.ARRAY;
class Pair{
    int max;
    int min;
}
public class MAX_MIN {
//Using Divide and Concour

    static Pair findMinMax(int arr[], int start, int end) {

        Pair minmax = new Pair();
        Pair leftside = new Pair();
        Pair rightside = new Pair();

        if (start == end) {
            minmax.max = arr[start];
            minmax.min = arr[start];
            return minmax;

        }  if (end == start + 1) {
            if (arr[start] > arr[end]) {
                minmax.max = arr[start];
                minmax.min = arr[end];
            } else {
                minmax.max = arr[end];
                minmax.min = arr[start];
            }
        return minmax;
        }
        int mid=start+(end-start)/2;
        leftside=findMinMax(arr,0,mid);
        rightside=findMinMax(arr,mid+1,end);

      if(leftside.max>rightside.max){
        minmax.max=leftside.max;
      }
      else{
          minmax.max=rightside.max;
      }

      if(leftside.min<rightside.min){
         minmax.min= leftside.min;
      }
      else{
          minmax.min=rightside.min;
      }





        return minmax;
    }


public static void main(String[] args) {
    int arr[]={10,4,5,11,1,3};

  Pair result=findMinMax(arr,0,5);
    System.out.println(result.max + " " + result.min);
    }
}
