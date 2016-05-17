
package fila;

public class Mensagem {
    
    public void caixaFechadoAtendimentoFechado(){
        System.out.println("Caixa fechado.");
        System.out.println("Atendimento fechado.");
    }

//        public void caixaFechadoAtendimentoAberto(){
//        System.out.println("Caixa fechado.");
//        System.out.println("Atendimento fechado.");
//    }
      
    public void caixaAbertoAtendimentoFechado(){
        System.out.println("Caixa aberto.");
        System.out.println("Atendimento fechado.");
    }
    
    public void caixaEAtendimentoAbertos(){
        System.out.println("Caixa aberto.");
        System.out.println("Atendimento aberto.");
    };
    
    public void senhaEspereCaixaAbrir(){
        System.out.println("A senha não pode ser emitida! Espere o caixa abrir primeiro.");
    }

    public void senhaEspereAtendimentoAbrir(){
        System.out.println("A senha não pode ser emitida! Espere o atendimento abrir primeiro.");
    }
    
    public void tenteOutraOpcao(){
        System.out.println(" Tente outra opção!!!");
    }
}
