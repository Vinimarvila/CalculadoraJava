import java.util.Scanner;

public class TestaCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operador;

        System.out.println("Calculadora - Digite um operador (+, -, *, /) e dois números.");
        System.out.println("Digite '.' para sair.");

        while (true) {
            System.out.print("Operador: ");
            operador = scanner.next();

            // Sai do loop se o usuário digitar "."
            if (operador.equals(".")) {
                System.out.println("Encerrando a calculadora.");
                break;
            }

            // Lê os dois números
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            // Cria uma instância da calculadora com os números fornecidos
            Calculadora calc = new Calculadora(num1, num2);

            // Executa a operação escolhida
            int resultado;
            switch (operador) {
                case "+":
                    resultado = calc.some();
                    System.out.println("Resultado: " + resultado);
                    break;
                case "-":
                    resultado = calc.subtraia();
                    System.out.println("Resultado: " + resultado);
                    break;
                case "*":
                    resultado = calc.multiplique();
                    System.out.println("Resultado: " + resultado);
                    break;
                case "/":
                    resultado = calc.divida();
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    System.out.println("Operador inválido! Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
