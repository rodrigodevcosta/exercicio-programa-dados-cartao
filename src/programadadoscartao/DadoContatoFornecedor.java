
package programadadoscartao;

public class DadoContatoFornecedor extends DadoContatoOutro {
    private String cnpj;
    private String fax;
    
    public String obterCnpj(){
        return cnpj;
    }
    public String obterFax(){
        return fax;
    }
    public void atualizarCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public void atualizarFax(String fax){
        this.fax = fax;
    }
}
