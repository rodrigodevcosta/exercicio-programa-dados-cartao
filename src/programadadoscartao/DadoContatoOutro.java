
package programadadoscartao;

import java.io.Serializable;

public class DadoContatoOutro implements Serializable{
   private String nome;
   private String telefone_fixo;
   private String email;
   
    public String obterNome(){
        return nome;
    }
    public String obterTelefoneFixo(){
        return telefone_fixo;
    }
    public String obterEmail(){
        return email;
    }
    public void atualizarNome(String nome){
        this.nome = nome;
    }
    public void atualizarTelefoneFixo(String telefone_fixo){
        this.telefone_fixo = telefone_fixo;
    }
    public void atualizarEmail(String email){
        this.email = email;
    }
}
