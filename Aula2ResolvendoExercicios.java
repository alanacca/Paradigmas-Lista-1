/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula2.resolvendo.exercicios;
import java.util.Scanner;

/**
 *
 * @author alana.cca
 */
public class Aula2ResolvendoExercicios {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner ent = new Scanner(System.in);
         
         // PRIMEIRA QUESTÃO
       /* Os motoristas se preocupam com a quilometragem dos seus automóveis. Um motorista monitorou vários tanques cheios de gasolina 
       registrando a quilometragem dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio. Desenvolva um 
       programa Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos como inteiros) para 
       cada tanque cheio. O programa deve calcular e exibir o consumo em quilômetros/litro para cada tanque cheio e imprimir a 
       quilometragem combinada e a soma total de litros de combustível consumidos até esse ponto. Todos os cálculos de média devem 
       produzir resultados de ponto flutuante. Utilize um laço para obter os dados do usuário.*/ 
         int LTotal=0;
         char resp;
         while(true){
             System.out.println("Digite os quilometros e litros do carro");
             int km = ent.nextInt();
             int litro = ent.nextInt();
             //int consumo = ((km/litro);
             System.out.println("Consumo: "+((double)km/litro));
             LTotal += litro;
             System.out.println("Deseja Continuar?(S/N)");
             resp = ent.next().charAt(0);
             if(resp == 'N'){
                 break;
             }
         }
         System.out.println("Total de litros consumido:"+LTotal);*/
          
         
        // SEGUNDA QUESTÃO
        /*Uma grande empresa paga seu pessoal de vendas com base em comissões. 
          Eles recebem $ 200 por semana mais 9% de suas vendas brutas durante essa semana. 
          Por exemplo, um vendedor que realiza um total de vendas de mercadorias de $ 5.000 
          em uma semana recebe $ 200 mais 9% de $ 5.000 ou um total de $ 650. Desenvolva um aplicativo que receba a entrada de
          itens vendidos por um vendedor durante a última semana e calcule e exiba os rendimentos do vendedor. 
          Não há limite quanto ao número de itens que podem ser vendidos por um mesmo vendedor.*/ 
         int TotalValor = 0;
         char resp;
         while(true){
             System.out.println("Digite o nome do produto ");
             int nomeProd = ent.next().charAt(0);
             System.out.println("Digite o preço do produto ");
             int valProd = ent.nextInt();
             TotalValor += valProd;
             System.out.println("Deseja continuar?(S/N)");
             resp = ent.next().charAt(0);
             if(resp == 'N'){
                 break;
            }
        }
         int salario;
         int valorBruto = (TotalValor*9)/100;
         salario = 200 + valorBruto;
         System.out.println("Salario do funcionario: "+salario);
         
         
        // TODO code application logic here
    }
}
    
