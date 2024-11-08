import java.util.Scanner;
import java.util.Arrays;

public class Terceiro {
    public static void main(String[] args) {
        // Criação do scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        // Criação do vetor de inteiros com 10 posições
        int[] vetor = new int[10];
        
        // Leitura dos 10 números
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        // a Verificar se existe número repetido
        verificarRepetidos(vetor);
        
        // b Contar quantos números negativos existem
        int negativos = contarNegativos(vetor);
        System.out.println("Quantidade de números negativos: " + negativos);
        
        // c Calcular a soma de todos os números
        int soma = calcularSoma(vetor);
        System.out.println("Soma de todos os números: " + soma);
        
        // d Imprimir o vetor em ordem inversa
        System.out.print("Vetor em ordem inversa: ");
        imprimirOrdemInversa(vetor);
        
        // e Ordenar o vetor de menor para o maior
        Arrays.sort(vetor);
        System.out.print("\nVetor ordenado de menor para maior: ");
        imprimirVetor(vetor);
        
        scanner.close();
    }
    
    // a Verifica se existe número repetido
    public static void verificarRepetidos(int[] vetor) {
        boolean repetido = false;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    System.out.println("Número repetido: " + vetor[i]);
                    repetido = true;
                    break;
                }
            }
            if (repetido) break;
        }
        if (!repetido) {
            System.out.println("Não há números repetidos.");
        }
    }
    
    // b Contar quantos números negativos existem no vetor
    public static int contarNegativos(int[] vetor) {
        int contador = 0;
        for (int num : vetor) {
            if (num < 0) {
                contador++;
            }
        }
        return contador;
    }
    
    // c Calcular a soma de todos os números do vetor
    public static int calcularSoma(int[] vetor) {
        int soma = 0;
        for (int num : vetor) {
            soma += num;
        }
        return soma;
    }
    
    // d Imprimir o vetor em ordem inversa
    public static void imprimirOrdemInversa(int[] vetor) {
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
    
    // Função para imprimir o vetor
    public static void imprimirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
