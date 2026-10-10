import java.util.Scanner;

public class projeto1 {
public static void main(String[] args) {

Scanner vl = new Scanner(System.in); // vl = valor lido

double saldoInicial = 1000;
double deposito;
double saque = 0;




for (int i = 0; i < 5; i++) {

System.out.println("Digite um número de 1 a 4");
System.out.println("1 - Consultar Saldo");
System.out.println("2 - Realizar Depósito");
System.out.println("3 - Realizar Saque");
System.out.println("4 - Encerrar atendimento");
int operacao = vl.nextInt();


if ( operacao == 1 ) { // operacao 1

System.out.println("Saldo: " + saldoInicial );

}


else if (operacao == 2 && saldoInicial > 0 ) { // operacao 2

System.out.println("Digite o valor do depósito: ");
deposito = vl.nextDouble();
saldoInicial = saldoInicial + deposito;
System.out.println("Saldo Atualizado: " + saldoInicial );


 }
 if (operacao == 3 && saque <= saldoInicial) {
        System.out.println("Digite o valor do saque: ");
        saque = vl.nextDouble();

      if (saque > saldoInicial) {
        System.out.println("Saldo insuficiente.");
     } else {
        saldoInicial = saldoInicial - saque;
        System.out.println("Saque realizado com sucesso!!");
        System.out.println("Seu saldo atualizado é: " + saldoInicial);
    }
}

if (operacao == 4) {  // operacao 4
System.out.println("Atendimento encerrado.");
break;
}


    }
    vl.close();
}
}