import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PessoaVisitorTestCsv {
    @Test
    void deveExibirAlunoCsv() {
        Aluno aluno = new Aluno(1, "Ana", new Curso("Sistemas de Informação"));

        PessoaVisitorCsv visitor = new PessoaVisitorCsv();
        assertEquals("matricula,nome,curso\n1,Ana,Sistemas de Informação", visitor.exibir(aluno));
    }

    @Test
    void deveExibirProfessorCsv() {
        Professor professor = new Professor(1, "Maria", "Doutorado");

        PessoaVisitorCsv visitor = new PessoaVisitorCsv();
        assertEquals("matricula,nome,titulacao\n1,Maria,Doutorado", visitor.exibir(professor));
    }

    @Test
    void deveExibirFuncionarioCsv() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        PessoaVisitorCsv visitor = new PessoaVisitorCsv();
        assertEquals("codigo,nome,salario\n1,Pedro,5000.0", visitor.exibir(funcionario));


    }
}
