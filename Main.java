import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину забора");
        int length = sc.nextInt();
        Fence fence1 = new Fence();
        fence1.compareSumLength(length);
        sc.close();

    }
}
