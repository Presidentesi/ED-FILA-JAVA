package fila;

public class Mensagem {

    //mensagem de exibição do menu
    public void menuExibir() {
        System.out.println("\n====== MENU PRINCIPAL ======");
        System.out.println(" 1 - ABRIR O CAIXA");
        System.out.println(" 2 - FECHAR O CAIXA");
        System.out.println(" 3 - ABRIR ATENDIMENTO");
        System.out.println(" 4 - ENCERRAR ATENDIMENTO");
        System.out.println(" 5 - EMITIR SENHA COMERCIAL");
        System.out.println(" 6 - EMITIR SENHA PRIORITARIA");
        System.out.println(" 7 - CHAMAR CLIENTE");
        System.out.println(" 8 - SAIR");
        System.out.println("============================");
    }
    
    public void etiquetaOpcao1(){
        System.out.printf("\nOpção 1 ");
    }
    
    public void etiquetaOpcao2(){
        System.out.printf("\nOpção 2");
    }
    
    public void etiquetaOpcao3(){
        System.out.printf("\nOpção 3");
    }
    
    public void etiquetaOpcao4(){
        System.out.printf("\nOpção 4");
    }
    
    public void etiquetaOpcao5(){
        System.out.printf("\nOpção 5");
    }
    
    public void etiquetaOpcao6(){
        System.out.printf("\nOpção 6");
    }
    
    public void etiquetaOpcao7(){
        System.out.printf("\nOpção 7");
    }

    //mensagem menu da opcao 1 e 4
    public void caixaAbertoAtendimentoFechado() {
        System.out.printf("Caixa aberto.");
        System.out.println("\nAtendimento fechado.");
        System.out.printf("Senha ");
    }

    //mensagem menu da opcao 2
    public void caixaFechadoAtendimentoFechado() {
        System.out.println("Caixa fechado.");
        System.out.println("Atendimento fechado.");
        System.out.printf("Senha");
    }

    //mensagem menu da opcao 3
    public void caixaEAtendimentoAbertos() {
        System.out.printf("Caixa aberto.");
        System.out.println("\nAtendimento aberto.");
        System.out.printf("Senha");
    }
    
    public void opcaoInvalida(){
        System.out.println("Opção inválida, tente novamente!!!");
    }

    public void senhaEspereCaixaAbrir() {
        System.out.printf(" não pode ser emitida! Espere o caixa abrir primeiro.");
    }

    public void senhaEspereAtendimentoAbrir() {
        System.out.printf(" não pode ser emitida! Espere o atendimento abrir primeiro.");
    }

    public void operacoesEncerradas() {
        System.out.println("Operações encerradas.");
    }

    public void encerreAsOperacoes() {
        System.out.println("Encerre as operações do dia.");
    }



    
    public void opcao(){
        System.out.printf("\nOpção. ");
    }
    public void caixaAberto(){
        System.out.printf("\nCaixa aberto. ");
    }
    
    public void caixaAbertoOutraOpcao() {
        System.out.printf("\nCaixa aberto. Tente outra opção!!!");
    }
    
    public void caixaFechado(){
        System.out.printf("\nCaixa fechado. ");
    }
    
    public void caixaFechadoOutraOpcao(){
        System.out.printf("\nCaixa fechado. Tente outra opção!!!");
    }
    
    public void atendimentoFechado(){
        System.out.printf("\nAtendimento fechado. ");
    }
    
    public void atendimentoAbertoFeche(){
        System.out.printf("\nAtendimento aberto!!! Feche o atendimento primeiro. ");
    }
    
    public void atendimentoAberto(){
        System.out.printf("\nAtendimento aberto. ");
    }
    
    public void senha(){
        System.out.printf("\nSenha ");
    }
}
