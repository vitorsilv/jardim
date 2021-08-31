public abstract class Vegetal{
    private String nomeCientifico;
    private String corDestaque;
    protected static int contador;

    public Vegetal(String nomeCientifico, String corDestaque){
        this.nomeCientifico = nomeCientifico;
        this.corDestaque = corDestaque;
        Vegetal.contador++;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public String getCorDestaque() {
        return corDestaque;
    }

    public void setCorDestaque(String corDestaque) {
        this.corDestaque = corDestaque;
    }

    abstract void printContadores();
}
