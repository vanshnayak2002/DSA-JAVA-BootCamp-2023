package PatternsQ;

public class basics {
    public static void main(String[] args) {
        pattern4(5);
    }

    static void pattern7(int n){
        for (int row = 1; row <=2*n ; row++) {
            int noofcolinrow=row>n?2*n-row:row;
            for (int s = 0; s < n-noofcolinrow ; s++) {
                System.out.print("  ");
            }

            for (int col = noofcolinrow; col >=1 ; col--) {
                System.out.print(col + " ");
            }
                for (int col = 2; col <=noofcolinrow ; col++) {
                    System.out.print(col + " ");
                }
            System.out.println();
            }

    }

//palindrome and spces
    static  void pattern6(int n){
        for (int row = 1; row <=n ; row++) {
            int noofpaces=n-row;
            for (int s = 0; s <noofpaces ; s++) {
                System.out.print(" ");
            }
            for (int col = row; col >=1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <=row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static  void pattern5(int n){
        for (int row = 0; row <2*n ; row++) {
            int totalnoofcol=row>n?2*n-row:row;
            int noofspaces=n-totalnoofcol;
            for (int s = 0; s <noofspaces ; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalnoofcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n ){
        for (int row = 0; row <2*n ; row++) {
            int totalcolinrows=row>n?2*n-row:row;
            for (int col = 0; col <totalcolinrows ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

  static void pattern2(int n){
      for (int row = 1; row <=n ; row++) {
          for (int col = 1; col <=n ; col++) {
              System.out.print("* ");
          }
          System.out.println();
      }
  }

  static void pattern3(int n ){
      for (int row = 1; row <=n ; row++) {
          for (int col =1 ; col==n ; col--) {
              System.out.print("*");
          }
          System.out.println();
      }
  }


}


