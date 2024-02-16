
package programadadoscartao;

public class DadoContatoPessoal extends DadoContatoOutro {
    private String telefone_movel;
    
    public String obterTelefoneMovel(){
        return telefone_movel;
    }
    public void atualizarTelefoneMovel(String telefone_movel){
        this.telefone_movel = telefone_movel;
    } 
}
