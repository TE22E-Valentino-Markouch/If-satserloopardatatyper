import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        storreEn();

        Anvendarnamn();


        System.out.println("Mata in en valfri sifra:");
        intInput();
        //string2Int();
    }


    private static void storreEn() {
        if (6 > 3) {
            System.out.println("Hello World!");
        }
    }

    private static void Anvendarnamn() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Hämta användarnamn från användaren
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();

            // Kontrollera om användarnamnet är "noname"
            if (username.equals("noname")) {
                System.out.println("Welcome!");
                break;
            }

            else{}
        }
    }






    private static void intInput() {
        Scanner in = new Scanner(System.in);
        int num = 0;
        while (true) {
            try {
                num = in.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("NaN try again");
                in.nextLine();

            }
        }

    }

    private static void string2Int() {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        while (true) {
            String myst = scan.nextLine();

            try {
                num = Integer.parseInt(myst);
                break;
            } catch (Exception e) {
                System.out.println("not a number try again");
            }

        }
    }


}