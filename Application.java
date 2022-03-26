package program;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String grupoL1 = "A E I O U L N R S T";
        String grupoL2 = "D G";
        String grupoL3 = "B C M P";
        String grupoL4 = "F H V W Y";
        String grupoL5 = "k";
        String grupoL6 = "J X";
        String grupoL7 = "Q Z";

        System.out.println("ANTES DE COMEÇARMOS VEJA PRIMEIRO A TABELA ");
        System.out.println("UM GRUPO DE LETRAS TERÁ UM VALOR ATRIBUIDO SERÁ FEITO UMA SOMA NO FINAL COM CADA LETRA DA PALAVRA   ");
        System.out.println(" 1 PONTO: " + grupoL1 + "\n 2 PONTOS: " +  grupoL2  + "\n 3 PONTOS: " + grupoL3
                             + "\n 4 PONTOS: " + grupoL4 + "\n 5 PONTOS: " + grupoL5
                             + "\n 8 PONTOS: " + grupoL6 + "\n 10 PONTOS: " + grupoL7 + " \n");

        System.out.println("EXEMPLO: DESAFIO \n D + E + S + A + F + I + O = 11\n");
        System.out.println(" 2 + 1 + 1 + 1 + 4 + 1 + = 11 \n");
        System.out.println("OBSERVAÇÃO: NÃO USE CARCTERE ESPICAL OU NUMERO");
        System.out.println("QUANDO ESTIVER PRONTO");
        System.out.println("ESCREVA UMA PALAVRA: ");
        String palavra = sc.next();
        palavra = palavra.toUpperCase(Locale.ROOT);


        System.out.println(palavra);

        int pontos = 0;

        for(int contador = 0; contador < palavra.length(); contador++){

            char letra = palavra.charAt(contador);
            String compara = String.valueOf(letra) ;

            System.out.println(palavra.charAt(contador));

            if(grupoL1.contains(compara)){
                pontos = pontos + 1;
                System.out.println("PONTUAÇÃO ATUAL: " + pontos + "\n ");
            }
            else if(grupoL2.contains(compara)){
                pontos = pontos + 2;
                System.out.println("PONTUAÇÃO ATUAL: " + pontos + "\n ");
            }
            else if(grupoL3.contains(compara)){
                pontos = pontos + 3;
                System.out.println("PONTUAÇÃO ATUAL: " + pontos + "\n ");
            }
            else if(grupoL4.contains(compara)){
                pontos = pontos + 4;
                System.out.println("PONTUAÇÃO ATUAL: " + pontos + "\n ");
            }
            else if(grupoL5.contains(compara)){
                pontos = pontos + 5;
                System.out.println("PONTUAÇÃO ATUAL: " + pontos + "\n ");
            }
            else if(grupoL6.equals(palavra.charAt(contador))){
                pontos = pontos + 8;
                System.out.println("PONTUAÇÃO ATUAL: " + pontos + "\n ");
            }
            else if(grupoL7.equals(palavra.charAt(contador))){
                pontos = pontos + 10;
                System.out.println("PONTUAÇÃO ATUAL: " + pontos + "\n ");
            }
            else{
                System.out.println(palavra.charAt(contador) + " É UM CARACTERE INVALIDO");
                System.out.println("PONTUAÇÃO ATUAL: " + pontos + "\n ");
            }

            System.out.println("SUA PONTUAÇÃO FINAL FOI : " + pontos);

        }

        sc.close();

    }


}
