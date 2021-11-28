import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш возраст:");
        int age = scanner.nextInt();
        if (age > 112) {
            System.out.println("Введенный возраст слишком большой.");
        } else if (age < 1) {
            System.out.println("Введенный возраст слишком мал.");
        } else if (age % 10 == 0 || age % 10 >= 5 || age / 10 % 10 == 1) {
            System.out.println("Вам " + age + " лет.");
        } else if (age % 10 == 1) {
            System.out.println("Вам " + age + " год.");
        } else {
            System.out.println("Вам " + age + " года.");
        }
    }
}
