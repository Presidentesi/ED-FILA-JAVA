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
        System.out.println("Opção 1");
    }
    
    public void etiquetaOpcao2(){
        System.out.println("Opção 2");
    }
    
    public void etiquetaOpcao3(){
        System.out.println("Opção 3");
    }
    
    public void etiquetaOpcao4(){
        System.out.println("Opção 4");
    }
    
    public void etiquetaOpcao5(){
        System.out.println("Opção 5");
    }
    
    public void etiquetaOpcao6(){
        System.out.println("Opção 6");
    }
    
    public void etiquetaOpcao7(){
        System.out.println("Opção 7");
    }

    //mensagem menu da opcao 1 e 4
    public void caixaAbertoAtendimentoFechado() {
        System.out.printf("Caixa aberto.");
        System.out.println("\nAtendimento fechado.");
        System.out.printf("Senha");
    }

    //mensagem menu da opcao 2
    public void caixaFechadoAtendimentoFechado() {
        System.out.println("Caixa fechado.");
        System.out.println("Atendimento fechado.");
        System.out.printf("Senha ");
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
        System.out.printf("não pode ser emitida! Espere o caixa abrir primeiro.");
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

    public void caixaAbertoOutraOpcao() {
        System.out.println(" Tente outra opção!!!");
    }

//    public void chamaOpcaoInvalida(boolean opcaoCaixa){
//        System.out.print("%i", opcaoCaixa);
//    }
}
