public class Main {
    public static void main(String[] args) {

        // ingresso normal
        Ingresso ingresso = new Ingresso(50, "Vingadores", "Dublado");
        ingresso.exibirInfo();

        System.out.println("------------");

        // meia entrada
        MeiaEntrada meia = new MeiaEntrada(50, "Vingadores", "Legendado");
        meia.exibirInfo();

        System.out.println("------------");

        // ingresso família
        IngressoFamilia familia = new IngressoFamilia(50, "Vingadores", "Dublado", 4);
        familia.exibirInfo();
    }
}