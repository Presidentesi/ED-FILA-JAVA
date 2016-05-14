package fila;

public class Caixa {

    private int numeroDoCaixa;
    private int numeroDaSenha;
    
    public void abrirCaixa(int numero){
        numeroDoCaixa = numero;
        System.out.println("Caixa nr. " + numeroDoCaixa + " entrou em operação.");
    }
    
    public void proximaSenha(){
        numeroDaSenha = numeroDaSenha + 1;
        System.out.println("Próxima senha : " + numeroDaSenha);
        System.out.println("Dirija-se ao caixa nr. " + numeroDoCaixa + ".");
    }
}
