/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casoevaluado1;

/**
 *
 * @author gabri
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito de " + monto + " realizado correctamente.");
        } else {
            System.out.println("El monto del depósito debe ser mayor que cero.");
        }
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto del retiro debe ser mayor que cero.");
        } else if (monto > saldo) {
            System.out.println("Fondos insuficientes. Saldo actual: " + saldo);
        } else {
            saldo -= monto;
            System.out.println("Retiro de " + monto + " realizado correctamente.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void mostrarInformacion() {
        System.out.println("=== Información de Cuenta Bancaria ===");
        System.out.println("Número de cuenta : " + numeroCuenta);
        System.out.println("Titular          : " + titular);
        System.out.println("Saldo actual     : " + saldo);
    }
}
