/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;

import java.util.Scanner;

/**
 *
 * @author patyx
 */
public class ContaTerminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Numero;
        String Agencia;
        String Nome_cliente;
        double Saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor , digite o número da Conta:");
        Numero = sc.nextInt();
        System.out.println("Por favor , digite o número da Agência:");
        Agencia = sc.next();
        System.out.println("Por favor , digite o seu Nome:");
        Nome_cliente = sc.nextLine();
        
        sc.nextLine();
        
        System.out.println("Por favor , digite o Saldo da Conta:");
        Saldo = sc.nextDouble();
        
        System.out.println("Olá " + Nome_cliente + " obrigado por criar uma conta em nosso banco,"
                + " sua agência é " + Agencia + ", conta " + Numero + " \ne seu saldo " + Saldo + ", já está "
        + "disponível para saque" );
    }

}
