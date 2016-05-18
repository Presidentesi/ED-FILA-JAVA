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

    public void etiquetaOpcao1() {
        System.out.printf("\nOpção 1 ");
    }

    public void etiquetaOpcao2() {
        System.out.printf("\nOpção 2");
    }

    public void etiquetaOpcao3() {
        System.out.printf("\nOpção 3");
    }

    public void etiquetaOpcao4() {
        System.out.printf("\nOpção 4");
    }

    public void etiquetaOpcao5() {
        System.out.printf("\nOpção 5");
    }

    public void etiquetaOpcao6() {
        System.out.printf("\nOpção 6");
    }

    public void etiquetaOpcao7() {
        System.out.printf("\nOpção 7");
    }

    public void etiquetaOpcao8() {
        System.out.printf("\nOpção 8");
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

    public void opcaoInvalida() {
        System.out.printf("\nOpção inválida, tente novamente!!!");
    }

    public void opcao() {
        System.out.printf("\nOpção. ");
    }

    //metodos relacionado opcao1
    public void caixaAberto() {
        System.out.printf("\nCaixa aberto. ");
    }

    public void caixaAbertoOutraOpcao() {
        System.out.printf("\nCaixa aberto. Tente outra opção!!!");
    }

    //metodos relacionado opcao2
    public void caixaFechado() {
        System.out.printf("\nCaixa fechado. ");
    }

    public void caixaFechadoOutraOpcao() {
        System.out.printf("\nCaixa fechado. Tente outra opção!!!");
    }

    public void caixaFechadoAbra() {
        System.out.printf("\nCaixa fechado. Abra o caixa primeiro. ");
    }

    //metodos relacionado opcao3
    public void atendimentoAberto() {
        System.out.printf("\nAtendimento aberto. ");
    }

    public void atendimentoAbertoOutraOpcao() {
        System.out.printf("\nAtendimento aberto. Tente outra opção!!!");
    }

    public void atendimentoAbertoFeche() {
        System.out.printf("\nAtendimento aberto!!! Feche o atendimento primeiro. ");
    }

    //metodos relacionado opcao4
    public void atendimentoFechado() {
        System.out.printf("\nAtendimento fechado. ");
    }

    public void atendimentoFechadoOutraOpcao() {
        System.out.printf("\nAtendimento fechado. Tente outra opção!!!");
    }

    //metodos relacionados opcao5 e opcao6
    public void senha() {
        System.out.printf("\nSenha ");
    }

    public void senhaEspereCaixaAbrir() {
        System.out.printf("\nSenha não pode ser emitida! Espere o caixa abrir primeiro.");
    }

    public void senhaEspereAtendimentoAbrir() {
        System.out.printf("\nSenha não pode ser emitida! Espere o atendimento abrir primeiro.");
    }

    //metodos relacionados opcao7
    public void proximoCliente() {
        System.out.printf("\nAtendimento aberto. Próximo cliente!!!.");
    }

    //metodos relacionados opcao8
    public void operacoesEncerradas() {
        System.out.printf("\nOperações encerradas.\n");
    }

    public void caixaAbertoEncerre() {
        System.out.printf("\nCaixa aberto. Encerre as operações.");
    }
    
    public void atendimentoAbertoEncerre() {
        System.out.printf("\nAtendimento aberto. Encerre as operações.");
    }
}
