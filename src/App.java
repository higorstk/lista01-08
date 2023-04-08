import java.util.Scanner;
class Main{
public static void main(String[] args){
//Passo1:Mostrar variaveis  
double valorhoras;
double numerohoras;
double salario;
  
//Passo2:Entrada de dados
  
Scanner teclado = new Scanner(System.in);
  System.out.println("Quanto ganha por hora");
valorhoras = teclado.nextDouble();
  System.out.println("Número de horas trabalhadas");
numerohoras = teclado.nextDouble();
  
//Passo3:Mostrar horas e valor
  
salario = (valorhoras * numerohoras)*30;
  
//Passo4:Mostrar resultado
  
System.out.println("Valor recebido no mês é:" + salario);

}
}