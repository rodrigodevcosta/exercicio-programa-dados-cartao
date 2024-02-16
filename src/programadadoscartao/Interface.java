
package programadadoscartao;
import java.util.Scanner;


public class Interface {
    
     Scanner scanner = new Scanner(System.in);
     Controle controle = new Controle();
    
    
    public void incluirContatoOutro(){
        String nome;
        String telefone_fixo;
        String email;
        
        System.out.print("Entre com o nome:");
        nome = scanner.next();
        System.out.print("Entre com o telefone fixo:");
        telefone_fixo = scanner.next();
        System.out.print("Entre com o email:");
        email = scanner.next();
        DadoContatoOutro dadoContatoOutro = new DadoContatoOutro();
        dadoContatoOutro.atualizarNome(nome);
        dadoContatoOutro.atualizarTelefoneFixo(telefone_fixo);
        dadoContatoOutro.atualizarEmail(email);
        controle.incluirContato(dadoContatoOutro);
    }
    public void incluirContatoCliente(){
        String nome;
        String telefone_fixo;
        String email;
        String cpf;
        String cnpj;
        String fax;
        String telefone_comercial;
        int aux;
        boolean valido;
        
        System.out.print("Entre com o nome:");
        nome = scanner.next();
        System.out.print("Entre com o telefone fixo:");
        telefone_fixo = scanner.next();
        System.out.print("Entre com o telefone comercial:");
        telefone_comercial = scanner.next();
        System.out.print("Entre com o email:");
        email = scanner.next();
        System.out.print("Entre com o fax:");
        fax = scanner.next();
        System.out.print("Entre com 1-Para CPF ou 2-Para CNPJ: ");
        aux = scanner.nextInt();
            if(aux == 1){
                cnpj = " ";
               do{
                   System.out.println("Entre com o CPF:");
                    cpf = scanner.next();
                    if(ValidaCPF.isCPF(cpf) == false){
                        System.out.printf("Erro, CPF invalido !!!\n");
                    }
                    valido = ValidaCPF.isCPF(cpf);
                }while(valido != true);
               System.out.printf("%s CPF Valido\n", ValidaCPF.imprimeCPF(cpf));
            }else{
                cpf = " ";
                do{
                   System.out.println("Entre com o CNPJ:");
                    cnpj = scanner.next();
                    if(ValidaCNPJ.isCNPJ(cnpj) == false){
                        System.out.printf("Erro, CNPJ invalido !!!\n");
                    }
                    valido = ValidaCNPJ.isCNPJ(cnpj);
                }while(valido != true);
               System.out.printf("%s CNPJ Valido\n", ValidaCNPJ.imprimeCNPJ(cnpj));
        }
            
            
        DadoContatoCliente dadoContatoCliente = new DadoContatoCliente();
        dadoContatoCliente.atualizarNome(nome);
        dadoContatoCliente.atualizarTelefoneFixo(telefone_fixo);
        dadoContatoCliente.atualizarEmail(email);
        dadoContatoCliente.atualizarCnpj(cnpj);
        dadoContatoCliente.atualizarFax(fax);
        dadoContatoCliente.atualizarCpf(cpf);
        dadoContatoCliente.atualizarTelefoneComercial(telefone_comercial);
        controle.incluirContato(dadoContatoCliente);
    }
    public void incluirContatoFornecedor(){
        String nome;
        String telefone_fixo;
        String email;
        String cnpj;
        String fax;
        boolean valido;
        
        System.out.print("Entre com o nome:");
        nome = scanner.next();
        System.out.print("Entre com o telefone fixo:");
        telefone_fixo = scanner.next();
        System.out.print("Entre com o email:");
        email = scanner.next();
        System.out.print("Entre com o fax:");
        fax = scanner.next();
        do{
            System.out.print("Entre com o CNPJ: ");
            cnpj = scanner.next();
                if(ValidaCNPJ.isCNPJ(cnpj) == false){
                    System.out.printf("Erro, CNPJ invalido !!!\n");
                }
                valido = ValidaCNPJ.isCNPJ(cnpj);
        }while(valido != true);
        
        System.out.printf("%s CNPJ Valido\n", ValidaCNPJ.imprimeCNPJ(cnpj));
        
        DadoContatoFornecedor dadoContatoFornecedor = new DadoContatoFornecedor();
        dadoContatoFornecedor.atualizarNome(nome);
        dadoContatoFornecedor.atualizarTelefoneFixo(telefone_fixo);
        dadoContatoFornecedor.atualizarEmail(email);
        dadoContatoFornecedor.atualizarCnpj(cnpj);
        dadoContatoFornecedor.atualizarFax(fax);
        controle.incluirContato(dadoContatoFornecedor);
    }
    public void incluirContatoPessoal(){
        String nome;
        String telefone_fixo;
        String email;
        String telefone_movel;
        
        System.out.print("Entre com o nome:");
        nome = scanner.next();
        System.out.print("Entre com o telefone fixo:");
        telefone_fixo = scanner.next();
        System.out.print("Entre com o email:");
        email = scanner.next();
        System.out.print("Entre com o telefone movel:");
        telefone_movel = scanner.next();
        
        DadoContatoPessoal dadoContatoPessoal = new DadoContatoPessoal();
        dadoContatoPessoal.atualizarNome(nome);
        dadoContatoPessoal.atualizarTelefoneFixo(telefone_fixo);
        dadoContatoPessoal.atualizarEmail(email);
        dadoContatoPessoal.atualizarTelefoneMovel(telefone_movel);
        controle.incluirContato(dadoContatoPessoal);
        
    }
    public void excluirContatoOutro(){
        String nome;
        
        System.out.print("Informe um nome:");
        nome = scanner.next();
        
        DadoContatoOutro dadoContatoOutro = controle.selecionarContatoOutro(nome);
        if(dadoContatoOutro != null){
            controle.excluirContato(dadoContatoOutro);
            System.out.println("CONTATO EXCLUIDO");
        }else{
            System.out.println("CONTATO NAO ENCONTRADO");
        }
    }
    public void excluirContatoCliente(){
        String nome;
        
        System.out.print("Informe um nome:");
        nome = scanner.next();
        
        DadoContatoCliente dadoContatoCliente = controle.selecionarContatoCliente(nome);
        if(dadoContatoCliente != null){
            controle.excluirContato(dadoContatoCliente);
            System.out.println("CONTATO EXCLUIDO");
        }else{
            System.out.println("CONTATO NAO ENCONTRADO");
        }
    }
    public void excluirContatoFornecedor(){
        String nome;
        
        System.out.print("Informe um nome:");
        nome = scanner.next();
        
        DadoContatoFornecedor dadoContatoFornecedor = controle.selecionarContatoFornecedor(nome);
        if(dadoContatoFornecedor != null){
            controle.excluirContato(dadoContatoFornecedor);
            System.out.println("CONTATO EXCLUIDO");
        }else{
            System.out.println("CONTATO NAO ENCONTRADO");
        }
    }
    public void excluirContatoPessoal(){
        String nome;
        
        System.out.print("Informe um nome:");
        nome = scanner.next();
        
        DadoContatoPessoal dadoContatoPessoal = controle.selecionarContatoPessoal(nome);
        if(dadoContatoPessoal != null){
            controle.excluirContato(dadoContatoPessoal);
            System.out.println("CONTATO EXCLUIDO");
        }else{
            System.out.println("CONTATO NAO ENCONTRADO");
        }
    }
    public void alterarContatoOutro(){
        String nome;
        String telefone_fixo;
        String email;
        System.out.print("Informe um nome:");
        nome = scanner.next();
        
        DadoContatoOutro dadoContatoOutro = controle.selecionarContatoOutro(nome);
        if(dadoContatoOutro != null){
            System.out.print("Informe um novo nome:");
            nome = scanner.next();
            System.out.print("Entre com o novo telefone fixo:");
            telefone_fixo = scanner.next();
            System.out.print("Entre com o novo email:");
            email = scanner.next();
            
            dadoContatoOutro.atualizarNome(nome);
            dadoContatoOutro.atualizarTelefoneFixo(telefone_fixo);
            dadoContatoOutro.atualizarEmail(email);
            controle.salvarArquivoOutro();
            
            System.out.println("CONTATO ALTERADO COM SUCESSO!");
        }else{
            System.out.println("CONTATO NAO ENCONTRADO");
        }
    }
    public void alterarContatoFornecedor(){
        String nome;
        String telefone_fixo;
        String email;
        String cnpj;
        String fax;
        boolean valido;
        
        System.out.print("Informe um nome:");
        nome = scanner.next();
        
        DadoContatoFornecedor dadoContatoFornecedor = controle.selecionarContatoFornecedor(nome);
        if(dadoContatoFornecedor != null){
            System.out.print("Informe um novo nome:");
            nome = scanner.next();
            System.out.print("Entre com o novo telefone fixo:");
            telefone_fixo = scanner.next();
            System.out.print("Entre com o novo email:");
            email = scanner.next();
            System.out.print("Entre com o novo fax:");
            fax = scanner.next();
            do{
                System.out.print("Entre com o novo  CNPJ: ");
                cnpj = scanner.next();
                    if(ValidaCNPJ.isCNPJ(cnpj) == false){
                        System.out.printf("Erro, CNPJ invalido !!!\n");
                    }
                valido = ValidaCNPJ.isCNPJ(cnpj);
             }while(valido != true);
        
        System.out.printf("%s CNPJ Valido\n", ValidaCNPJ.imprimeCNPJ(cnpj));
        
            dadoContatoFornecedor.atualizarNome(nome);
            dadoContatoFornecedor.atualizarTelefoneFixo(telefone_fixo);
            dadoContatoFornecedor.atualizarEmail(email);
            dadoContatoFornecedor.atualizarCnpj(cnpj);
            dadoContatoFornecedor.atualizarFax(fax);
            controle.salvarArquivoFornecedor();
            
            System.out.println("CONTATO ALTERADO COM SUCESSO!");
        }else{
            System.out.println("CONTATO NAO ENCONTRADO");
        }
    }
    public void alterarContatoCliente(){
        String nome;
        String telefone_fixo;
        String email;
        String cnpj;
        String fax;
        String cpf;
        String telefone_comercial;
        int aux;
        boolean valido;
        
        System.out.print("Informe um nome:");
        nome = scanner.next();
        
        DadoContatoCliente dadoContatoCliente = controle.selecionarContatoCliente(nome);
        if(dadoContatoCliente != null){
            System.out.print("Informe um novo nome:");
            nome = scanner.next();
            System.out.print("Entre com o novo telefone fixo:");
            telefone_fixo = scanner.next();
            System.out.print("Entre com o novo email:");
            email = scanner.next();
            System.out.print("Entre com o novo fax:");
            fax = scanner.next();
            System.out.print("Entre com o novo telefone comercial:");
            telefone_comercial = scanner.next();
            System.out.print("Entre com 1-Para CPF ou 2-Para CNPJ: ");
            aux = scanner.nextInt();
            if(aux == 1){
                cnpj = " ";
               do{
                   System.out.println("Entre com o novo CPF:");
                    cpf = scanner.next();
                    if(ValidaCPF.isCPF(cpf) == false){
                        System.out.printf("Erro, CPF invalido !!!\n");
                    }
                    valido = ValidaCPF.isCPF(cpf);
                }while(valido != true);
               System.out.printf("%s CPF Valido\n", ValidaCPF.imprimeCPF(cpf));
            }else{
                cpf = " ";
                do{
                   System.out.println("Entre com o novo CNPJ:");
                    cnpj = scanner.next();
                    if(ValidaCNPJ.isCNPJ(cnpj) == false){
                        System.out.printf("Erro, CNPJ invalido !!!\n");
                    }
                    valido = ValidaCNPJ.isCNPJ(cnpj);
                }while(valido != true);
               System.out.printf("%s CNPJ Valido\n", ValidaCNPJ.imprimeCNPJ(cnpj));
        }
            
            
            dadoContatoCliente.atualizarNome(nome);
            dadoContatoCliente.atualizarTelefoneFixo(telefone_fixo);
            dadoContatoCliente.atualizarEmail(email);
            dadoContatoCliente.atualizarCnpj(cnpj);
            dadoContatoCliente.atualizarFax(fax);
            dadoContatoCliente.atualizarCpf(cpf);
            dadoContatoCliente.atualizarTelefoneComercial(telefone_comercial);
            controle.salvarArquivoCliente();
            
            System.out.println("CONTATO ALTERADO COM SUCESSO!");
        }else{
            System.out.println("CONTATO NAO ENCONTRADO");
        }
    }
    public void alterarContatoPessoal(){
        String nome;
        String telefone_fixo;
        String email;
        String telefone_movel;
        
        System.out.print("Informe um nome:");
        nome = scanner.next();
        
        DadoContatoPessoal dadoContatoPessoal = controle.selecionarContatoPessoal(nome);
        if(dadoContatoPessoal != null){
            System.out.print("Informe um novo nome:");
            nome = scanner.next();
            System.out.print("Entre com o novo telefone fixo:");
            telefone_fixo = scanner.next();
            System.out.print("Entre com o novo email:");
            email = scanner.next();
            System.out.print("Entre com o novo telefone movel:");
            telefone_movel = scanner.next();
            
            dadoContatoPessoal.atualizarNome(nome);
            dadoContatoPessoal.atualizarTelefoneFixo(telefone_fixo);
            dadoContatoPessoal.atualizarEmail(email);
            dadoContatoPessoal.atualizarTelefoneMovel(telefone_movel);
            controle.salvarArquivoPessoal();
            System.out.println("CONTATO ALTERADO COM SUCESSO!");
        }else{
            System.out.println("CONTATO NAO ENCONTRADO");
        }
    }
    public void localizarContatoOutro(){
        String nome;
        
        System.out.print("Informe um nome:");
        nome = scanner.next();
        DadoContatoOutro dadoContatoOutro = controle.selecionarContatoOutro(nome);
        if (dadoContatoOutro != null){
            System.out.println("Contato\n"+
            "Nome: "+dadoContatoOutro.obterNome()+"\n"+
            "Telefone: "+dadoContatoOutro.obterTelefoneFixo()+"\n"+
            "Email: "+dadoContatoOutro.obterEmail());
        } else {
            System.out.println("Contato nao encontrado");
        }
    }
    public void localizarContatoFornecedor(){
        String nome;
        
        System.out.print("Informe um nome:");
        nome = scanner.next();
        DadoContatoFornecedor dadoContatoFornecedor = controle.selecionarContatoFornecedor(nome);
        if (dadoContatoFornecedor != null){
            System.out.println("Contato\n"+
            "Nome: "+dadoContatoFornecedor.obterNome()+"\n"+
            "Telefone: "+dadoContatoFornecedor.obterTelefoneFixo()+"\n"+
            "Email: "+dadoContatoFornecedor.obterEmail()+"\n"+
            "CNPJ: "+dadoContatoFornecedor.obterCnpj()+"\n"+
            "Fax: "+dadoContatoFornecedor.obterFax());
        } else {
            System.out.println("Contato nao encontrado");
        }
    }
    public void localizarContatoCliente(){
        String nome;
        
        System.out.print("Informe um nome:");
        nome = scanner.next();
        DadoContatoCliente dadoContatoCliente = controle.selecionarContatoCliente(nome);
        if (dadoContatoCliente != null){
            System.out.println("Contato\n"+
            "Nome: "+dadoContatoCliente.obterNome()+"\n"+
            "Telefone: "+dadoContatoCliente.obterTelefoneFixo()+"\n"+
            "Email: "+dadoContatoCliente.obterEmail()+"\n"+
            "CNPJ: "+dadoContatoCliente.obterCnpj()+"\n"+
            "CPF: "+dadoContatoCliente.obterCpf()+"\n"+
            "Telefone Comercial: "+dadoContatoCliente.obterTelefoneComercial());
        } else {
            System.out.println("Contato nao encontrado");
        }
    }
    public void localizarContatoPessoal(){
        String nome;
        
        System.out.print("Informe um nome:");
        nome = scanner.next();
        DadoContatoPessoal dadoContatoPessoal = controle.selecionarContatoPessoal(nome);
        if (dadoContatoPessoal != null){
            System.out.println("Contato\n"+
            "Nome: "+dadoContatoPessoal.obterNome()+"\n"+
            "Telefone: "+dadoContatoPessoal.obterTelefoneFixo()+"\n"+
            "Email: "+dadoContatoPessoal.obterEmail()+"\n"+        
            "Telefone Movel: "+dadoContatoPessoal.obterTelefoneMovel());
        } else {
            System.out.println("Contato nao encontrado");
        }
    }
}
