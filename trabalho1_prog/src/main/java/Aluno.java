
import java.util.Scanner;
import javax.swing.JTextField;

public class Aluno {
private String nome;
private String registro;
private String cpf;

    public Aluno() {
        
    }

//curso curso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return registro;
    }

    public void setMatricula(String matricula) {
        this.registro = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return nome + "  Registro: " + registro + " CPF: " + cpf ;
    }
    

}
