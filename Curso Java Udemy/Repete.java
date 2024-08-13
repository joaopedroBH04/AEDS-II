import java.util.Scanner;

public class Repete {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float hora;
        
        System.out.println("Que horas são agora?");
        hora = sc.nextFloat(); 
        
        if (hora >= 5 && hora < 12) {
            System.out.println("Então, bom dia!");
            
        } 
        else if (hora >= 12 && hora <= 18) {
            System.out.println("Então, boa tarde!"); 
            
        } 
        else {
            System.out.println("Já está muito tarde!");
            
        }
        
        sc.close();
    }
}
