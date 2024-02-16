
package programadadoscartao;
import java.util.Scanner;

public class InterfacePrincipal {
    Scanner scanner = new Scanner(System.in);
    Controle controle = new Controle();
    
    public void Iniciar(){
       int opc;
       int opcSubMenu;
       
       Interface inter = new Interface();
       do{
            opc = obterOpc();
            switch(opc){
                case 1:opcSubMenu = subMenuIncluir();
                        switch(opcSubMenu){
                             case 1:inter.incluirContatoOutro();
                             break;
                             case 2:inter.incluirContatoCliente();
                             break;
                             case 3:inter.incluirContatoFornecedor();
                             break;
                             case 4:inter.incluirContatoPessoal();
                             break;
                             case 0:
                             break;
                             default:
                                 System.out.println("Valor invalido");
                                 break;
                         }
                break;
                case 2:opcSubMenu = subMenuAlterar();
                        switch(opcSubMenu){
                            case 1:inter.alterarContatoOutro();
                            break;
                            case 2:inter.alterarContatoCliente();
                            break;
                            case 3:inter.alterarContatoFornecedor();
                            break;
                            case 4:inter.alterarContatoPessoal();
                            break;
                            case 0:
                            break;
                            default:
                                 System.out.println("Valor invalido");
                             break;
                        }
                break;
                case 3:opcSubMenu = subMenuLocalizar();
                        switch(opcSubMenu){
                            case 1:inter.localizarContatoOutro();
                            break;
                            case 2:inter.localizarContatoCliente();
                            break;
                            case 3:inter.localizarContatoFornecedor();
                            break;
                            case 4:inter.localizarContatoPessoal();
                            break;
                            case 0:
                            break;
                            default:
                                 System.out.println("Valor invalido");
                             break;
                        }
                break;
                
                case 4: opcSubMenu = subMenuExcluir();
                        switch(opcSubMenu){
                            case 1:inter.excluirContatoOutro();
                            break;
                            case 2:inter.excluirContatoCliente();
                            break;
                            case 3:inter.incluirContatoFornecedor();
                            break;
                            case 4:inter.incluirContatoPessoal();
                            break;
                            case 0:
                            break;
                            default:
                                 System.out.println("Valor invalido");
                                 break;
                                
                        }
                break;
                case 0:
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }
        }while(opc != 0);
    } 
    
    
    
    public int obterOpc(){
        
        System.out.println("1-Incluir");
        System.out.println("2-Alterar por nome");
        System.out.println("3-Localizar por nome");
        System.out.println("4-Excluir por nome"); 
        System.out.println("0-Sair"); 
        return scanner.nextInt();
    }
      
    public int subMenuIncluir(){
        System.out.println("1-Incluir Outros");
        System.out.println("2-Incluir Cliente");
        System.out.println("3-Incluir Fornecedor");
        System.out.println("4-Incluir Pessoais");
        System.out.println("0-Voltar");
        return scanner.nextInt();  
    }
    public int subMenuAlterar(){
        System.out.println("1-Alterar Outros");
        System.out.println("2-Alterar Cliente");
        System.out.println("3-Alterar Fornecedor");
        System.out.println("4-Alterar Pessoais");
        System.out.println("0-Voltar");
        return scanner.nextInt();     
    }
    public int subMenuExcluir(){
        System.out.println("1-Excluir Outros");
        System.out.println("2-Excluir Cliente");
        System.out.println("3-Excluir Fornecedor");
        System.out.println("4-Excluir Pessoais");
        System.out.println("0-Voltar");
        return scanner.nextInt();     
    }
    public int subMenuLocalizar(){
        System.out.println("1-Localizar Outros");
        System.out.println("2-Localizar Cliente");
        System.out.println("3-Localizar Fornecedor");
        System.out.println("4-Localizar Pessoais");
        System.out.println("0-Voltar");
        return scanner.nextInt();     
    }
    
}
