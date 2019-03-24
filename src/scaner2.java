import java.util.Scanner;

public class scaner2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        sc.nextLine();
        String nome = sc.nextLine();
        char gender = sc.next().charAt(0);
        String s = sc.next();
        char letter = s.charAt(0);
        int digit = Integer.parseInt(s.substring(1));

        System.out.println(n1);
        System.out.println(nome);
        System.out.println(gender);
        System.out.println(letter);
        System.out.println(digit);
    }
}
