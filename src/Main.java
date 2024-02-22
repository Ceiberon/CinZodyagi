import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int date;


        Scanner input = new Scanner(System.in);
        System.out.println("Doğum tarihiniz ?");
        date = input.nextInt();

        if (date < 1880) {
            System.out.println("Bu kadar yaşlı olamazsınız herhalde değil mi");
        } else {

            int kalan = (date % 12);



            if (kalan == 0) {
                System.out.println("Çin zodyağınız Maymun");

            }
            if (kalan == 1) {
                System.out.println("Çin zodyağınız Horoz");

            }
            if (kalan == 2) {
                System.out.println("Çin zodyağınız Köpek");

            }
            if (kalan == 3) {
                System.out.println("Çin zodyağınız Domuz");

            }
            if (kalan == 4) {
                System.out.println("Çin zodyağınız Fare");

            }
            if (kalan == 5) {
                System.out.println("Çin zodyağınız öküz");

            }
            if (kalan == 6) {
                System.out.println("Çin zodyağınız Kaplan");

            }
            if (kalan == 7) {
                System.out.println("Çin zodyağınız Tavşan");

            }
            if (kalan == 8) {
                System.out.println("Çin zodyağınız Ejderha");

            }
            if (kalan == 9) {
                System.out.println("Çin zodyağınız Yılan ");

            }
            if (kalan == 10) {
                System.out.println("Çin zodyağınız At");

            }
            if (kalan == 11) {
                System.out.println("Çin zodyağınız Koyun");

            }

        }

    }
}