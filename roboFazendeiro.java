import java.util.Scanner;

public class test_ac1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // input para entrada de valores no terminal

        /*
         * Declaração das variaveis de entrada como inteiro,
         * É usado o printf("") para poder dar varias entradas com o enter, ou
         * Digitar os tres valores de entrada com espaço em uma unica linha, conforme os
         * exemplos de entrada do robo fazendeiro mostram.
         */

        // -----------------------------------------
        int numeroEstacoes = input.nextInt();
        System.out.printf("");
        int numeroCasos = input.nextInt();
        System.out.printf("");
        int areaDevastada = input.nextInt();
        System.out.printf("");
        // -----------------------------------------
        int caminho = 1; // variavel do ponto inicial do robô
        int sum = 0; // Variavel que retornará a quantidade de vezes que o robô passou pelo local
        // -----------------------------------------

        for (int i = 1; i <= numeroCasos; i++) { // Estrutura for, irá se repetir enquanto i nao for igual a numeroCasos

            int x = input.nextInt(); // Entrada de x sendo x = 1 ou -1.
            System.out.printf(""); // Também com printf, para poder dar a entrada com espaços ou enter

            if (x == 1 | x == -1) {

                if (caminho > numeroEstacoes) {
                    caminho = 1; // Verifica se o caminho é maior que o numeroEstacoes, se for verdadeiro o
                                 // caminho volta para 1
                }
                if (caminho < 1) { // Verifica se o caminho é menor que 1, como não tem números negativos no
                                   // exemplo,
                    caminho = numeroEstacoes; // o caminho volta para a ultima casa de numeroEstacoes
                }
                if (caminho == areaDevastada) { // Verifica se o atual caminho do robô é igual a entrada de
                                                // areaDevastada,
                    sum++; // Se for verdadeiro, a variavel sum atribui +1
                }
                caminho += x; // Irá somar o atual valor de caminho com o novo valor de entrada de x

                if (i == numeroCasos) { // Verifica se está na ultima condição do looping for

                    if (caminho > numeroEstacoes) { // Se estiver na ultima condição, irá verificar as condiçoes mais
                                                    // uma vez
                        caminho = 1;
                    }
                    if (caminho < 1) {
                        caminho = numeroEstacoes;
                    }
                    if (caminho == areaDevastada) {
                        sum++;
                    }
                }

            } else {
                continue; // Quando o valor de entrada for diferente de 1 ou -1, o algoritmo ignora a
                          // entrada informada
            }
        }

        System.out.print(sum); // Exibe o valor de quantas vezes o robô passou pela estação
        input.close(); // Encerra a entrada declarada como input
    }

}
