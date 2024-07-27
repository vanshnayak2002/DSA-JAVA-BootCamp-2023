package PractiseQ;

public class stringduplicated {
    public static void main(String[] args) {
        String str = "baccad";
        Dupli(str,'a');
    }

    public static void Dupli(String str, char dupl) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == dupl)
                continue;
            else {
                System.out.println(str.charAt(i));
            }

        }
    }
}
