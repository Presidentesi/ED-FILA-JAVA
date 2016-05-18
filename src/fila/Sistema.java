package fila;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sistema {

    boolean opcaoCaixa;
    boolean opcaoAtendimento;
    boolean opcaoSair;
    int opcaoMenu;
    int arrayIndiceFinal;

    Mensagem mMsg = new Mensagem();
    ArrayList<Integer> arrayOpcoes = new ArrayList<Integer>();

    public void chamarCabecalho() {
        fimdeLinhas();
        System.out.println("Opção");
        mMsg.caixaFechadoAtendimentoFechado();
    }

    public void chamarMenu() {

        //inicializa objeto Scanner que permite a entrada de dados via teclado
        Scanner entrada = new Scanner(System.in);

        //Menu mMenu = new Menu();
        //testa a condição de continuação do loop
        do {
            //try{

            //exibe o menu de Opcoes
            mMsg.menuExibir();
            //atribui à opcaoMenu os dados para obter os dados via teclado
            System.out.print(" Escolha opção desejada: ");
            opcaoMenu = entrada.nextInt();

            //metodo chama o seletor de opcoes
            seletorDeOpcoes(opcaoMenu);
//            } catch (InputMismatchException e){
//                e.printStackTrace();
//            }
        } while (!opcaoSair);
    }

    //metodo para chamar o seletor de opçoes
    public void seletorDeOpcoes(int opcaoMenu) {

        switch (opcaoMenu) {
            case 1:
                fimdeLinhas();
                mMsg.etiquetaOpcao1();
                arrayOpcoes.add(opcaoMenu);
                chamaOpcao1();
                //mMenu.add(true);
                break;

            case 2:
                fimdeLinhas();
                arrayOpcoes.add(opcaoMenu);
                System.out.println("Opção 2");
                chamaOpcao2();
                break;

            case 3:
                fimdeLinhas();
                arrayOpcoes.add(opcaoMenu);
                System.out.println("Opção 3");
                chamaOpcao3();
                break;

            case 4:
                fimdeLinhas();
                arrayOpcoes.add(opcaoMenu);
                System.out.println("Opção 4");
                chamaOpcao4();
                break;

            case 5:
                fimdeLinhas();
                arrayOpcoes.add(opcaoMenu);
                System.out.println("Opção 5");
                chamaOpcao5();
                break;

            case 6:
                fimdeLinhas();
                arrayOpcoes.add(opcaoMenu);
                System.out.println("Opção 6");
                chamaOpcao6();
                break;

            case 7:
                fimdeLinhas();
                arrayOpcoes.add(opcaoMenu);
                System.out.println("Opção 7");
                chamaOpcao7();
                break;

            case 8:
                fimdeLinhas();
                arrayOpcoes.add(opcaoMenu);
                System.out.println("Opção 8");
                chamaOpcao8();
                break;

            default:
                fimdeLinhas();
                chamaOpcaoInvalida();
        }
    }

    //metodo para abrir o caixa
    public void chamaOpcao1() {
        if ((!opcaoCaixa) && (opcaoAtendimento == false)) {
            opcaoCaixa = true;
            mMsg.caixaAbertoAtendimentoFechado();
            //chamarMenu();
        } else if ((opcaoCaixa == true) && (opcaoAtendimento == true)) {
            System.out.println("Caixa aberto. Tente outra opção!!!");
            System.out.println("Atendimento aberto.");
            System.out.println("Senha");
        } else {
            System.out.println("Caixa aberto. Tente outra opção!!!");
            System.out.println("Atendimento fechado.");
            System.out.println("Senha");
        }
    }

    //metodo para fechar o caixa
    public void chamaOpcao2() {
        if ((opcaoCaixa == true) && (opcaoAtendimento == false)) {
            opcaoCaixa = false;
            mMsg.caixaFechadoAtendimentoFechado();
            //System.out.println("Senha");
        } else if ((opcaoCaixa == true) && (opcaoAtendimento == true)) {
            System.out.println("Caixa aberto.");
            System.out.println("Atendimento aberto!!! Feche o atendimento primeiro.");
            System.out.println("Senha");
        } else {
            System.out.println("Caixa fechado. Tente outra opção!!!");
            System.out.println("Atendimento fechado");
            System.out.println("Senha");
        }
    }

    //metodo para abrir o atendimento
    public void chamaOpcao3() {
        if ((opcaoCaixa == true) && (opcaoAtendimento == false)) {
            opcaoAtendimento = true;
            mMsg.caixaEAtendimentoAbertos();
            //System.out.println("Senha");
        } else if ((opcaoCaixa == false) && (opcaoAtendimento == false)) {
            System.out.println("Caixa fechado. Abra o caixa primeiro.");
            System.out.println("Atendimento fechado.");
            System.out.println("Senha");
        } else {
            System.out.println("Caixa aberto.");
            System.out.println("Atendimento aberto. Tente outra opção!!!");
            System.out.println("Senha");
        }
    }

    //metodo para encerrar o atendimento
    public void chamaOpcao4() {
        if ((opcaoCaixa == true) && (opcaoAtendimento == true)) {
            mMsg.caixaAbertoAtendimentoFechado();
            //System.out.println("Senha");
            opcaoAtendimento = false;
        } else if ((opcaoCaixa == true) && (opcaoAtendimento == false)) {
            System.out.println("Caixa aberto.");
            System.out.println("Atendimento fechado. Tente outra opção!!!");
            System.out.println("Senha");
        } else {
            System.out.println("Caixa fechado.");
            System.out.println("Atendimento fechado. Tente outra opção!!!");
            System.out.println("Senha");
        }
    }

    //metodo para emitir senha comercial
    public void chamaOpcao5() {
        if ((opcaoCaixa == false) && (opcaoAtendimento == false)) {
            mMsg.caixaFechadoAtendimentoFechado();
            mMsg.senhaEspereCaixaAbrir();
        } else if ((opcaoCaixa == false) && (opcaoAtendimento == true)) {
            System.out.println("2");
            System.out.println("2-A senha não pode ser emitida! O caixa está fechado.");
        } else if ((opcaoCaixa == true) && (opcaoAtendimento == true)) {
            mMsg.caixaEAtendimentoAbertos();
            System.out.println("1-Emitida senha comercial.");
        } else {
            mMsg.caixaAbertoAtendimentoFechado();
            mMsg.senhaEspereAtendimentoAbrir();
        }
    }

    public void chamaOpcao6() {
        System.out.println("Emitida senha prioritária.");
    }

    public void chamaOpcao7() {
        System.out.println("Próximo cliente.");
    }

    public void chamaOpcao8() {
        if ((opcaoCaixa == false) && (opcaoAtendimento == false)) {
            mMsg.operacoesEncerradas();
            opcaoSair = true;
        } else if ((opcaoCaixa == true) && (opcaoAtendimento == true)) {
            mMsg.caixaEAtendimentoAbertos();
            mMsg.encerreAsOperacoes();
        } else {
            mMsg.caixaAbertoAtendimentoFechado();
            mMsg.encerreAsOperacoes();
        }
    }

    public void chamaOpcaoInvalida() {
//      inicializa variavel e armazena a ultima posicao do ArrayList de opcoes selecionadas
        arrayIndiceFinal = (arrayOpcoes.size() - 1);

        for( int i = 0 ; i < arrayOpcoes.size(); i++){
            System.out.printf("%d ", arrayOpcoes.get(i));
        }
        System.out.printf("\nUltima teclada: %d\n", arrayOpcoes.get(arrayIndiceFinal));
        
        //System.out.println("Metodo Opcao Invalida");
        mMsg.opcaoInvalida();
        //mMsg.etiquetaOpcao1();
        controleSelecao();

        //chama metodo para exibir o menu de opcoes
        mMsg.menuExibir();
       
        //controle de excecao caso ocorra um erro durante a execucao da Thread
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        }

        fimdeLinhas();
        controleSelecao();
        chamarMenu();
        //mMsg.etiquetaOpcao1();
        //fimdeLinhas();

        //controleSelecao();
        //arrayOpcoes.clear();
    }

    public void controleSelecao() {
        //controle de selecao de multiplos casos
        if (arrayOpcoes.get(arrayIndiceFinal) == 1) {
            //mMsg.etiquetaOpcao1();
            mMsg.caixaAbertoAtendimentoFechado();
            //System.out.println("Opção 1x");
            //System.out.println("1");
            //System.out.println("1");
            //System.out.println("1");
        }
        if (arrayOpcoes.get(arrayIndiceFinal) == 2) {
            //mMsg.etiquetaOpcao2();
            //mMsg.caixaFechadoAtendimentoFechado();
            System.out.println("Opção 2x");
            System.out.println("2");
            System.out.println("2");
            System.out.println("2");
            //chamaOpcao1();
        } else if (arrayOpcoes.get(arrayIndiceFinal) == 3) {
            System.out.println("Opção 3x");
            System.out.println("3");
            System.out.println("3");
            System.out.println("3");
            //chamaOpcao2();
        } else if (arrayOpcoes.get(arrayIndiceFinal) == 4) {
            System.out.println("Opção 4x");
            System.out.println("4");
            System.out.println("4");
            System.out.println("4");
            //chamaOpcao3();
        } else if (arrayOpcoes.get(arrayIndiceFinal) == 5) {
            System.out.println("Opção 5x");
            System.out.println("5");
            System.out.println("5");
            System.out.println("5");
            //chamaOpcao4();
        } else if (arrayOpcoes.get(arrayIndiceFinal) == 6) {
            System.out.println("Opção 6x");
            System.out.println("6");
            System.out.println("6");
            System.out.println("6");
            //chamaOpcao5();
        } else if (arrayOpcoes.get(arrayIndiceFinal) == 7) {
            System.out.println("Opção 7x");
            System.out.println("7");
            System.out.println("7");
            System.out.println("7");
            //chamaOpcao6();
        } else {
            return;
        }
    }

    public void fimdeLinhas() {
        int qtdLinhas = 10;
        for (int i = 0; i < qtdLinhas; i++) {
            System.out.println("\n");
        }
    }

    public void abrirCaixa() {

    }

    public void distribuirFichas() {

        Scanner entrada = new Scanner(System.in);
        boolean error = true;

        do {
            try {
                System.out.println("Quantas fichas serão distribuidas (MIN-1 MAX-10) ? ");
                int qtdFichas = entrada.nextInt();

                System.out.printf("Numero de fichas: %d\n", qtdFichas);

                if ((qtdFichas >= 1) && (qtdFichas <= 10)) {
                    System.out.printf("Voce distribuiu %d fichas para os clientes.\n", qtdFichas);
                } else {
                    distribuirFichas();
                }
                System.exit(0);

            } catch (InputMismatchException e) {
                fimdeLinhas();
                System.out.println("Desculpa, somente números!");
                distribuirFichas();
            }
        } while (error);

    }

}
