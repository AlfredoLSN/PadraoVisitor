package org.example;

public class PessoaVisitorYaml implements PessoaVisitor{
    public String exibir(Pessoa pessoa){
        return pessoa.aceitar(this);
    }
    @Override
    public String exibirAluno(Aluno aluno) {
        return "Aluno:"+
                "\n matricula:" + aluno.getMatricula() +
                "\n nome:" + aluno.getNome() +
                "\n curso:" + aluno.getNomeCurso();
    }

    @Override
    public String exibirProfessor(Professor professor) {
        return "Professor:" +
                "\n matricula:" + professor.getMatricula() +
                "\n nome:" + professor.getNome() +
                "\n titulacao:" + professor.getTitulacao();
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionario:" +
                "\n codigo:" + funcionario.getCodigo() +
                "\n nome:" + funcionario.getNome() +
                "\n salario:" + funcionario.getSalario();
    }
}
