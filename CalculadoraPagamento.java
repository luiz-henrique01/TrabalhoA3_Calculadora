
import java.util.Scanner;

public class CalculadoraPagamento 
{
    public static void main(String[] args) 
    {
        //Declaração Variaveis
        String NomeProfessor;
        String Nome;
        Double ValorAReceber = 0.0;
        Double SalarioMensal;
        Double HorasTrabalhadas;
        Double ValorHora;
        Double ValorContrato;
        int opcao;


        //Apresentação
        
        Scanner input = new Scanner(System.in);
        System.out.println("*********************************************************");
        System.out.println("Seja bem vindo a calculadora salarial de Professores!!");
        System.out.println("*********************************************************");
        System.out.println("");


        //Entrada de dados
        
        System.out.print("Para iniciarmos informe seu nome: ");
        Nome = input.nextLine();
        System.out.println("");
        System.out.printf("Entendido %s, vamos prosseguir calculando o salário...\n\n\n", Nome);
        
        System.out.print("Informe o nome do Professor: ");
        NomeProfessor = input.nextLine();
        System.out.println("");
        
        System.out.printf("Ok %s, agora entre as opções abaixo informe o regime de pagamento desejado:\n", Nome);
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - CLT               |\n");
            System.out.print("| Opção 2 - Horista           |\n");
            System.out.print("| Opção 3 - PJ                |\n");
            System.out.print("| Opção 4 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("\nDigite uma opção: ");
        opcao = input.nextInt();
         

        //Condição

        if (opcao == 4){
            System.out.println("Obrigado, até logo!");
            System.exit(1);
            input.close();
        }

        switch(opcao){
          case 1:
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Opção 1 CLT  -  Informe o salário mensal do Professor R$: ");
          SalarioMensal = input.nextDouble();
          ValorAReceber = SalarioMensal;
          break;

          case 2:
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Opção 2 Horista  -  Informe o número de horas trabalhadas pelo Professor: ");
          HorasTrabalhadas = input.nextDouble();
          System.out.println("Informe o valor da hora de trabalho R$: ");
          ValorHora = input.nextDouble();
          ValorAReceber = HorasTrabalhadas * ValorHora;  
          break;   
          
          case 3:
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("Opção 3 PJ  -  Informe o valor do contrato do Professor R$: ");
          ValorContrato = input.nextDouble();
          ValorAReceber = ValorContrato;
          break;
          
          default:
          System.out.println("Opção Inválida!");
          System.exit(1);
          break;
          
        }
        
        //Resultado

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Calculando...\n");
        System.out.println("Nome do Professor: " + NomeProfessor);
        System.out.printf("Valor a receber: R$ %.2f ", ValorAReceber); 

        System.out.println("");
        System.out.println("\n*** Obrigado por usar nosso App, volte sempre! =D ***");
    } 
}
