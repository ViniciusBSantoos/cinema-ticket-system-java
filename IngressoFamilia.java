public class IngressoFamilia extends Ingresso {

    private int quantidadePessoas;

    // CONSTRUTOR
    public IngressoFamilia(double valor, String nomeFilme, String tipoAudio, int quantidadePessoas) {
        super(valor, nomeFilme, tipoAudio);
        this.quantidadePessoas = quantidadePessoas;
    }

    // SOBRESCREVE O MÉTODO
    @Override
    public double calcularValor() {

        double total = valor * quantidadePessoas;

        // desconto de 5% se mais de 3 pessoas
        if (quantidadePessoas > 3) {
            total = total * 0.95;
        }

        return total;
    }
}