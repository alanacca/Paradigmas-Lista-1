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
         
         /* PRIMEIRA QUESTÃO
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
         
         
        ///* SEGUNDA QUESTÃO
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
         //*/
         
        // TODO code application logic here
    }
}
    
