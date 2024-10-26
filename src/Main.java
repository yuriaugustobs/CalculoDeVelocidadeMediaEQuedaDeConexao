import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // Criando scanner, para receber os valores via terminal
        Scanner scanner = new Scanner(System.in);

        // Apresentação do programa
        System.out.println("Olá, seja bem-vindo ao Net.Calculator!");
        System.out.println("Por favor, escreva os valores de velocidade da sua internet separados por vírgula!");

        // Recebendo valores do cliente via terminal através do scanner
        String input = scanner.nextLine();

        // Dividindo o array de strings por vírgula usando a função .split
        String[] valoresInternet = input.split(",");

        // Convertendo o array de strings para uma Stream
        // Convertendo cada número do ArrayStream para Double
        double soma = Arrays.stream(valoresInternet)
                            .mapToDouble(valor -> Double.parseDouble(valor.trim())) 
                            .sum();

        double media = soma / valoresInternet.length; 

        // Exibe os resultados
        System.out.println("A média dos valores é:" + media + "Mbps");

        scanner.close();  // Fecha o Scanner
    }
}
