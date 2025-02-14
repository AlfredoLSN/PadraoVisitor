package org.example;

public class PessoaVisitorCsv implements PessoaVisitor{
    public String exibir(Pessoa pessoa){
        return pessoa.aceitar(this);
    }
    @Override
    public String exibirAluno(Aluno aluno) {
        return "matricula,nome,curso\n" +
                aluno.getMatricula()  + "," + aluno.getNome() + "," + aluno.getNomeCurso();
    }

    @Override
    public String exibirProfessor(Professor professor) {
        return "matricula,nome,titulacao\n" +
                professor.getMatricula()  + "," + professor.getNome() + "," + professor.getTitulacao();

    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "codigo,nome,salario\n" +
                funcionario.getCodigo()  + "," + funcionario.getNome() + "," + funcionario.getSalario();
    }
}
