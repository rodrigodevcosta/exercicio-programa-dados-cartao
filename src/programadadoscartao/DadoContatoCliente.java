
package programadadoscartao;

public class DadoContatoCliente extends DadoContatoFornecedor {
    private String cpf;
    private String telefone_comercial;
    

    public String obterCpf(){
        return cpf;
    }
    public String obterTelefoneComercial(){
        return telefone_comercial;
    }
    public void atualizarCpf(String cpf){
        this.cpf = cpf;
    }
    public void atualizarTelefoneComercial(String telefone_comercial){
        this.telefone_comercial = telefone_comercial;
    }
}
