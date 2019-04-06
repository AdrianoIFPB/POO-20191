package br.edu.ifpb;

import java.util.ArrayList;

public class Turma {
    private String codigo;
    private String nome;
    private String sala;
    private String horario;
    private char tipo;
    private String material;
    private ArrayList<Aluno> alunos;
    private String professor;
    private ArrayList<Notas> notasTurma;

    public Turma(String codigo, String nome, String sala, String horario,
                 char tipo, String material){
        notasTurma = new ArrayList<>();
        alunos = new ArrayList<>();
        setCodigo(codigo);
        setNome(nome);
        setSala(sala);
        setHorario(horario);
        setTipo(tipo);
        setMaterial(material);

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void setNotas(Notas notas) {
        notasTurma.add(notas);
    }

    public ArrayList<Notas> getNotasTurma() {
        return notasTurma;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", sala='" + sala + '\'' +
                ", horario='" + horario + '\'' +
                ", tipo=" + tipo +
                ", material='" + material + '\'' +
                ", professor='" + professor + '\'' +
                '}';
    }
}
