public class Fruto extends Vegetal{

    private String nomePopular;
    private static int contador;

    public Fruto(String nomeCientifico, String corDestaque, String nomePopular) {
        super(nomeCientifico, corDestaque);
        this.nomePopular = nomePopular;
        this.plantarVegetal();
    }
    @Override
    public void printContadores() {
        System.out.println(String.format("Temos %d vegetais e %d desses são frutos", Vegetal.contador, Fruto.contador));
    }

    private void plantarVegetal() {
        Fruto.contador++;
    }

    public void setNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
    }

    public String getNomePopular() {
        return this.nomePopular;
    }
}
