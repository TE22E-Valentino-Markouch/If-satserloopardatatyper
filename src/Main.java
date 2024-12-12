import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Mata in en valfri sifra:");
        //string2Int();
        intInput();
    }

    private static void intInput() {
        Scanner in = new Scanner(System.in);
        int num = 0;
        while(true) {
            try {
                num = in.nextInt();
                break;
            }catch(Exception e) {
                System.out.println("NaN try again");
                in.nextLine();

            }
        }

    }

    private static void string2Int() {
        Scanner scan = new Scanner(System.in);
        int num=0;
        while(true) {
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