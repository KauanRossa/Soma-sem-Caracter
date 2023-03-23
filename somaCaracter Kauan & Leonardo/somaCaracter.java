import java.util.Scanner;

public class somaCaracter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1, v2;
        try {
            System.out.println("Digite o primeiro valor: ");
            v1 = sc.nextInt();
            try {
                System.out.println("Digite o segundo valor: ");
                v2 = sc.nextInt();
                System.out.println("O resultado é: " + (v1 + v2));
            } catch (Exception e) {
                System.out.println("Valor invalido, Somente numero são aceitos");
            }

        } catch (Exception e) {
            System.out.println("Valor invalido, somente numeros são aceitos");
        }
    }

}
