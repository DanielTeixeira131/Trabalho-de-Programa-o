
import java.util.Scanner;

public class Funcionario {
    private String proficional;
    private String domicilio;
    private String contato;
    private String cpf;
    private String ctps;
    private double salario;
    
    public String getNome() {
        return proficional;
    }

    public void setNome(String nome) {
        this.proficional = nome;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = contato;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "nome: " + proficional + " endereco: " + domicilio + " contato: " + contato + " cpf: " + cpf + " ctps: " + ctps + " salario: " + salario ;
    }
    
}
