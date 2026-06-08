public class MeiaEntrada extends Ingresso {

    // CONSTRUTOR
    public MeiaEntrada(double valor, String nomeFilme, String tipoAudio) {
        super(valor, nomeFilme, tipoAudio);
    }

    // SOBRESCREVE O MÉTODO
    @Override
    public double calcularValor() {
        return valor / 2; // metade do valor
    }
}