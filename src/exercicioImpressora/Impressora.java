package exercicioImpressora;

public abstract class Impressora {
    public static Imprimivel[] listaDeImprimiveis = new Imprimivel[3];
    private static int posicaoVaga = -1;

    public static void imprimirTudo() {
        for(int i = 0; i <= posicaoVaga; i++){
            listaDeImprimiveis[i].imprimir();
            System.out.println("");
        }
    }
    public static void adicionarImprimivel(Imprimivel imprimivel) {
        posicaoVaga++;
        listaDeImprimiveis[posicaoVaga] = imprimivel;
    }

}
