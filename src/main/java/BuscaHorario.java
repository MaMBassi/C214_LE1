import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaHorario {

    //injeção das dependencias pelo construtor
    HorarioService horarioService;

    public BuscaHorario(HorarioService horarioService) {
        this.horarioService = horarioService;
    }

    public Horario buscaHorario(String disciplina){
        String horarioJSON = horarioService.buscaH(disciplina);
        JsonObject jsonObject = JsonParser.parseString(horarioJSON).getAsJsonObject();

        return new Horario(jsonObject.get("nomeDoProfessor").getAsString(),
                jsonObject.get("horarioDeAtendimento").getAsString(),
                jsonObject.get("periodo").getAsString(),
                jsonObject.get("disciplina").getAsString(),
                jsonObject.get("localDoAtendimento").getAsString());
    }
    public boolean verificaHorarioExistente(String disciplina){
        boolean horarioExistente = horarioService.horarioExistente(disciplina);

        if (horarioExistente)
            return true;
        else
            return false;
    }

}
