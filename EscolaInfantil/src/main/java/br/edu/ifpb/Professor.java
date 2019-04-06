package br.edu.ifpb;

import java.util.ArrayList;

public class Professor {
    private String titulo;
    private String nome;
    private int matricula;
    private double salarioBase;
    private ArrayList<Aluno> alunos;
    private double salário;

    public Professor(String titulo, String nome, int matricula, double salarioBase){
        setTitulo(titulo);
        setNome(nome);
        setMatricula(matricula);
        setSalarioBase(salarioBase);
        alunos = new ArrayList<>();
        setSalário();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno al) {
        for(Aluno a: alunos){
            if(al.getMatricula() == a.getMatricula()){
                return;
            }
        }
        alunos.add(al);
    }

    public void setSalário() {
        if (this.titulo == "Graduado"){
            this.salário = this.salarioBase*0.1 + this.salarioBase;
        }
        else if(this.titulo == "Especialista"){
            this.salário =  this.salarioBase*0.15 + this.salarioBase;
        }
        else if(this.titulo == "Mestre"){
            this.salário +=  this.salarioBase*0.4 + this.salarioBase;
        }
        else if(this.titulo == "Doutor"){
            this.salário =  this.salarioBase*0.65 + this.salarioBase;
        }
    }

    @Override
    public String toString() {
        return "Professor{" +
                "titulo='" + titulo + '\'' +
                ", nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", salario base=R$ " + salarioBase + ", salario total=R$ "+ salário+
                '}';
    }
}
