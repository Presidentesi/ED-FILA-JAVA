package fila;

import java.util.ArrayList;

public class Caixa {

    private int numeroDoCaixa;
    private int numeroDaSenha;

    ArrayList<Integer> senhaComercial = new ArrayList<Integer>();

    public void abrirCaixa(int numero) {
        numeroDoCaixa = numero;
        System.out.printf("Caixa nr. " + numeroDoCaixa + " entrou em operação.");
    }

    public void condicaoGerarSenha() {
        if (senhaComercial.size() == 5) {
            imprimeLista();
            System.out.printf(" Arrray está cheio");
        } else {
            gerarSenha();
            imprimeLista();
        }
    }

    public void gerarSenha() {
        numeroDaSenha = numeroDaSenha + 1;
        senhaComercial.add(numeroDaSenha);
    }
    
    public void imprimeLista() {
        System.out.printf("comercial nr. ");
        for (int i = 0; i < senhaComercial.size(); i++) {
            System.out.printf(" %s ", senhaComercial.get(i));
        }
    }

    public void caixaNumero(int numeroDoCaixa) {
        System.out.printf("Dirija-se ao caixa nr. %d.", numeroDoCaixa);
    }

    public void senhaNumero(int numeroDaSenha) {
        System.out.printf("Dirija-se ao caixa nr. %d.", numeroDaSenha);
    }

    public int getNumeroDoCaixa() {
        return numeroDoCaixa;
    }

    public void setNumeroDoCaixa(int numeroDoCaixa) {
        this.numeroDoCaixa = numeroDoCaixa;
    }

    public int getNumeroDaSenha() {
        return numeroDaSenha;
    }

    public void setNumeroDaSenha(int numeroDaSenha) {
        this.numeroDaSenha = numeroDaSenha;
    }
}
