package com.company;
import exercicioImpressora.*;
public class Main {

    public static void main(String[] args) {
        Contrato contratoDeAluguel =  new Contrato();
        contratoDeAluguel.setNome("Contrato 1");
        contratoDeAluguel.setTipo("contrato");

        Foto fotoDeFamilia = new Foto();
        fotoDeFamilia.setNome("Festa");
        fotoDeFamilia.setTipo("foto");

        Documento documentoOficial = new Documento();
        documentoOficial.setNome("Teste");
        documentoOficial.setTipo("documento");

        Impressora.adicionarImprimivel(contrato);
        Impressora.adicionarImprimivel(foto);
        Impressora.adicionarImprimivel(documento);


        Impressora.imprimirTudo();
    }
}
