private void btnRmvActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String elemento = campoItem.getText();//Obter Texto
        lista.remove(elemento);// adicionar na lista
        campoItem.setText(null);//Limpar o campo de texto
       exibeLista();
    }                                      
    public void exibeLista(){
         String html = "<html>Lista de Itens<br><br>";
        for(String item : lista){
            html += item+"<br>";
        }
        resposta.setText(html);
    }
    public boolean verificaSeExsite(String palavra){
        for(String item : lista){
            if(item.equals(palavra)){
                return true;
            }
        }
        return false;
