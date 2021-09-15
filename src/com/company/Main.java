package com.company;
import exercicioImpressora.*;
public class Main {

    public static void main(String[] args) {
        Contrato contrato =  new Contrato();
        contrato.setNome("Contrato 1");
        contrato.setTipo("contrato");

        Foto foto = new Foto();
        foto.setNome("Festa");
        foto.setTipo("foto");

        Documento documento = new Documento();
        documento.setNome("Teste");
        documento.setTipo("documento");

        Impressora.adicionarImprimivel(contrato);
        Impressora.adicionarImprimivel(foto);
        Impressora.adicionarImprimivel(documento);


        Impressora.imprimirTudo();
    }
}
