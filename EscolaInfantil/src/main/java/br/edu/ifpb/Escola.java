package br.edu.ifpb;

import java.util.ArrayList;

public class Escola {
    ArrayList<Turma> turmas;
    ArrayList<Professor> professores;
    ArrayList<Aluno> alunos;


    public Escola(){
        turmas = new ArrayList<>();
        professores = new ArrayList<>();
        alunos = new ArrayList<>();
    }
    ///////////////////////////////////////////////////////////////////////////////////////
    public void cadastrarTurma(String codigo, String nome, String sala, String horario,
                               char tipo, String material){
        for (Turma t: turmas){
            if(t.getNome() == nome){
                return;
            }
        }
        Turma temp = new Turma(codigo, nome, sala, horario, tipo, material);
        turmas.add(temp);
    }

    public void cadastrarProfessor(String titulo, String nome, int matricula, double salarioBase){
        for (Professor p : professores){
            if (p.getMatricula() == matricula){
                return;
            }
        }
        Professor temp = new Professor(titulo, nome, matricula, salarioBase);
        professores.add(temp);
    }

    public void cadastraNotas(String nomeAluno, String nomeTurma, double notas[]){
        for (Turma t : turmas){
            if (t.getNome()== nomeTurma){
                for (Notas n: t.getNotasTurma()){
                    if (n.getAluno() == nomeAluno){
                        return;
                    }
                }
                Notas temp = new Notas(nomeAluno, nomeTurma, notas);
                t.setNotas(temp);
                return;
            }
        }
    }

    public void cadastrarAluno(String nome, int matricula, String nascimento, String mae){
        for (Aluno a: alunos){
            if (a.getMatricula() == matricula){
                return;
            }
        }
        Aluno temp = new Aluno(nome, matricula, nascimento, mae);
        alunos.add(temp);
    }

    ////////////////////////////////////////////////////////////////////////////////

    public void removeTurma(Turma turma){
        for (Turma t: turmas){
            if (t.getNome() == turma.getNome()){
                turmas.remove(turma);
                break;
            }
        }
    }

    public void removeProfessor(Professor professor){
        for (Professor p: professores){
            if (p.getMatricula() == professor.getMatricula()){
                professores.remove(professor);
                break;
            }
        }
    }

    public void removeAluno(Aluno aluno){
        for (Aluno a: alunos){
            if (a.getMatricula() == aluno.getMatricula()){
                alunos.remove(aluno);
                break;
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////

    public void matriculaAluno(int matriculaAluno, String nomeTurma){
        for (Aluno a: alunos) {
            if (a.getMatricula() == matriculaAluno) {
                for (Turma t : turmas) {
                    if (t.getNome() == nomeTurma) {
                        t.setAlunos(a);
                        for (Professor p : professores) {
                            if (p.getNome()== t.getProfessor()) {
                                p.setAlunos(a);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public void matriculaProfessor(int matriculaProf, String nomeTurma){
        for (Turma t : turmas){
            if (t.getNome()== nomeTurma){
                for (Professor p : professores) {
                    if (p.getMatricula() == matriculaProf){
                        t.setProfessor(p.getNome());
                        return;
                    }
                }
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////////

    public void alunosTurma(String nomeTurma){
        for (Turma t : turmas){
            if (t.getNome()== nomeTurma){
                for (Aluno a: t.getAlunos()){
                    System.out.println(a.toString());
                }
            }
        }
    }

    public void alunosProfessor(String nomeProfessor){
        for (Professor p : professores){
            if (p.getNome()== nomeProfessor){
                for (Aluno a: p.getAlunos()){
                    System.out.println(a.toString());
                }
            }
        }
    }

    public void materialTurma(String nomeTurma){
        for (Turma t : turmas){
            if (t.getNome()== nomeTurma){
                System.out.println(t.getMaterial());
            }
        }
    }

    public void totalAlunos(){
        System.out.println(alunos.size()+ " alunos cadastrados:");
        for (Aluno a: alunos){
            System.out.println(a.toString());
        }
    }

    public void totalProfessores(){
        System.out.println(professores.size()+ " professores cadastrados:");
        for (Professor p: professores){
            System.out.println(p.toString());
        }
    }

    public void totalTurmas(){
        System.out.println(turmas.size()+ " turmas cadastradas:");
        for (Turma t: turmas){
            System.out.println(t.toString());
        }
    }

    public void boletimTurma(String nomeTurma){
        for (Turma t : turmas){
            if (t.getNome()== nomeTurma){
                for (Notas n: t.getNotasTurma()) {
                    System.out.println(n.toString());
                }
            }
        }
    }

    public void boletimAluno(String nomeAluno){
        for(Turma t: turmas){
            for (Notas n: t.getNotasTurma()){
                if (n.getAluno() == nomeAluno){
                    System.out.println(n.toString());
                }
            }
        }
    }

    public void boletimPagamento(String nomeAluno, String nomeMes){
        Pagamento temp = new Pagamento(nomeAluno, nomeMes);
        System.out.println(temp.toString());
    }

    public void dadosAluno(String nomeAluno){
        for (Aluno a: alunos){
            if (a.getNome() == nomeAluno){
                System.out.println(a.toString());
                return;
            }
        }
    }

    public void dadosProfessor(String nomeProfessor){
        for (Professor p: professores){
            if (p.getNome() == nomeProfessor){
                System.out.println(p.toString());
                return;
            }
        }
    }

    public void dadosTurma(String nomeTurma){
        for (Turma t: turmas){
            if (t.getNome() == nomeTurma){
                System.out.println(t.toString());
                return;
            }
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////


}
