import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        for ( int j = 0; j < array.length-2; j++){
            if (array[j] == array[j] && array[j] + 1 == array[j+1] && array[j] + 2 == array[j+2] ){
                count++;
            }
        }
        System.out.println(count);
    }
}