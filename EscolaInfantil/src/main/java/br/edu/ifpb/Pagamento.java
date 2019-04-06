package br.edu.ifpb;

public class Pagamento {
    private String aluno;
    private String mes;
    private String vencimentoComDesconto;
    private double valorComDesconto;
    private double valorSemDesconto;

    public Pagamento(String nomeAluno, String nomeMes){
        setAluno(nomeAluno);
        setMes(nomeMes);
        this.vencimentoComDesconto= "Até 10 de "+getMes()+" de 2019.";
        this.valorComDesconto = 300;
        this.valorSemDesconto = 350;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAluno() {
        return aluno;
    }

    public String getMes() {
        return mes;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "aluno='" + aluno + '\'' +
                ", mes='" + mes + '\'' +
                ", vencimento com desconto=' " + vencimentoComDesconto + '\'' +
                ", valor com desconto= R$ " + valorComDesconto +
                ", valor sem desconto= R$ " + valorSemDesconto +
                '}';
    }
}
