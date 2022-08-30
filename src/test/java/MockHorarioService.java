import java.util.ArrayList;

public class MockHorarioService implements HorarioService{

    @Override
    public String buscaH(String disciplina) {
        if(disciplina.equals("C209"))
            return HorarioConst.C209;
        else if(disciplina.equals("C214"))
            return HorarioConst.C214;
        else if(disciplina.equals("C111"))
            return HorarioConst.C111;
        else if(disciplina.equals("S206"))
            return HorarioConst.S206;
        else
            return "Disciplina invalida!";
    }

    @Override
    public boolean horarioExistente(String disciplina){
        ArrayList<String> disciplinas = new ArrayList<String>();
        disciplinas.add("C209");
        disciplinas.add("C214");
        disciplinas.add("C111");

        for (int i=0; i < disciplinas.size(); i++){
            if (disciplinas.get(i).equals(disciplina)){
                return true;
            }else{
                return false;
            }
        }

        return false;
    }
}
