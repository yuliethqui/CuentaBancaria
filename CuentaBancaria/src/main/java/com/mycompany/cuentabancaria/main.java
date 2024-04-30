/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentabancaria;

/**
 *
 * @author EIT
 */
public class main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("12345678910", 2000);

        System.out.println("Saldo inicial: " + cuenta.getSaldo());
        cuenta.depositar(500);
        System.out.println("Saldo después del depósito: " + cuenta.getSaldo());
        cuenta.retirar(200);
        System.out.println("Saldo después del retiro: " + cuenta.getSaldo());
    }
}
    
