package fila;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistema {

    boolean opcaoCaixa;
    boolean opcaoAtendimento;
    boolean opcao3, opcao4, opcao5, opcao6, opcao7, opcao8;

    public void chamarMenu() {

        int opcao;

        Scanner entrada = new Scanner(System.in);
        //Menu mMenu = new Menu();

        do {
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
                System.out.print(" Escolha opção desejada: ");


                opcao = entrada.nextInt();

                switch (opcao) {
                    case 1:
                        fimdeLinhas();
                        System.out.println("Opção 1!!!");
                        //opcaoCaixa = true;
                        chamaOpcao1();
                        //mMenu.add(true);
                        break;

                    case 2:
                        fimdeLinhas();
                        System.out.println("Opção 2!!!");
                        chamaOpcao2();
                        break;

                    case 3:
                        fimdeLinhas();
                        System.out.println("Opção 3!!!");
                        chamaOpcao3();
                        break;

                    case 4:
                        fimdeLinhas();
                        System.out.println("Opção 4!!!");
                        chamaOpcao4();
                        break;

                    case 5:
                        fimdeLinhas();
                        System.out.println("Opção 5!!!");
                        chamaOpcao5();
                        break;

                    case 6:
                        fimdeLinhas();
                        System.out.println("Opção 6!!!");
                        chamaOpcao6();
                        break;

                    case 7:
                        fimdeLinhas();
                        System.out.println("Opção 7!!!");
                        chamaOpcao7();
                        break;

                    case 8:
                        fimdeLinhas();
                        System.out.println("Opção 8!!!");
                        chamaOpcao8();
                        break;

                    default:
                        fimdeLinhas();
                        System.out.println("Opção inválida, tente novamente!!!");
                }

        } while (opcao != 8);
    }

    public void chamaOpcao1() {
        if ((!opcaoCaixa) && (opcaoAtendimento == false)) {
            opcaoCaixa = true;
            System.out.println("Caixa aberto.");
            System.out.println("Atendimento fechado.");
            //distribuirFichas();
        } else if ((opcaoCaixa == true) && (opcaoAtendimento == true)){
            System.out.println("Caixa já está aberto. Tente outra opção!!!");
            System.out.println("Atendimento aberto.");
            
        } else {
            System.out.println("Caixa já está aberto. Tente outra opção!!!");
            System.out.println("Atendimento fechado.");
        }
    }

    public void chamaOpcao2() {
        if ((opcaoCaixa == true) && (opcaoAtendimento == false)) {
            opcaoCaixa = false;
            System.out.println("Caixa fechado.");
            System.out.println("Atendimento fechado.");
        } else if ((opcaoCaixa == true) && (opcaoAtendimento == true)){
            System.out.println("Caixa aberto.");
            System.out.println("Atendimento aberto!!! Feche o atendimento primeiro.");
        } else {
            System.out.println("Caixa já está fechado. Tente outra opção!!!");
            System.out.println("Atendimento fechado");
        }
    }

    public void chamaOpcao3() {
        if ((opcaoCaixa == true) && (opcaoAtendimento == false)){
            opcaoAtendimento = true;
            System.out.println("Caixa aberto.");
            System.out.println("Atendimento aberto.");
        } else if ((opcaoCaixa == false) && (opcaoAtendimento == false)) {
            System.out.println("Caixa fechado. Abra o caixa primeiro.");
            System.out.println("Atendimento fechado.");
        } else {
            System.out.println("Caixa aberto.");
            System.out.println("Atendimento já está aberto. Tente outra opção!!!");
        }
//        if (!opcaoCaixa) == (opcaoCaixa == false) {
//            System.out.println("False");
//        if (opcaoCaixa) == (opcaoCaixa == true) {
//            System.out.println("True");
//        }
        
//        if ((opcaoCaixa == true) && (opcaoAtendimento == false)) {
//            System.out.println("Caixa aberto.");
//            System.out.println("Atendimento aberto.");
//            opcaoAtendimento = true;
//        } else if ((opcaoCaixa == true) && (opcaoAtendimento == true)) {
//            System.out.println("Caixa aberto.");
//            System.out.println("Atendimento já está aberto. Tente outra opção!!!");
//        } else {
//            System.out.println("Caixa fechado. Abra o caixa primeiro.");
//            System.out.println("Atendimento fechado.");
//        }
    }

    public void chamaOpcao4() {
        if ((opcaoCaixa == true) && (opcaoAtendimento == true)) {
            System.out.println("Caixa aberto.");
            System.out.println("Atendimento fechado.");
            opcaoAtendimento = false;
        } else if ((opcaoCaixa == false) && (opcaoAtendimento == false)) {
            System.out.println("Caixa fechado.");
            System.out.println("Atendimento já está fechado. Tente outra opção!!!");
        } else {
            System.out.println("Caixa aberto.");
            System.out.println("Atendimento fechado. Abra o atendimento primeiro.");
        }
//        if ((opcaoCaixa == true) && (opcaoAtendimento == true)) {
//            System.out.println("Caixa aberto.");
//            System.out.println("Atendimento fechado.");
//            opcaoAtendimento = false;
//        } else if ((opcaoCaixa == false) && (opcaoAtendimento == false))  {
//            System.out.println("Caixa 2.");
//            System.out.println("Atendimento já está aberto.\nTente outra opção!!!");
//        } else {
//            System.out.println("Caixa fechado.");
//            System.out.println("Atendimento fechado");
//        }
    }

    public void chamaOpcao5() {
        System.out.println("Emitida senha comercial.");
    }

    public void chamaOpcao6() {
        System.out.println("Emitida senha prioritária.");
    }

    public void chamaOpcao7() {
        System.out.println("Próximo cliente.");
    }

    public void chamaOpcao8() {
        System.out.println("Operações encarradas.");
        System.exit(0);
    }

    public void fimdeLinhas() {
        int qtdLinhas = 10;
        for (int i = 0; i < qtdLinhas; i++) {
            System.out.println("\n");
        }
    }

    public void abrirCaixa(){
        
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
