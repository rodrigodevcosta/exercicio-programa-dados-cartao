
package programadadoscartao;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Controle {
        private ArrayList<DadoContatoOutro>contatoOutro;
        private ArrayList<DadoContatoCliente>contatoCliente;
        private ArrayList<DadoContatoFornecedor>contatoFornecedor;
        private ArrayList<DadoContatoPessoal>contatoPessoal;
    
    public Controle(){
        contatoOutro = new ArrayList<DadoContatoOutro>();
        contatoCliente = new ArrayList<DadoContatoCliente>();
        contatoFornecedor = new ArrayList<DadoContatoFornecedor>();
        contatoPessoal = new ArrayList<DadoContatoPessoal>();
    }
    public void incluirContato(DadoContatoOutro contato) {
        contatoOutro.add(contato);
        salvarArquivoOutro();
    }
     public void incluirContato(DadoContatoCliente contato) {
        contatoCliente.add(contato);
        salvarArquivoCliente();
    }
    public void incluirContato(DadoContatoFornecedor contato) {
        contatoFornecedor.add(contato);
        salvarArquivoFornecedor();
    }
    public void incluirContato(DadoContatoPessoal contato) {
        contatoPessoal.add(contato);
        salvarArquivoPessoal();
    }

    public void excluirContato(DadoContatoOutro contato) {
        contatoOutro.remove(contato);
        salvarArquivoOutro();
       
    }
    public void excluirContato(DadoContatoCliente contato) {
        contatoCliente.remove(contato);
        salvarArquivoCliente();
    }
    public void excluirContato(DadoContatoFornecedor contato) {
        contatoFornecedor.remove(contato);
        salvarArquivoFornecedor();
    }
    public void excluirContato(DadoContatoPessoal contato) {
        contatoPessoal.remove(contato);
        salvarArquivoPessoal();
    }
    public DadoContatoOutro selecionarContatoOutro(String nome) {
        abrirArquivoOutro();
        DadoContatoOutro contato = null;
        for(int i = 0; i < contatoOutro.size();i++){
            if(contatoOutro.get(i).obterNome().equals(nome)){
                contato = contatoOutro.get(i);
                break;
            }
        }
        return contato;
    }
    public DadoContatoCliente selecionarContatoCliente(String nome) {
        abrirArquivoCliente();
        DadoContatoCliente contato = null;
        for(int i = 0; i < contatoCliente.size();i++){
            if(contatoCliente.get(i).obterNome().equals(nome)){
                contato = contatoCliente.get(i);
                break;
            }
        }
        return contato;
    }
    public DadoContatoFornecedor selecionarContatoFornecedor(String nome) {
        abrirArquivoFornecedor();
        DadoContatoFornecedor contato = null;
        for(int i = 0; i < contatoFornecedor.size();i++){
            if(contatoFornecedor.get(i).obterNome().equals(nome)){
                contato = contatoFornecedor.get(i);
                break;
            }
        }
        return contato;
    }
    public DadoContatoPessoal selecionarContatoPessoal(String nome) {
        abrirArquivoPessoal();
        DadoContatoPessoal contato = null;
        for(int i = 0; i < contatoPessoal.size();i++){
            if(contatoPessoal.get(i).obterNome().equals(nome)){
                contato = contatoPessoal.get(i);
                break;
            }
        }
        return contato;
    }
     public ArrayList<DadoContatoOutro>obterContatoOutro(){
        return contatoOutro;
    }
     public ArrayList<DadoContatoCliente>obterContatoCliente(){
        return contatoCliente;
    }
     public ArrayList<DadoContatoFornecedor>obterContatoFornecedor(){
        return contatoFornecedor;
    }
    public ArrayList<DadoContatoPessoal>obterContatoOutroPessoal(){
        return contatoPessoal;
    }
    
    public void salvarArquivoOutro() {
        ObjectOutputStream output = null;
        try{
            try{
                output = new ObjectOutputStream(new FileOutputStream("dadoContatoOutro.dat"));
                    for (int i = 0; i < contatoOutro.size(); i++) {
                         output.writeObject(contatoOutro.get(i));
                        }
                System.out.println("Salvo");
        } finally {
            if (output != null){
            output.close();
            }
        }
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    public void salvarArquivoFornecedor() {
        ObjectOutputStream output = null;
        try{
            try{
                output = new ObjectOutputStream(new FileOutputStream("dadoContatoFornecedor.dat"));
                    for (int i = 0; i < contatoFornecedor.size(); i++) {
                         output.writeObject(contatoFornecedor.get(i));
                        }
                System.out.println("Salvo");
        } finally {
            if (output != null){
            output.close();
            }
        }
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    public void salvarArquivoCliente() {
        ObjectOutputStream output = null;
        try{
            try{
                output = new ObjectOutputStream(new FileOutputStream("dadoContatoCliente.dat"));
                    for (int i = 0; i < contatoCliente.size(); i++) {
                         output.writeObject(contatoCliente.get(i));
                        }
                System.out.println("Salvo");
        } finally {
            if (output != null){
            output.close();
            }
        }
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    public void salvarArquivoPessoal() {
        ObjectOutputStream output = null;
        try{
            try{
                output = new ObjectOutputStream(new FileOutputStream("dadoContatoPessoal.dat"));
                    for (int i = 0; i < contatoPessoal.size(); i++) {
                         output.writeObject(contatoPessoal.get(i));
                        }
                System.out.println("Salvo");
        } finally {
            if (output != null){
            output.close();
            }
        }
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    public void abrirArquivoOutro(){
        ObjectInputStream input = null;
        try{
            try{
                input = new ObjectInputStream(new FileInputStream("dadoContatoOutro.dat"));
                Object objeto = null;
                contatoOutro.clear();
                do {
                    objeto = input.readObject();
                    contatoOutro.add((DadoContatoOutro)objeto);
                } while (objeto != null);
            } finally {
                if (input != null){
                input.close();
                }
            }
        } catch (EOFException e) { //Não faz nada
        } catch (Exception e){
          System.err.println(e.getMessage());
        }
    }
    public void abrirArquivoFornecedor(){
        ObjectInputStream input = null;
        try{
            try{
                input = new ObjectInputStream(new FileInputStream("dadoContatoFornecedor.dat"));
                Object objeto = null;
                contatoFornecedor.clear();
                do {
                    objeto = input.readObject();
                    contatoFornecedor.add((DadoContatoFornecedor)objeto);
                } while (objeto != null);
            } finally {
                if (input != null){
                input.close();
                }
            }
        } catch (EOFException e) { //Não faz nada
        } catch (Exception e){
          System.err.println(e.getMessage());
        }
    }
    public void abrirArquivoCliente(){
        ObjectInputStream input = null;
        try{
            try{
                input = new ObjectInputStream(new FileInputStream("dadoContatoCliente.dat"));
                Object objeto = null;
                contatoCliente.clear();
                do {
                    objeto = input.readObject();
                    contatoCliente.add((DadoContatoCliente)objeto);
                } while (objeto != null);
            } finally {
                if (input != null){
                input.close();
                }
            }
        } catch (EOFException e) { //Não faz nada
        } catch (Exception e){
          System.err.println(e.getMessage());
        }
    }
    public void abrirArquivoPessoal(){
        ObjectInputStream input = null;
        try{
            try{
                input = new ObjectInputStream(new FileInputStream("dadoContatoPessoal.dat"));
                Object objeto = null;
                contatoPessoal.clear();
                do {
                    objeto = input.readObject();
                    contatoPessoal.add((DadoContatoPessoal)objeto);
                } while (objeto != null);
            } finally {
                if (input != null){
                input.close();
                }
            }
        } catch (EOFException e) { //Não faz nada
        } catch (Exception e){
          System.err.println(e.getMessage());
        }
    }
}
