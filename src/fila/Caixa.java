package fila;

import java.util.ArrayList;

public class Caixa {

    private int numeroDoCaixa;
    private int numeroDaSenha;
    public boolean status;

    private ArrayList<Integer> senhaComercial = new ArrayList<Integer>();
    
    //imforma o numero do caixa em operação
    public void abrirCaixa(int numero) {
        numeroDoCaixa = numero;
        System.out.printf("Caixa nr. " + numeroDoCaixa + " em operação.");
    }

    //verifica e limita a quantidade de senhas distribuidas ArrayList
    public void condicaoGerarSenha() {
        if (senhaComercial.size() == 20) {
            imprimeLista();
            System.out.printf(" | No máximo 20 senhas.");
        } else {
            gerarSenha();
            imprimeLista();
        }
    }

    //gera o numero da senha
    public void gerarSenha() {
        numeroDaSenha = numeroDaSenha + 1;
        senhaComercial.add(numeroDaSenha);
    }

    //verifica a destruição das senhas no ArrayList
    public void chamarSenha() {
        if (senhaComercial.isEmpty()) {
            imprimeLista();
            System.out.printf(" | Não há senhas.");
        } else {
            destruirSenha();
            imprimeLista();
        }
    }

    //destroi a senha do ArrayList
    public void destruirSenha() {
        senhaComercial.remove(0);
    }

    //imprime o ArrayList de senhas
    public void imprimeLista() {
        System.out.printf("comercial nr: ");
        for (int i = 0; i < senhaComercial.size(); i++) {
            System.out.printf(" %s ", senhaComercial.get(i));
        }
    }
    
    //imprime a primeira senha do ArreyList
    public void imprimePosicaoUm(){
        if (!senhaComercial.isEmpty()){
            System.out.printf(" [ %s ]", senhaComercial.get(0));
        }
    }
   
    //imprime a primeira senha do ArreyList
    public void imprimePosicaoDefaul(){
        if (-1 == senhaComercial.size()){
            System.out.printf(" [ %s ]", senhaComercial.get(1));
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

    public ArrayList<Integer> getSenhaComercial() {
        return senhaComercial;
    }

    public void setSenhaComercial(ArrayList<Integer> senhaComercial) {
        this.senhaComercial = senhaComercial;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
