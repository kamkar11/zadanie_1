
import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        int c = 0;
        Scanner input = new Scanner(System.in);

        while (c == 0) {

            System.out.println("Podaj numer zadania: [od 1 do 5] ( aby wyjść wybierz 0 )");
            int n = input.nextInt();

            if (n == 1) {

                int a = 5;
                int b = 5;

                System.out.println("Liczba 1: " + a + " Liczba 2: " + b);
                System.out.println("Suma: " + (a + b));
                System.out.println("Różnica: " + (a - b));
                System.out.println("Iloczyn: " + (a * b));
                System.out.println("Iloraz: " + (a / b));

            } else if (n == 2) {

                //Scanner input = new Scanner(System.in);
                System.out.println("Podaj pierwszą liczbę: ");
                int liczba1 = input.nextInt();
                System.out.println("Podaj drugą liczbę: ");
                int liczba2 = input.nextInt();

                System.out.println("Liczba 1: " + liczba1 + " Liczba 2: " + liczba2);
                System.out.println("Suma: " + (liczba1 + liczba2));
                System.out.println("Różnica: " + (liczba1 - liczba2));
                System.out.println("Iloczyn: " + (liczba1 * liczba2));
                System.out.println("Iloraz: " + (liczba1 / liczba2));

            } else if (n == 3) {

                double liczba1 = 5.5;
                double liczba2 = 5.5;

                System.out.println("Liczba 1: " + liczba1 + " Liczba 2: " + liczba2);
                System.out.println("Suma: " + (liczba1 + liczba2));
                System.out.println("Różnica: " + (liczba1 - liczba2));
                System.out.println("Iloczyn: " + (liczba1 * liczba2));
                System.out.println("Iloraz: " + (liczba1 / liczba2));

            } else if (n == 4) {

                //Scanner input = new Scanner(System.in);
                System.out.println("Podaj pierwszą liczbę: ");
                double liczba1 = input.nextDouble();
                System.out.println("Podaj drugą liczbę: ");
                double liczba2 = input.nextDouble();

                System.out.println("Liczba 1: " + liczba1 + " Liczba 2: " + liczba2);
                System.out.println("Suma: " + (liczba1 + liczba2));
                System.out.println("Różnica: " + (liczba1 - liczba2));
                System.out.println("Iloczyn: " + (liczba1 * liczba2));
                System.out.println("Iloraz: " + (liczba1 / liczba2));

            } else if (n == 5) {

                //Scanner input = new Scanner(System.in);
                System.out.println("Podaj x: ");
                double x = input.nextDouble();

                System.out.println("x + 1/x: " + (x + (1 / x)));
                System.out.println("sin(2x) + cos^2(x): " + (Math.sin(2 * x) + Math.pow(Math.cos(x), 2)));
                System.out.println("sqrt(x^2+3*x-8): " + (Math.sqrt(Math.pow(x, 2) + (3 * x) - 8)));

            } else if (n == 0) {
                c = 1;
            } else {
                System.out.println("Nie ma takiego zadania");
            }

        }
    }

}
