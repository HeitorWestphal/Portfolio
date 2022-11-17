
package consumo.médio;

import java.util.Scanner;

public class ConsumoMédio {

   
    public static void main(String[] args) {
        
        Scanner entrada = new java.util.Scanner(System.in);
        
        System.out.println("Digite a distância percorrida pelo automóvel");
        float distancia = entrada.nextFloat();
        System.out.println("Digite o total de combustível gasto");
        float combustivel = entrada.nextFloat();
        float media = distancia/combustivel;
        
        System.out.println("A média de combustível gasto é de: "+media+" Km/l");
        
    }
    
}
