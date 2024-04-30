/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuentabancaria;
//Yulieth natalia Quiroga Alape

public class CuentaBancaria {
     private double saldo;
      private String numeroCuenta;
      public CuentaBancaria(String numeroCuenta, double saldoInicial) {
          this.numeroCuenta = numeroCuenta;
          this.saldo = saldoInicial;
      }
      //GETTER NURCUENTA
      public String getNumeroCuenta() {
          return numeroCuenta;         
      }
      //SET 
      public void setNumeroCuenta(String nuevoNumeroCuenta) {
          this.numeroCuenta = nuevoNumeroCuenta;
      }
      //GETTER SALDO
      public double getSaldo() {
           return saldo;
      }
      // METODO DEPOSITO
      public void depositar(double monto) {
         if (monto > 0) { 
          saldo += monto;   
         }
         else { System.out.println("El monto de depósito debe ser positivo.");
         }
      }
    // METODO RETIRAR
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("El monto de retiro debe ser positivo y no debe exceder el saldo.");
       }
   }
}