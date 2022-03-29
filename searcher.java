import java.util.Scanner;

public class searcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data[] = { "Delhi", "Fathepur", "Lucknow", "Indore", "Kanpur" }; // Add more if you want
        int i = 0;
        System.out.println("Data we Have which you can search:");
        while (i < data.length) {
            System.out.print(data[i] + "\n");
            i++;
        }
        System.out.println("\nEnter a Word fo Search:");
        String input = sc.next();

        int s1 = 0;
        while (s1 < data.length) {
            if (input.matches(data[s1])) { // matching the string with every data on array
                System.out.println("Got it at Data Array at Position " + s1);
                s1 = 100; // for stopping the loop
            } else {

                s1++; // +1 array position if no data found
            }
        }
        if (s1 != 100) { // s1 don't gets value 100 if data is not found
            System.out.println("Data not Found!"); // showing the not fount data
        }
    }

}