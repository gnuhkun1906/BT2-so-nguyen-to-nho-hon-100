import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        System.out.println("Các số nguyên tố nhở hn 100 là:  ");

        for (int i = 2; i <= 100; i++) {
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
                if (check) {
                    System.out.print(i+",");
                }
            }
        }
    }

