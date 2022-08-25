package jurossimples;

import java.util.Scanner;

public class JurosSimples {

    
    public static void main(String[] args) {
      
        Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Digite o capital");
        float capital = entrada.nextFloat();
        System.out.println("Digite o valor dos juros");
        float juros = entrada.nextFloat();
        System.out.println("Digite o tempo da aplicação em meses");
        int meses = entrada.nextInt();
        double valorfinal = ((capital * juros * meses)/100 + capital);
        System.out.println("O valor total será de "+valorfinal);
        
        //NÃO SEI FAZER ISSO EM SWING
        //JÁ TENTEI DE TUDO 
        //SORRY =(
        
    }
}

