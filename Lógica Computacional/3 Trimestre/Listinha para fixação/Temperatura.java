
package temperatura;

import java.util.Scanner;

public class Temperatura {

  
    public static void main(String[] args) {
        
        Scanner entrada = new java.util.Scanner(System.in);
        
        System.out.println("Digite o valor que você quer transformar");
        int valor = entrada.nextInt();
        System.out.println("Digite 1 para transformar de Celsus para Fahrenhei ou, digite 2 para transformar Fahrenhei em Celsius");
        int decisao = entrada.nextInt();
       
        if (decisao == 1){
            int transformaçao = (valor *(9/5))+32;
            System.out.println(+transformaçao+"  °F");       
        }
        else{
            int transformaçao = (valor - 32)*(5/9);
            System.out.println(+transformaçao+" °C");
        }
    }
    
}
