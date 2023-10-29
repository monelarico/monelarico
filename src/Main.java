import java.util.Scanner;

class Pythagoras {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi alas (a): ");
        double a = input.nextDouble();

        System.out.print("Masukkan panjang sisi tinggi (b): ");
        double b = input.nextDouble();

        double c = calculateHypotenuse(a, b);
        System.out.println("Panjang sisi miring (c) adalah: " + c);

        input.close();
    }

    public static double calculateHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }
}
