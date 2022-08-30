import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestePopulaPagHorario {

    HorarioService service;
    BuscaHorario buscaHorario;

    @Before
    public void setup(){
        service = new MockHorarioService();
        buscaHorario = new BuscaHorario(service);
    }

    //Testes de sucesso

    //Caso de Teste - horario e dados corretos da disciplina C214
    @Test
    public void testeBuscaHorarioC214(){
        Horario c214 = buscaHorario.buscaHorario("C214");

        assertEquals("Christopher",c214.getNomeProf());
        assertEquals("Engenharia de Software", c214.getDisciplina());
        assertEquals("17:30",c214.getHoraAtend());
        assertEquals("Noturno",c214.getPeriodo());
        assertEquals("I-15",c214.getLocalAtend());
    }

    //Caso de Teste - horario e dados corretos da disciplina C209
    @Test
    public void testeBuscaHorarioC209(){
        Horario c209 = buscaHorario.buscaHorario("C209");

        assertEquals("Marcelo",c209.getNomeProf());
        assertEquals("Computacao Grafica", c209.getDisciplina());
        assertEquals("15:30",c209.getHoraAtend());
        assertEquals("Integral",c209.getPeriodo());
        assertEquals("I-16",c209.getLocalAtend());
    }

    //Caso de Teste - horario e dados corretos da disciplina C111
    @Test
    public void testeBuscaHorarioC111(){
        Horario c111 = buscaHorario.buscaHorario("C111");

        assertEquals("Renzo",c111.getNomeProf());
        assertEquals("Analise de Dados", c111.getDisciplina());
        assertEquals("17:30",c111.getHoraAtend());
        assertEquals("Integral",c111.getPeriodo());
        assertEquals("I-22",c111.getLocalAtend());
    }

    //Testes de falha

    //Caso de Teste - disciplina invalida
    @Test
    public void testeBuscaDisciplinaInvalida(){
        boolean c100 = buscaHorario.verificaHorarioExistente("C200");

        assertFalse(c100);
    }

    //Caso de Teste - nome da disciplina com a letra minuscula
    @Test
    public void testeBuscaNomeDisciplinaMinuscula(){
        boolean c209 = buscaHorario.verificaHorarioExistente("c209");
        assertFalse(c209);
    }

    //Caso de Teste - professor cadastrado errado no horario
    @Test
    public void testeNomeProfessorInvalido(){
        Horario s206 = buscaHorario.buscaHorario("S206");
        //Esperado era Christopher
        assertEquals("Marcelo",s206.getNomeProf());
    }

}
