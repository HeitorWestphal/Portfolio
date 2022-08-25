package bhaskara;

import javax.swing.JOptionPane;

public class Bhaskara {

    
    public static void main(String[] args) {
        
      int a,b,c;
      double delta, valorfinalp, valorfinaln;
      
      String resposta1 = JOptionPane.showInputDialog("Você tem o valor de delta? 's/n'");
      String Sim = "s";
      String Não = "n";
      
      if (resposta1.equals(Sim)) { 
          delta = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de delta:"));
          
          if (delta >= 0) { 
              a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
              b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));
              valorfinalp = (double) ((-(b) + Math.sqrt(delta)) / (2 * a));
              valorfinaln = (double) ((-(b) - Math.sqrt(delta)) / (2 * a));
              JOptionPane.showMessageDialog(null,"o valor final da bhaskara positivo será de: "+valorfinalp+", já o valor final negativo será de: "+valorfinaln);
          }
          else {
              JOptionPane.showMessageDialog(null, "O delta não possui raiz");
          }    
      }
      else if (resposta1.equals(Não));
              a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
              b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));
              c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C:"));
              
              delta = (b*b)+(-4*(a*c));
              
              if (delta >= 0) {
                  valorfinalp = (double) ((-(b) + Math.sqrt(delta)) / (2 * a));
                  valorfinaln = (double) ((-(b) - Math.sqrt(delta)) /(2 * a));
                  JOptionPane.showMessageDialog(null,"O valor de delta será de "+delta);
                  JOptionPane.showMessageDialog(null,"o valor final da bhaskara positivo será de: "+valorfinalp+", já o valor final negativo será de: "+valorfinaln); 
                  
              }
              else {
                  JOptionPane.showMessageDialog(null,"Delta não possui raiz");
              } 
                  
    }
    
}
