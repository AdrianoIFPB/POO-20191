package br.edu.ifpb;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int matricula;
    private String nascimento;
    private String mae;


    public Aluno(String nome, int matricula, String nascimento, String mae){
        setNome(nome);
        setMatricula(matricula);
        setNascimento(nascimento);
        setMae(mae);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nascimento='" + nascimento + '\'' +
                ", mae='" + mae + '\'' +
                '}';
    }
}
