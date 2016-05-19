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
    int numeroDoCaixa = 1;

    DisplayMensage mDisplay = new DisplayMensage();
    ArrayList<Integer> arrayOpcoes = new ArrayList<Integer>();
    Caixa mCaixa = new Caixa();

    //metodo para chamr a exibição do cabeçalho do menuInicial
    public void chamarCabecalhoMenu() {
        fimdeLinhas();
        System.out.printf("Opção");
        mDisplay.caixaFechado();
        mDisplay.atendimentoFechado();
        mDisplay.cursor();
        mDisplay.senha();
    }

    //metodo para chamr a exibição do menu
    public void chamarMenu() {

        //inicializa objeto Scanner que permite a entrada de dados via teclado
        Scanner entrada = new Scanner(System.in);

        //Menu mMenu = new Menu();
        //testa a condição de continuação do loop
        do {
            //try{

            //exibe o menu de Opcoes
            mDisplay.menuExibir();
            //atribui à opcaoMenu os dados para obter os dados via teclado
            System.out.print(" Escolha opção desejada: ");
            
            //try {
            //if (!entrada.hasNextInt()){
              //  System.out.print("Selecione somente numeros inteiros!");
              //  continue;
            //};
                opcaoMenu = entrada.nextInt();
            //} catch (InputMismatchException  e){
              //  System.out.print("Selecione somente numeros inteiros!");
            //} 
            
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
                mDisplay.etiquetaOpcao1();
                arrayOpcoes.add(opcaoMenu);
                chamaOpcao1();
                //mMenu.add(true);
                break;

            case 2:
                fimdeLinhas();
                arrayOpcoes.add(opcaoMenu);
                mDisplay.etiquetaOpcao2();
                chamaOpcao2();
                break;

            case 3:
                fimdeLinhas();
                arrayOpcoes.add(opcaoMenu);
                mDisplay.etiquetaOpcao3();
                chamaOpcao3();
                break;

            case 4:
                fimdeLinhas();
                arrayOpcoes.add(opcaoMenu);
                mDisplay.etiquetaOpcao4();
                chamaOpcao4();
                break;

            case 5:
                fimdeLinhas();
                arrayOpcoes.add(opcaoMenu);
                mDisplay.etiquetaOpcao5();
                chamaOpcao5();
                break;

            case 6:
                fimdeLinhas();
                arrayOpcoes.add(opcaoMenu);
                mDisplay.etiquetaOpcao6();
                chamaOpcao6();
                break;

            case 7:
                fimdeLinhas();
                arrayOpcoes.add(opcaoMenu);
                mDisplay.etiquetaOpcao7();
                chamaOpcao7();
                break;

            case 8:
                fimdeLinhas();
                arrayOpcoes.add(opcaoMenu);
                mDisplay.etiquetaOpcao8();
                chamaOpcao8();
                break;

            default:
                fimdeLinhas();
                arrayOpcoes.add(opcaoMenu);
                chamaOpcaoInvalida();
        }
    }

    //metodo para abrir o caixa
    public void chamaOpcao1() {
        if ((!opcaoCaixa) && (opcaoAtendimento == false)) {
            opcaoCaixa = true;
            mDisplay.caixaAberto();
            mDisplay.atendimentoFechado();
            mDisplay.cursor();
            mDisplay.senha();
        } else if ((opcaoCaixa == true) && (opcaoAtendimento == true)) {
            mDisplay.caixaAbertoOutraOpcao();
            mDisplay.atendimentoAberto();
            mDisplay.cursor();
            mDisplay.senha();
        } else {
            mDisplay.caixaAbertoOutraOpcao();
            mDisplay.atendimentoFechado();
            mDisplay.cursor();
            mDisplay.senha();
        }
    }

    //metodo para fechar o caixa
    public void chamaOpcao2() {
        if ((opcaoCaixa == true) && (opcaoAtendimento == false)) {
            opcaoCaixa = false;
            mDisplay.caixaFechado();
            mDisplay.atendimentoFechado();
            mDisplay.cursor();
            mDisplay.senha();
        } else if ((opcaoCaixa == true) && (opcaoAtendimento == true)) {
            mDisplay.caixaAberto();
            mDisplay.atendimentoAbertoFeche();
            mDisplay.cursor();
            mDisplay.senha();
        } else {
            mDisplay.caixaFechadoOutraOpcao();
            mDisplay.atendimentoFechado();
            mDisplay.cursor();
            mDisplay.senha();
        }
    }

    //metodo para abrir o atendimento
    public void chamaOpcao3() {
        if ((opcaoCaixa == true) && (opcaoAtendimento == false)) {
            opcaoAtendimento = true;
            mDisplay.caixaAberto();
            mDisplay.atendimentoAberto();
            mDisplay.cursor();
            mCaixa.abrirCaixa(numeroDoCaixa);
            mDisplay.senha();
            mCaixa.imprimeLista();
        } else if ((opcaoCaixa == false) && (opcaoAtendimento == false)) {
            mDisplay.caixaFechadoAbra();
            mDisplay.atendimentoFechado();
            mDisplay.cursor();
            mDisplay.senha();
        } else {
            mDisplay.caixaAberto();
            mDisplay.atendimentoAbertoOutraOpcao();
            mDisplay.cursor();
            mCaixa.abrirCaixa(numeroDoCaixa);
            mDisplay.senha();
        }
    }

    //metodo para encerrar o atendimento
    public void chamaOpcao4() {
        if ((opcaoCaixa == false) && (opcaoAtendimento == false)) {
            opcaoAtendimento = false;
            mDisplay.caixaFechado();
            mDisplay.atendimentoFechadoOutraOpcao();
            mDisplay.cursor();
            mCaixa.caixaNumero(numeroDoCaixa);
            mDisplay.senha();
        } else if ((opcaoCaixa == true) && (opcaoAtendimento == true)) {
            mDisplay.caixaAberto();
            mDisplay.atendimentoFechado();
            mDisplay.cursor();
            mDisplay.proximoCliente();
            mCaixa.imprimePosicaoDefaul();
            //mCaixa.caixaNumero(numeroDoCaixa);
            mDisplay.senha();
            mCaixa.imprimeLista();
            opcaoAtendimento = false;
        } else if ((opcaoCaixa == true) && (opcaoAtendimento == false)) {
            mDisplay.caixaAberto();
            mDisplay.atendimentoFechadoOutraOpcao();
            mDisplay.cursor();
            mCaixa.caixaNumero(numeroDoCaixa);
            mDisplay.senha();
        } else {
            mDisplay.caixaFechado();
            mDisplay.atendimentoAbertoOutraOpcao();
            mDisplay.cursor();
            mDisplay.senha();
        }
    }

    //metodo para emitir senha comercial
    public void chamaOpcao5() {
        if ((opcaoCaixa == false) && (opcaoAtendimento == false)) {
            mDisplay.caixaFechado();
            mDisplay.atendimentoFechado();
            mDisplay.senhaEspereCaixaAbrir();
            mDisplay.cursor();
            mCaixa.caixaNumero(numeroDoCaixa);
            mDisplay.senha();
            //mCaixa.gerarSenha();
        } else if ((opcaoCaixa == true) && (opcaoAtendimento == true)) {
            mDisplay.caixaAberto();
            mDisplay.atendimentoAberto();
            mDisplay.cursor();
            mDisplay.proximoCliente();
//            mCaixa.caixaNumero(numeroDoCaixa);cxkcjgkjxvglkxcjgvlkjcxglkjg
            mDisplay.senha();
            mCaixa.condicaoGerarSenha();
        } else {
            mDisplay.caixaAberto();
            mDisplay.atendimentoFechado();
            mDisplay.senhaEspereAtendimentoAbrir();
            mDisplay.cursor();
            mDisplay.proximoCliente();
            //mCaixa.caixaNumero(numeroDoCaixa);
            mDisplay.senha();
            //mCaixa.gerarSenha();
            mCaixa.imprimeLista();
        }
    }

    //metodo para emitir senha prioritária
    public void chamaOpcao6() {
        if ((opcaoCaixa == false) && (opcaoAtendimento == false)) {
            mDisplay.caixaFechado();
            mDisplay.atendimentoFechado();
            mDisplay.senhaEspereCaixaAbrir();
            mDisplay.cursor();
            mCaixa.caixaNumero(numeroDoCaixa);
            mDisplay.senha();
        } else if ((opcaoCaixa == true) && (opcaoAtendimento == true)) {
            mDisplay.caixaAberto();
            mDisplay.atendimentoAberto();
            mDisplay.cursor();
            mCaixa.caixaNumero(numeroDoCaixa);
            //System.out.printf("1 - Emitida senha prioritária.");
            mDisplay.senha();
            mCaixa.gerarSenha();
        } else {
            mDisplay.caixaAberto();
            mDisplay.atendimentoFechado();
            mDisplay.senhaEspereAtendimentoAbrir();
            mDisplay.cursor();
            mCaixa.caixaNumero(numeroDoCaixa);
            mDisplay.senha();
            
        }
    }

    //metodo para chamar cliente
    public void chamaOpcao7() {
        if ((opcaoAtendimento == true) || (opcaoAtendimento == false)) {
            mDisplay.caixaAberto();
            mDisplay.atendimentoAberto();
            mDisplay.cursor();
            mDisplay.proximoCliente();
            mCaixa.imprimePosicaoUm();
            mDisplay.senha();
            mCaixa.chamarSenha();
        }
    }

    //metodo para sair do sistema
    public void chamaOpcao8() {
        if ((opcaoCaixa == false) && (opcaoAtendimento == false)) {
            mDisplay.caixaFechado();
            mDisplay.atendimentoFechado();
            mDisplay.operacoesEncerradas();
            opcaoSair = true;
        } else if ((opcaoCaixa == true) && (opcaoAtendimento == true)) {
            mDisplay.caixaAberto();
            mDisplay.atendimentoAbertoEncerre();
            mDisplay.senha();
        } else {
            mDisplay.caixaAbertoEncerre();
            mDisplay.atendimentoFechado();
            mDisplay.senha();
        }
    }

    public void chamaOpcaoInvalida() {
        //inicializa variavel e armazena a ultima posicao do ArrayList de opcoes selecionadas
        arrayIndiceFinal = (arrayOpcoes.size() - 1);

        //chama mensagem
        mDisplay.opcaoInvalida();

//        System.out.println("\n");
//        for( int i=0; i < arrayOpcoes.size(); i++){
//            System.out.printf(" %s ", arrayOpcoes.get(i));
//        }
//        
//        System.out.println("\n");
//        for( int i=0; i < arrayOpcoes.size(); i++){
//            System.out.printf(" %s ", arrayOpcoes.indexOf(i));
//        }
//        if (arrayOpcoes.get(arrayOpcoes.size()) == null){
//            System.out.println("valor nulo");  
//        } else {
//            System.out.println("chamar controle");
//        }
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
        controleSelecao();
        //arrayOpcoes.clear();
    }

    public void controleSelecao() {
        try {
            //controle de selecao de multiplos casos
            //retorna o display da ultima opçao selecionanda
            if (arrayOpcoes.get(arrayIndiceFinal) == 1) {
                mDisplay.caixaAberto();
                mDisplay.atendimentoFechado();
                mDisplay.senha();
            } else if (arrayOpcoes.get(arrayIndiceFinal) == 2) {
                mDisplay.caixaFechado();
                mDisplay.atendimentoFechado();
                mDisplay.senha();
            } else if (arrayOpcoes.get(arrayIndiceFinal) == 3) {
                mDisplay.caixaAberto();
                mDisplay.atendimentoAberto();
                mDisplay.senha();
            } else if (arrayOpcoes.get(arrayIndiceFinal) == 4) {
                mDisplay.caixaAberto();
                mDisplay.atendimentoFechado();
                mDisplay.senha();
            } else if (arrayOpcoes.get(arrayIndiceFinal) == 5) {
                mDisplay.caixaAberto();
                mDisplay.atendimentoAberto();
                mDisplay.senha();
            } else if (arrayOpcoes.get(arrayIndiceFinal) == 6) {
                mDisplay.caixaAberto();
                mDisplay.atendimentoAberto();
                mDisplay.senha();
            } else if (arrayOpcoes.get(arrayIndiceFinal) == 7) {
                mDisplay.caixaAberto();
                mDisplay.atendimentoAberto();
                mDisplay.senha();
            } else {
                mDisplay.caixaFechado();
                mDisplay.atendimentoFechado();
                mDisplay.senha();
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (InputMismatchException e){
            System.out.println("Inserir somente numeoros.");;
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
