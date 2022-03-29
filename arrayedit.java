import java.util.Scanner;

public class arrayedit {
    public static void main(String[] args) {
        String default1[] = { "1st", "2nd", "3rd", "4th", "5th" };
        Scanner sc = new Scanner(System.in);
        int i1 = 0;
        System.out.println("Original Default Array:");
        while (i1 < default1.length) {
            System.out.print(default1[i1] + " ");
            i1++;
        }
        System.out.println("\nEnter the Position of the Array which you wanna Edit:");
        int pos1 = sc.nextInt();
        System.out.println("Enter the new Data:");
        String new1 = sc.next();
        String newArray[] = arrayedit(default1, pos1, new1); // array editing function
        int i2 = 0;
        System.out.println("Edited Array:");
        while (i2 < newArray.length) {
            System.out.print(newArray[i2] + " ");
            i2++;
        }
    }

    public static String[] arrayedit(String[] array, int position, String new1) { // array editing function
        array[position] = new1;
        return array;
    }
}
