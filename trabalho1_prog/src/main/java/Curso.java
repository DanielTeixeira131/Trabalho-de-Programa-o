
import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private int codigo; 
    private String nome;
    private int periododeduracao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return periododeduracao;
    }

    public void setDuracao(int duracao) {
        this.periododeduracao = duracao;
    }

    @Override
    public String toString() {
        return " nome: " + nome +" código: " + codigo + " período de duracao: " + periododeduracao;
    }
    
}
