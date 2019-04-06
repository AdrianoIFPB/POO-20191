package br.edu.ifpb;

public class TestaEscola {
    public static void main(String[] args) {
        Escola e = new Escola();
        e.cadastrarAluno("Adriano Soares", 201801, "29-01-1983", "Maria de Lourdes");
        e.cadastrarAluno("Gioconda Moura", 201802, "15-03-1996","Amora Moura");
        e.cadastrarAluno("John Snow", 201803, "25-04-2019","Lyanna Stark");
        e.cadastrarAluno("Goku Sayoshi", 201804, "29-06-1982","Gokyra Sayoshi");
        e.cadastrarAluno("Bruna Morais", 201805, "01-08-1991","Brena Morais");

        e.cadastrarTurma("MGrafos2019.1", "Teoria dos Grafos", "Lab Info 03",
                "Quarta: 8:40 às 10:40h",'U', "cola, papel e tesoura");
        e.cadastrarTurma("MPOO2019.1", "POO", "22", "Segunda:10:40 às 12:20h",
                'U', "cartolina, lapis de pintura, resma");

        e.cadastrarProfessor("Doutor", "Katyusco de Farias", 10180, 2000);
        e.cadastrarProfessor("Mestre", "Henrique Cunha",10181,  2000);

        e.matriculaProfessor(10180, "Teoria dos Grafos");
        e.matriculaProfessor(10181, "POO");

        e.matriculaAluno(201801,"Teoria dos Grafos");
        e.matriculaAluno(201801,"POO");
        e.matriculaAluno(201802,"Teoria dos Grafos");
        e.matriculaAluno(201803,"POO");
        e.matriculaAluno(201804,"POO");

//        e.alunosTurma("POO");
//        e.alunosTurma("Teoria dos Grafos");
//
//        e.alunosProfessor("Henrique Cunha");
//
//        e.materialTurma("POO");
        //e.totalAlunos();
        //e.totalProfessores();
        //e.totalTurmas();
        e.cadastraNotas("Adriano Soares", "Teoria dos Grafos", new double[]{98, 88, 78});
        e.cadastraNotas("Adriano Soares", "POO", new double[]{100, 85, 77});
        e.cadastraNotas("Gioconda Moura", "Teoria dos Grafos", new double[]{88, 100, 76});
        e.cadastraNotas("John Snow", "POO", new double[]{81, 32, 50});
        e.cadastraNotas("Goku Sayoshi", "POO", new double[]{90, 66, 46});

//        e.boletimTurma("POO");
//        e.boletimTurma("Teoria dos Grafos");
//        e.boletimAluno("Adriano Soares");
//        e.boletimPagamento("Adriano Soares", "maio");
//        e.dadosAluno("Gioconda Moura");
//        e.dadosProfessor("Katyusco de Farias");
//        e.dadosTurma("POO");





    }
}
