import java.util.*;

public class LAB04Q01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            if (N == 0 && M == 0) {
                // Se os valores forem 0 0, termine o programa
                System.out.println("0 0");
                break;
            }

            // Armazene os números
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                numbers.add(sc.nextInt());
            }

            // Ordenar a lista com base nas regras fornecidas
            Collections.sort(numbers, (a, b) -> {
                int modA = a % M;
                int modB = b % M;

                // Comparar os valores modulares
                if (modA != modB) {
                    return Integer.compare(modA, modB);
                }

                // Se houver empate entre números ímpares e pares
                boolean isAOdd = (a % 2 != 0);
                boolean isBOdd = (b % 2 != 0);

                if (isAOdd && !isBOdd) {
                    return -1; // Ímpar vem antes do par
                } else if (!isAOdd && isBOdd) {
                    return 1; // Par vem depois do ímpar
                }

                // Se houver empate entre dois ímpares
                if (isAOdd && isBOdd) {
                    return Integer.compare(b, a); // Ímpar maior vem antes
                }

                // Se houver empate entre dois pares
                return Integer.compare(a, b); // Par menor vem antes
            });

            // Imprimir os resultados
            System.out.println(N + " " + M);
            for (int num : numbers) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}
