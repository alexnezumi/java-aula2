package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
    double valor,valor2,valor3,soma;
        
    Scanner grava = new Scanner(System.in);
    
    System.out.println("insira um valor");
    
    valor = grava.nextDouble();
  System.out.println("insira mais um valor");
  
    valor2 = grava.nextDouble();
   System.out.println("insira mais um valor");
   
    valor3 = grava.nextDouble();
    soma = ((valor+valor2+valor3)*10)/2;
    
    System.out.println("seu resultado é "+ soma);
    
   //atividade 2
   
   //Scanner grava = new Scanner(System.in);
   //System.out.println("Insira um valor em reais");
   //double valor, x;
   //valor = grava.nextDouble();
   //x = ((valor * 0.06)+10)/4; 
    //System.out.println("seu resultado é:" + x );
    
    //atividade 3
    //Scanner grava = new Scanner(System.in);
    
   // System.out.println("insira seu nome");
   // String nome;
   // nome = grava.next();
   // System.out.println("insira sua idade");
   // int idade;
   // idade = grava.nextInt();
    //System.out.println("Seu nome é "+ nome+ " e você tem " + idade + " anos.");
    
    //atividade 4
    
   // Scanner grava = new Scanner(System.in);
    
    //double D, T, V, L;
   // System.out.println("adicione o tempo da sua viagem");
   //  T = grava.nextDouble();
   // System.out.println("adicione a velocidade da sua viagem ");
   // V = grava.nextDouble();
   // D = T * V; 
    //L = D / 12; 

    
    //System.out.println(" Você gastou " + L + " litros na sua viagem.");
    
  
    //Scanner grava = new Scanner(System.in);
    
      //double D, L;
      //System.out.println("Adicione a distância percorrida em sua viagem");
      //D = grava.nextDouble();
      //L = D /12;
    
    
    //System.out.println(" Você gastou " + L + " litros na sua viagem.");
    
    //Atividade 5 
    
    //Scanner grava = new Scanner(System.in);
    
   //System.out.println("digite seu nome");
  // String nome;
  // nome = grava.next(); 
  // System.out.println("digite o seu peso");
  // double peso, altura, IMC; 
  // peso = grava.nextDouble();
  // System.out.println("digite a sua altura");
   //altura = grava.nextDouble();
   //IMC = peso/(altura*altura);
    //System.out.println("seu resultado do IMC é:" + IMC);
    
    //atividade 6
    
   // Scanner grava = new Scanner(System.in);
    
   // String nome;
    
  //  double idade,dia, horas;
    
   // System.out.println("insira seu nome");
   // nome = grava.next();
    
   // System.out.println("insira sua idade");
   // idade= grava.nextDouble();
    
   // dia = idade * 365;
   // horas = (365 * 24)* idade;
    //System.out.println("você viveu " + dia + " dias e " + horas + " horas");
    }
    
}
