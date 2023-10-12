public class Tecnico {

    String nome;
    boolean tecnico;
    boolean auxiliar;

    public Tecnico(String nome, boolean tecnico, boolean auxiliar) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.auxiliar = auxiliar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isTecnico() {
        return tecnico;
    }

    public void setTecnico(boolean tecnico) {
        this.tecnico = tecnico;
    }

    public boolean isAuxiliar() {
        return auxiliar;
    }

    public void setAuxiliar(boolean auxiliar) {
        this.auxiliar = auxiliar;
    }
}
