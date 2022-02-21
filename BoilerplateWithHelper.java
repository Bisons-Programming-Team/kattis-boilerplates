import java.util.Scanner;

public class BoilerplateWithHelper {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        /*
        // INPUT STYLE: Single String
        String input = in.nextLine();
        */

        // INPUT STYLE: Test Cases
        int testCases = in.nextInt();
        for (int i=0; i<testCases; i++){
            int input = in.nextInt();
            // Your input processing code
            helperFunction(input);
        }
        in.close();
    }

    private static void helperFunction(int param) {
        //
        // YOUR SOLUTION CODE
        //
        System.out.println("Your Output");
    }
}
