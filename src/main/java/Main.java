public class Main {
    public static void main(String[] args) {
        Vegetal banana = new Fruto("Musaceae",
                "Amarela",
                "Banana");

        Fruto laranja = new Fruto("Citrus X sinensis",
                "Laranja",
                "Laranja");

        Fruto mamao = new Fruto("Carica papaya",
                "Alaranjado",
                "Mamão");

        Arvore jacarandaDeMinas = new Arvore("Jacaranda Cuspidifolia",
                "Jacarandá de Minas",
                "Roxa",
                10.00,
                12);

        Vegetal chuvaDeOuro = new Arvore("Lophantera lactescens",
                "Chuva de Ouro",
                "Amarela",
                20.00,
                32);

        banana.printContadores();
        jacarandaDeMinas.printContadores();

        System.out.println("Consigo printar o nome popular \""+laranja.getNomePopular()+"\" e o nome cientifico \""+laranja.getNomeCientifico()+"\" pois sou uma "+laranja.getClass());
        System.out.println("Consigo printar apenas o nome cientifico "+chuvaDeOuro.getNomeCientifico());
    }
}
