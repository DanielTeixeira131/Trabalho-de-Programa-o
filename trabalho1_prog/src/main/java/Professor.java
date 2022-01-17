
import java.util.Scanner;

public class Professor extends Funcionario{
    private String Titulacao;
    private String areaDePesquisa;
    public Professor() {
    }

    public Professor(String nome, String domicilio, String contato, String cpf, String ctps, double pagamento, String titulacao, String areaDePesquisa) {
        this.Titulacao = Titulacao;
        this.areaDePesquisa = areaDePesquisa;
        super.setNome(nome);
        super.setContato(contato);
        super.setCpf(cpf);
        super.setDomicilio(domicilio);
        super.setSalario(pagamento);
        super.setCtps(ctps);
    }
    
    public String getTitulacao() {
        return Titulacao;
    }

    public void setTitulacao(String Titulacao) {
        this.Titulacao = Titulacao;
    }

    public String getAreaDePesquisa() {
        return areaDePesquisa;
    }

    public void setAreaDePesquisa(String areaDePesquisa) {
        this.areaDePesquisa = areaDePesquisa;
    }    
    
}
