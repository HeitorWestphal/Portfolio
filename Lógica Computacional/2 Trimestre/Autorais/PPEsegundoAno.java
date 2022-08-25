package ppe.segundo.ano;

import javax.swing.JOptionPane;


public class PPESegundoAno {

    
    public static void main(String[] args) {
       
        int repeticoes = 5;
        
        int v[] = new int [repeticoes];
        
        for(int i = 0; i < v.length; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os cinco valores"));
        }
        for(int i = 0; i < v.length; i++) {
           if (v[i]%2==0) {
               JOptionPane.showMessageDialog(null,"O número "+v[i]+" é par");
           }
           else {
               JOptionPane.showMessageDialog(null,"O número "+v[i]+" é impar");
           }
        }
        for (int i = 0; i < v.length; i++) {
            if (v[i] <= 0) {
                JOptionPane.showMessageDialog(null,"O número "+v[i]+" é negativo");
            }
            else {
                JOptionPane.showMessageDialog(null,"O número "+v[i]+" é positivo");
            }
        }
    }
    
}
