import java.util.Scanner;

public class Main {

    //  Main
    public static void main(String[] args) {


        storreEn();

        Anvendarnamn();

        System.out.println("Mata in en valfri sifra:");
        intInput();
        //string2Int();

        HelloWorld();

        HögreÄn();

        GissaSiffran();
    }

    //  Basic större än kod
    private static void storreEn() {
        if (6 > 3) {
            System.out.println("Hello World!");
        }
    }

    //  Användarnamn
    private static void Anvendarnamn() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Hämta användarnamn från användaren
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();

            // Hämta lössenord från användaren
            System.out.println("Enter your password: ");
            String password = scanner.nextLine();


            // Kontrollera om användarnamnet är "noname"
            if (username.equals("noname") && password.equals("nopass")) {
                System.out.println("Welcome!");
                break;
            } else {
                System.out.println("Wrong username or password!");
            }
        }
    }


    //  Basic Input line 1
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

    //  Basic Input line 2
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

    private static void HelloWorld() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

    }

    private static void HögreÄn() {

        Scanner scanner = new Scanner(System.in);

        // Kör loopen 5 gånger
        for (int i = 0; i < 5; i++) {
            System.out.print("Skriv in ett tal: ");
            int tal = scanner.nextInt(); // Läser in ett heltal från användaren

            // Kontrollera om talet är högre än 5
            if (tal > 5) {
                System.out.println("Högre än 5!");
            } else {
                System.out.println("Mindre än 5!");
            }
        }
    }

    private static void GissaSiffran() {
        int randomNum = (int) (Math.random() * 101); // 0 to 100
        System.out.println("Gissa på en siffra mellan 0 till 100:");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int tal = scanner.nextInt(); // Användarens val
            if (randomNum == tal) {
                System.out.println("Rätt");
                break;
            } else if (randomNum > tal) {
                System.out.println("Fel!");
                System.out.println("Siffran du letar efter är större");
            } else if (randomNum < tal) {
                System.out.println("Fel!");
                System.out.println("Siffran du letar efter är mindre");
            } else {
                System.out.println("Var vänligen och ange ett nummer");
            }


        }


    }


}