import java.util.*;

public class ArrayQues {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] a = new int[6][6];

            for (int i = 0; i < 6; i++) {
                String[] arrRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 6; j++) {
                    int arrItem = Integer.parseInt(arrRowItems[j]);
                    a[i][j] = arrItem;
                }
            }

            scanner.close();
            System.out.println(a[0].length);

            int[] ar=new int[3];
            int[] ar1=new int[1];
            int[] ar2=new int[3];
            for (int i=0;i<a[0].length;i++){
                int[] arr=a[i];

                for (int j=0;j<ar.length;j++){
                    ar= Arrays.copyOfRange(arr,j,j+3);
                    i++;
                    for (int k=1;k<=4;k++){
                        ar1=Arrays.copyOfRange(arr,k,k);
                        i++;
                        for (int l=0;l<ar2.length;l++){
                            ar2=Arrays.copyOfRange(arr,l,l+3);
                    }

                }

            }

        }
            for (int val:ar1){
                System.out.println(val);
            }
    }

}
