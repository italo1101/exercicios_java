import java.util.Scanner;
public class ex036 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double horaAtividade, pontoTotal, dinheiro;
        
        System.out.println("Digite quantas horas de atividade você fez no mês: ");
        horaAtividade = input.nextDouble();

        
        if(horaAtividade <= 10){
            pontoTotal = horaAtividade * 2;
            dinheiro = pontoTotal * 0.5;
            System.out.println("Você teve " + horaAtividade + " horas, gerando " + pontoTotal + " pontos totais " + " você receberá em dinheiro o total de R$" + dinheiro );
    
        }else if(horaAtividade >= 10 && horaAtividade <= 20){
            pontoTotal = horaAtividade * 5;
            dinheiro = pontoTotal * 0.5;
            System.out.println("Você teve " + horaAtividade + " horas, gerando " + pontoTotal + " pontos totais " + " você receberá em dinheiro o total de R$" + dinheiro );
        
        }else{
            pontoTotal = horaAtividade * 10;
            dinheiro = pontoTotal * 0.5;
            System.out.println("Você teve " + horaAtividade + " horas, gerando " + pontoTotal + " pontos totais " + " você receberá em dinheiro o total de R$" + dinheiro );
        }



        input.close();

        
    }
}
