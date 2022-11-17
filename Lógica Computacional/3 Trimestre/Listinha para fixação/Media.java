
package media;

import java.util.Scanner;


public class Media {

   
    public static void main(String[] args) {
       
        Scanner entrada = new java.util.Scanner(System.in);
        
        System.out.println("Digite seu nome");
        String aluno = entrada.next();
        System.out.println("Digite sua primeira nota");
        float nota1 = entrada.nextFloat();
        System.out.println("Digite sua segunda nota");
        float nota2 = entrada.nextFloat();
        System.out.println("Digite sua terceira nota");
        float nota3 = entrada.nextFloat();
        
        float media = (nota1+nota2+nota3)/3;
        
        if (media>=6){
            System.out.println("Olá "+aluno+" sua media foi: "+media+". Parabéns você foi aprovado.");
    }
        else{
            System.out.println("Olá "+aluno+" sua media foi: "+media+". Infelizmente você reprovou, mais sorte da proxíma vez.");
        }
        
    }
    
}
