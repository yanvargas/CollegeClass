package Entrega;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Aluno> alunos;
    private List<Curso> cursos;
    private Professor professores;

    public Disciplina(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.cursos = new ArrayList<>();;
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

      public void setNome(String nome) {
        this.nome=nome;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
        aluno.addDisciplina(this);
    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
        curso.addDisciplina(this);
    }
  
    public void addProfessor(Professor professor) {
        this.pessoas=pessoas;
        professor.addDisciplina(this);
    }
}
