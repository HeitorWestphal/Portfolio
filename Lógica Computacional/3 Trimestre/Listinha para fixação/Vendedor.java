
package vendedor;

import java.util.Scanner;


public class Vendedor {

    
    public static void main(String[] args) {
        
        Scanner entrada = new java.util.Scanner(System.in);
        
        System.out.println("Digite seu nome");
        String nome = entrada.next();
        System.out.println("Digite suas vendas em reais");
        float vendas = entrada.nextFloat();
        System.out.println("Digite seu salário fixo");
        float salario = entrada.nextFloat(); 
        float comissao = (vendas/100)*15;
        float total = salario+comissao;
        
        System.out.println("Olá "+nome+" seu salário fixo é de: "+salario+" e você vai ganhar: R$ "+comissao+" somando no final do mês: R$ "+total);
        
        
    }
    
}
