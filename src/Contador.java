import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int primeiroNumero = input.nextInt();

        System.out.println("Digite o segundo número:");
        int segundoNumero = input.nextInt();

        try {
            contarNumeros(primeiroNumero, segundoNumero);

        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void contarNumeros(int inicio, int fim) throws ParametrosInvalidosException {
        if (inicio >= fim) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro");
        }

        for (int i = inicio; i <= fim; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
