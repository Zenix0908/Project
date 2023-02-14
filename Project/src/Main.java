import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t Добро пожаловать в калькулятор BMI");
        System.out.println(" Введите вашу массу (кг)");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Введите ваш рост (м^2)");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("Ваш BMI составляет\t" + (a/(b*b)));
    }
}
