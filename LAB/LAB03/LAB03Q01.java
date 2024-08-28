import java.util.Scanner;

public class LAB03Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String expressao = scanner.nextLine();

            if (expressao.equalsIgnoreCase("FIM")) {
                break;
            }

            if (verificaParentesesCorretos(expressao)) {
                System.out.println("correto");
            } else {
                System.out.println("incorreto");
            }
        }

        scanner.close();
    }

    public static boolean verificaParentesesCorretos(String expressao) {
        int contadorParenteses = 0;

        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                contadorParenteses++;
            } else if (c == ')') {
                contadorParenteses--;
            }

            if (contadorParenteses < 0) {
                return false;
            }
        }

        return contadorParenteses == 0;
    }
}
