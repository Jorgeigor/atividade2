import java.util.Scanner;

public class EXERCICIO2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Conversor de Temperatura!");
        
        while (true) {
            System.out.println("Escolha a direção da conversão:");
            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Fahrenheit para Celsius");
            System.out.println("3. Encerrar o programa");
            int escolha = scanner.nextInt();

            double temperatura;
            double resultado;

            if (escolha == 1) {
                System.out.print("Digite a temperatura em Celsius: ");
                temperatura = scanner.nextDouble();
                resultado = celsiusParaFahrenheit(temperatura);
                System.out.println("Resultado: " + resultado + " Fahrenheit");
            } else if (escolha == 2) {
                System.out.print("Digite a temperatura em Fahrenheit: ");
                temperatura = scanner.nextDouble();
                resultado = fahrenheitParaCelsius(temperatura);
                System.out.println("Resultado: " + resultado + " Celsius");
            } else if (escolha == 3) {
                System.out.println("Encerrando o programa. Obrigado!");
                break; // Encerra o loop e o programa
            } else {
                System.out.println("Escolha inválida. Por favor, selecione 1, 2 ou 3.");
            }
        }
    }

    // Método para converter de Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Método para converter de Fahrenheit para Celsius
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}


