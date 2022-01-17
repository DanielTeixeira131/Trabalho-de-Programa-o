import java.util.Scanner;

public class Tecnico extends Funcionario {
private String areaDeAtuacao;
    public Tecnico(String nome, String domicilio, String contato, String cpf, String ctps, double pagamento, String text) {
        this.areaDeAtuacao=areaDeAtuacao;
        super.setNome(nome);
        super.setContato(contato);
        super.setCpf(cpf);
        super.setDomicilio(domicilio);
        super.setSalario(pagamento);
        super.setCtps(ctps);
    }
    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao) {
        this.areaDeAtuacao = areaDeAtuacao;
    }
    
}
