import java.util.ArrayList;
import java.util.Scanner;

public class Problem2_SumCards {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        String[] sCards = text.split("[SHDC]");
        ArrayList<String> lCards = new ArrayList<>();

        for (int i = 0; i < sCards.length; i++) {
            lCards.add(sCards[i].trim());
        }
        String prev = lCards.get(0);
        int sum = 0;
        int sumSec = 1;

        for (int i = 1; i < lCards.size()+1; i++) {
            if (i == lCards.size()) {
                sum += SumCards(lCards.get(i - 1), sumSec);
            }
            else {
                if (lCards.get(i - 1).equals(lCards.get(i))) {
                    sumSec++;

                } else {
                    sum += SumCards(lCards.get(i - 1), sumSec);
                    sumSec = 1;
                }
            }
        }

        System.out.println(sum);
    }

    private static int SumCards(String s, int sumSec) {
        int sum = 0;
        switch (s) {
            case "2":
                if (sumSec > 1) {
                    sum = (2 * sumSec) * 2;
                } else {
                    sum = 2;
                }
                break;
            case "3":
                if (sumSec > 1) {
                    sum = (3 * sumSec) * 2;
                } else {
                    sum = 3;
                }
                break;
            case "4":
                if (sumSec > 1) {
                    sum = (4 * sumSec) * 2;
                } else {
                    sum = 4;
                }
                break;
            case "5":
                if (sumSec > 1) {
                    sum = (5 * sumSec) * 2;
                } else {
                    sum = 5;
                }
                break;
            case "6":
                if (sumSec > 1) {
                    sum = (6 * sumSec) * 2;
                } else {
                    sum = 6;
                }
                break;
            case "7":
                if (sumSec > 1) {
                    sum = (7 * sumSec) * 2;
                } else {
                    sum = 7;
                }
                break;
            case "8":
                if (sumSec > 1) {
                    sum = (8 * sumSec) * 2;
                } else {
                    sum = 8;
                }
                break;
            case "9":
                if (sumSec > 1) {
                    sum = (9 * sumSec) * 2;
                } else {
                    sum = 9;
                }
                break;
            case "10":
                if (sumSec > 1) {
                    sum = (10 * sumSec) * 2;
                } else {
                    sum = 10;
                }
                break;
            case "J":
                if (sumSec > 1) {
                    sum = (12 * sumSec) * 2;
                } else {
                    sum = 12;
                }
                break;
            case "Q":
                if (sumSec > 1) {
                    sum = (13 * sumSec) * 2;
                } else {
                    sum = 13;
                }
                break;
            case "K":
                if (sumSec > 1) {
                    sum = (14 * sumSec) * 2;
                } else {
                    sum = 14;
                }
                break;
            case "A":
                if (sumSec > 1) {
                    sum = (15 * sumSec) * 2;
                } else {
                    sum = 15;
                }
                break;
        }

        return sum;
    }
}
