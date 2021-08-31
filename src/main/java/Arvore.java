public class Arvore extends Vegetal{
    private String nomePopular;
    private double alturaMaxima;
    private int idade;
    private static int contador;

    public Arvore(String nomeCientifico, String nomePopular, String corDestaque, Double alturaMaxima, Integer idade){
        super(nomeCientifico, corDestaque);
        this.nomePopular = nomePopular;
        this.alturaMaxima = alturaMaxima;
        this.idade = idade;
        this.plantarVegetal();
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void printContadores() {
        System.out.println(String.format("Temos %d vegetais e %d desses são árvores", Vegetal.contador, Arvore.contador));
    }

    private void plantarVegetal() {
        Arvore.contador++;
    }

    public void setNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
    }

    public String getNomePopular() {
        return this.nomePopular;
    }
}
