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
    boolean opcaoInvalida;
    int opcaoMenu;
    int arrayIndiceFinal;

    Mensagem mMsg = new Mensagem();
    ArrayList<Integer> arrayOpcoes = new ArrayList<Integer>();
    Caixa mCaixa = new Caixa();
    
    public void chamarCabecalhoMenu() {
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
                mMsg.etiquetaOpcao2();
                chamaOpcao2();
                break;

            case 3:
                fimdeLinhas();
                arrayOpcoes.add(opcaoMenu);
                mMsg.etiquetaOpcao3();
                chamaOpcao3();
                break;

            case 4:
                fimdeLinhas();
                arrayOpcoes.add(opcaoMenu);
                mMsg.etiquetaOpcao4();
                chamaOpcao4();
                break;

            case 5:
                fimdeLinhas();
                arrayOpcoes.add(opcaoMenu);
                mMsg.etiquetaOpcao5();
                chamaOpcao5();
                break;

            case 6:
                fimdeLinhas();
                arrayOpcoes.add(opcaoMenu);
                mMsg.etiquetaOpcao6();
                chamaOpcao6();
                break;

            case 7:
                fimdeLinhas();
                arrayOpcoes.add(opcaoMenu);
                mMsg.etiquetaOpcao7();
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
            mMsg.caixaAberto();
            mMsg.atendimentoFechado();
            mMsg.senha();
            //mMsg.caixaAbertoAtendimentoFechado();
            //mCaixa.abrirCaixa(opcaoMenu);
        } else if ((opcaoCaixa == true) && (opcaoAtendimento == true)) {
            //mMsg.caixaAberto();
            mMsg.caixaAbertoOutraOpcao();
            //System.out.println("Caixa aberto. Tente outra opção!!!");
            mMsg.atendimentoAberto();
            mMsg.senha();
        } else {
            //mMsg.caixaAberto();
            mMsg.caixaAbertoOutraOpcao();
            //System.out.println("Caixa aberto. Tente outra opção!!!");
            mMsg.atendimentoFechado();
            //System.out.println("Atendimento fechado.");
            mMsg.senha();
            //System.out.println("Senha");
        }
    }

    //metodo para fechar o caixa
    public void chamaOpcao2() {
        if ((opcaoCaixa == true) && (opcaoAtendimento == false)) {
            opcaoCaixa = false;
            mMsg.caixaFechado();
            mMsg.atendimentoFechado();
            mMsg.senha();
            //mMsg.caixaFechadoAtendimentoFechado();
        } else if ((opcaoCaixa == true) && (opcaoAtendimento == true)) {
            mMsg.caixaAberto();
            //mMsg.atendimentoAberto();
            mMsg.atendimentoAbertoFeche();
            mMsg.senha();
            //System.out.println("Caixa aberto.");
            //System.out.println("Atendimento aberto!!! Feche o atendimento primeiro.");
            //System.out.println("Senha");
        } else {
            mMsg.caixaFechadoOutraOpcao();
            mMsg.atendimentoFechado();
            mMsg.senha();
            //System.out.println("Caixa fechado. Tente outra opção!!!");
            //System.out.println("Atendimento fechado");
            //System.out.println("Senha");
        }
    }

    //metodo para abrir o atendimento
    public void chamaOpcao3() {
        if ((opcaoCaixa == true) && (opcaoAtendimento == false)) {
            opcaoAtendimento = true;
            mMsg.caixaAberto();
            mMsg.atendimentoAberto();
            mMsg.senha();
            //mMsg.caixaEAtendimentoAbertos();
        } else if ((opcaoCaixa == false) && (opcaoAtendimento == false)) {
            mMsg.caixaFechadoAbra();
            mMsg.atendimentoFechado();
            mMsg.senha();
            //System.out.println("Caixa fechado. Abra o caixa primeiro.");
            //System.out.println("Atendimento fechado.");
            //System.out.println("Senha");
        } else {
            mMsg.caixaAberto();
            mMsg.atendimentoAbertoOutraOpcao();
            mMsg.senha();
            //System.out.println("Caixa aberto.");
            //System.out.println("Atendimento aberto. Tente outra opção!!!");
            //System.out.println("Senha");
        }
    }

    //metodo para encerrar o atendimento
    public void chamaOpcao4() {
        if ((opcaoCaixa == false) && (opcaoAtendimento == false)) {
            opcaoAtendimento = false;
            mMsg.caixaFechado();
            mMsg.atendimentoFechadoOutraOpcao();
            mMsg.senha();
        } else if ((opcaoCaixa == true) && (opcaoAtendimento == true)) {
            mMsg.caixaAberto();
            mMsg.atendimentoFechado();
            mMsg.senha();
            //mMsg.caixaAbertoAtendimentoFechado();
            //System.out.println("Senha");
            opcaoAtendimento = false;
        } else if ((opcaoCaixa == true) && (opcaoAtendimento == false)) {
            mMsg.caixaAberto();
            mMsg.atendimentoFechadoOutraOpcao();
            mMsg.senha();
            //System.out.println("Caixa aberto.");
            //System.out.println("Atendimento fechado. Tente outra opção!!!");
            //System.out.println("Senha");
        } else {
            mMsg.caixaFechado();
            mMsg.atendimentoAbertoOutraOpcao();
            mMsg.senha();
            //System.out.println("Caixa fechado.");
            //System.out.println("Atendimento fechado. Tente outra opção!!!");
            //System.out.println("Senha");
        }
    }

    //metodo para emitir senha comercial
    public void chamaOpcao5() {
        if ((opcaoCaixa == false) && (opcaoAtendimento == false)) {
            mMsg.caixaFechado();
            mMsg.atendimentoFechado();
            //mMsg.caixaFechadoAtendimentoFechado();
            mMsg.senhaEspereCaixaAbrir();
        } else if ((opcaoCaixa == true) && (opcaoAtendimento == true)) {
            mMsg.caixaAberto();
            mMsg.atendimentoAberto();
            //mMsg.caixaEAtendimentoAbertos();
            mMsg.senha();
            System.out.printf("1 - Emitida senha comercial.");
        } else {
            mMsg.caixaAberto();
            mMsg.atendimentoFechado();
            //mMsg.caixaAbertoAtendimentoFechado();
            mMsg.senhaEspereAtendimentoAbrir();
        }
    }
    
    //metodo para emitir senha prioritária
    public void chamaOpcao6() {
        if ((opcaoCaixa == false) && (opcaoAtendimento == false)) {
            mMsg.caixaFechadoAtendimentoFechado();
            mMsg.senhaEspereCaixaAbrir();
        } else if ((opcaoCaixa == true) && (opcaoAtendimento == true)) {
            mMsg.caixaEAtendimentoAbertos();
            System.out.printf(" 1 - Emitida senha prioritária.");
        } else {
            mMsg.caixaAbertoAtendimentoFechado();
            mMsg.senhaEspereAtendimentoAbrir();
        }
    }

    //metodo para chamar o senha ao caixa
    public void chamaOpcao7() {
        System.out.println("Próximo cliente.");
    }

    //metodo para sair do sistema
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
        //inicializa variavel e armazena a ultima posicao do ArrayList de opcoes selecionadas
        arrayIndiceFinal = (arrayOpcoes.size() - 1);
        
        //chama mensagem
        mMsg.opcaoInvalida();
        
        //metodo se selecao
        //controleSelecao();

        //chama metodo para exibir o menu de opcoes
        //mMsg.menuExibir();
       
        //controle de excecao caso ocorra um erro durante a execucao da Thread
        //try {
        //    Thread.sleep(3000);
        //} catch (InterruptedException ex) {
        //    Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
       // }
        
        //System.out.printf("%s ", arrayOpcoes.get(arrayOpcoes.size()));

        //fimdeLinhas();
        //controleSelecao();
        
        //chamarMenu();
        //mMsg.etiquetaOpcao1();
        //fimdeLinhas();

        //controleSelecao();
        //arrayOpcoes.clear();
    }

    public void controleSelecao() {
        try {
            
                    //controle de selecao de multiplos casos
        if (arrayOpcoes.get(arrayIndiceFinal) == 1) {
            chamaOpcao1();
            //mMsg.caixaAbertoAtendimentoFechado();
        }
        if (arrayOpcoes.get(arrayIndiceFinal) == 2) {
            chamaOpcao2();//mMsg.caixaFechadoAtendimentoFechado();
        } else if (arrayOpcoes.get(arrayIndiceFinal) == 3) {
            chamaOpcao3();//mMsg.caixaEAtendimentoAbertos();
        } else if (arrayOpcoes.get(arrayIndiceFinal) == 4) {
            chamaOpcao4();//mMsg.caixaAbertoAtendimentoFechado();
        } else if (arrayOpcoes.get(arrayIndiceFinal) == 5) {
            mMsg.caixaFechadoAtendimentoFechado();
            mMsg.senhaEspereCaixaAbrir();
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
        }
            
        }catch (ArrayIndexOutOfBoundsException e ){
            e.printStackTrace();
        }

        
    }

    public void fimdeLinhas() {
        int qtdLinhas = 10;
        for (int i = 0; i < qtdLinhas; i++) {
            System.out.println("\n");
        }
    }

//    public void abrirCaixa() {
//
//    }

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
