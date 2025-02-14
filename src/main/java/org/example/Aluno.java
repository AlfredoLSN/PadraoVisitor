package org.example;

public class Aluno implements Pessoa{
    private int matricula;
    private String nome;
    private Curso curso;

    public Aluno(int matricula, String nome, Curso curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeCurso() {
        return this.curso.getNome();
    }

    public String aceitar(PessoaVisitor visitor) {
        return visitor.exibirAluno(this);
    }
}
