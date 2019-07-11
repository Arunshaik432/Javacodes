import java.util.Scanner;

public class lexico {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String simple[] = new String[s.length()-(k - 1)];
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for (int j = 0; j < simple.length; j++) {
            for (int i = 0; i < s.length() - k + 1; i++) {
                simple[j] = s.substring(i, i + k);
                j++;







            }
        }
        for(int m = 0; m < simple.length; ++m) {
            for (int n = m + 1; n < simple.length; ++n) {
                if (simple[m].compareTo(simple[n]) > 0) {
                    // swap words[i] with words[j[
                    String temp = simple[m];
                    simple[m] = simple[n];
                    simple[n] = temp;

                }
            }
        }
        smallest=simple[0];
        largest=simple[simple.length-1];




        return smallest +"\n" + largest;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}