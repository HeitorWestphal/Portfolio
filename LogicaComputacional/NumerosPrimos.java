import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner alberto = new Scanner(System.in);//Criação do Scanner
	    int n = alberto.nextInt();//variável 'n' recebe o valor digitado no scanner
		int i = 1;// variável 'i' recebe o valor '1'
		while (i<n){ //Enquanto 'i' for menor do que 'n' faça:
		    int j = i;//variável 'j' recebe o valor de 'i'
		    int d = 0;//variável 'd' inicia com o valor '0'
		    while(j > 0){//enquanto 'j' for maior do que '0' faça:
		        if(i % j == 0){//Se o RESTO da divisão de 'i' por 'j' for 0, faça:
		            d++;//Some '1' no valor de 'd'
		        }//Fim do if
		        j--;//Diminua '1' no valor de 'j'
		    }//fim do while
		    if(d == 2){//Se o valor de 'd' for 2
		        System.out.println(i);//imprima o valor de 'i'
		    }//fim do if
		    i++;//Some '1' no valor de 'i'
		}//fim do while
	}
}