package fila;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistema {
    
    boolean opcaoCaixa;
    boolean opcaoAtendimento;
    boolean opcaoSair;
    
    Mensagem mMsg = new Mensagem();
    
    public void chamarMenu() {
        
        int opcaoMenu;
        
        
        Scanner entrada = new Scanner(System.in);
        //Menu mMenu = new Menu();
        fimdeLinhas();
        System.out.println("Opção");
        System.out.println("Caixa");
        System.out.println("Atendimento");
        System.out.println("Senha");
        
        
        do {
            //try{
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
            
            opcaoMenu = entrada.nextInt();
            
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
                System.out.println("Opção 1");
                //opcaoCaixa = true;
                chamaOpcao1();
                //mMenu.add(true);
                break;
            
            case 2:
                fimdeLinhas();
                System.out.println("Opção 2");
                chamaOpcao2();
                break;
            
            case 3:
                fimdeLinhas();
                System.out.println("Opção 3");
                chamaOpcao3();
                break;
            
            case 4:
                fimdeLinhas();
                System.out.println("Opção 4");
                chamaOpcao4();
                break;
            
            case 5:
                fimdeLinhas();
                System.out.println("Opção 5");
                chamaOpcao5();
                break;
            
            case 6:
                fimdeLinhas();
                System.out.println("Opção 6");
                chamaOpcao6();
                break;
            
            case 7:
                fimdeLinhas();
                System.out.println("Opção 7");
                chamaOpcao7();
                break;
            
            case 8:
                fimdeLinhas();
                System.out.println("Opção 8");
                chamaOpcao8();
                break;
            
            default:
                fimdeLinhas();
                System.out.println("Opção inválida, tente novamente!!!");
        }
    }

    //metodo para abrir o caixa
    public void chamaOpcao1() {
        if ((!opcaoCaixa) && (opcaoAtendimento == false)) {
            opcaoCaixa = true;
            mMsg.caixaAbertoAtendimentoFechado();
            System.out.println("Senha");
            abrirCaixa();
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
            System.out.println("Senha");
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
            System.out.println("Senha");
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
            System.out.println("Senha");
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
            System.out.println("Operações encerradas.");
            opcaoSair = true;
            //System.exit(0);   
        } else {
            System.out.println("Encerre as operações do dia.");
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
