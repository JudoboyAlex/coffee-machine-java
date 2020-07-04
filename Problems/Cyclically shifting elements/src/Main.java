import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int len = scanner.nextInt();
        int[] array = new int[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        int b[] = new int[array.length];

        System.arraycopy(array, 0, b, 1, array.length-1);
        System.arraycopy(array, array.length-1, b, 0,1);


//        b[0] = b[array.length-1];


        for (int j=0; j<b.length; j++)
            System.out.print(b[j] + " ");
    }
}
