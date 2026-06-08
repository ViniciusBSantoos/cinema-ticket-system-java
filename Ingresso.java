public class Ingresso {

    // ATRIBUTOS
    protected double valor; // valor base do ingresso
    protected String nomeFilme;
    protected String tipoAudio; // dublado ou legendado

    // CONSTRUTOR
    public Ingresso(double valor, String nomeFilme, String tipoAudio) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.tipoAudio = tipoAudio;
    }

    // MÉTODO QUE SERÁ SOBRESCRITO NAS CLASSES FILHAS
    public double calcularValor() {
        return valor;
    }

    // EXIBIR INFORMAÇÕES
    public void exibirInfo() {
        System.out.println("Filme: " + nomeFilme);
        System.out.println("Tipo: " + tipoAudio);
        System.out.println("Valor: R$ " + calcularValor());
    }
}