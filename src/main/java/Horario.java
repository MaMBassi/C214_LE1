public class Horario {
    private String nomeProf; //nome do professor
    private String horaAtend; //horario de atendimento
    private String periodo; //periodo do atendimento (integral ou noturno)
    private String disciplina; //disciplina do professor
    private String localAtend; //local do atendimento

    public Horario(String nomeProf, String horaAtend, String periodo, String disciplina, String localAtend) {
        this.nomeProf = nomeProf;
        this.horaAtend = horaAtend;
        this.periodo = periodo;
        this.disciplina = disciplina;
        this.localAtend = localAtend;
    }

    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public String getHoraAtend() {
        return horaAtend;
    }

    public void setHoraAtend(String horaAtend) {
        this.horaAtend = horaAtend;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getLocalAtend() {
        return localAtend;
    }

    public void setLocalAtend(String localAtend) {
        this.localAtend = localAtend;
    }
}
