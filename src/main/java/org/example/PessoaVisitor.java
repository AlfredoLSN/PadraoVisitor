package org.example;

public interface PessoaVisitor {
    String exibirAluno(Aluno aluno);
    String exibirProfessor(Professor professor);
    String exibirFuncionario(Funcionario funcionario);
}
