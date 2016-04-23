import java.util.Scanner;
import java.util.stream.Stream;

public class Problem1_StuckNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sN = in.nextLine();
        int n = Integer.parseInt(sN);

        String[] sNums = in.nextLine().split(" ");

        int count = 0;

        for (String number : sNums) {
            for (String number0 : sNums) {
                if (number.equals(number0)) {
                    continue;
                }
                for (String number1 : sNums) {
                    if (number.equals(number1) || number0.equals(number1)) {
                        continue;
                    }
                    for (String number2 : sNums) {
                        if (number.equals(number2) || number0.equals(number2) || number1.equals(number2)) {
                            continue;
                        }
                        if ((number + number0).equals(number1 + number2)) {
                            System.out.println(number + "|" + number0 + "==" + number1 + "|" + number2);
                            count++;
                        }

                    }

                }

            }

        }
        if (count == 0) {
            System.out.println("No");
        }
    }
}
