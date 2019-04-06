package br.edu.ifpb;

import java.util.Arrays;

public class Notas {
    private String aluno;
    private String turma;
    private double[] notas;

    public Notas(String nomeAluno, String nomeTurma, double[] n){
        notas = new double[3];
        setNotas(n);
        setAluno(nomeAluno);
        setTurma(nomeTurma);

    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Notas{" +
                "aluno='" + aluno + '\'' +
                ", turma='" + turma + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }
}
