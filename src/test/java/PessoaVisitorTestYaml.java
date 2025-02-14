import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PessoaVisitorTestYaml {
    @Test
    void deveExibirAlunoYaml() {
        Aluno aluno = new Aluno(1, "Ana", new Curso("Sistemas de Informação"));

        PessoaVisitorYaml visitor = new PessoaVisitorYaml();
        assertEquals("Aluno:\n matricula:1\n nome:Ana\n curso:Sistemas de Informação", visitor.exibir(aluno));
    }

    @Test
    void deveExibirProfessorYaml() {
        Professor professor = new Professor(1, "Maria", "Doutorado");

        PessoaVisitorYaml visitor = new PessoaVisitorYaml();
        assertEquals("Professor:\n matricula:1\n nome:Maria\n titulacao:Doutorado", visitor.exibir(professor));
    }

    @Test
    void deveExibirFuncionarioYaml() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        PessoaVisitorYaml visitor = new PessoaVisitorYaml();
        assertEquals("Funcionario:\n codigo:1\n nome:Pedro\n salario:5000.0", visitor.exibir(funcionario));
    }
    
}
