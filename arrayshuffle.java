import java.util.Scanner;
import java.lang.Math;

public class arrayshuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original[] = { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th" };
        int i1 = 0;
        System.out.println("Original Array:");
        while (i1 < original.length) {
            System.out.print(original[i1] + " ");
            i1++;
        }

        int org1 = 0;
        while (org1 < original.length) {
            double random = Math.random() * 10;
            int r1 = (int) Math.round(random);
            if (r1 == 10) {
                r1--;
            }
            original[org1] = original[r1];
            org1++;
        }
        int i2 = 0;
        System.out.println("\nNew Array:");
        while (i2 < original.length) {
            System.out.print(original[i2] + " "); // shuffled array
            i2++;
        }
    }
}