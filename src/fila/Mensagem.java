package fila;

public class Mensagem {

    //mensagem de exibição do menu
    public void menuExibir() {
        System.out.println("====== MENU PRINCIPAL ======");
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

    //mensagem menu da opcao 1 e 4
    public void caixaAbertoAtendimentoFechado() {
        System.out.printf("Caixa aberto.");
        System.out.println("\nAtendimento fechado.");
    }

    //mensagem menu da opcao 2
    public void caixaFechadoAtendimentoFechado() {
        System.out.println("Caixa fechado.");
        System.out.println("Atendimento fechado.");
    }

    //mensagem menu da opcao 3
    public void caixaEAtendimentoAbertos() {
        System.out.printf("Caixa aberto.");
        System.out.println("\nAtendimento aberto.");
    }

    public void senhaEspereCaixaAbrir() {
        System.out.println("A senha não pode ser emitida! Espere o caixa abrir primeiro.");
    }

    public void senhaEspereAtendimentoAbrir() {
        System.out.println("A senha não pode ser emitida! Espere o atendimento abrir primeiro.");
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
