package com.jjos.prototype;

import com.jjos.prototype.decorators.BlindajeDecorado;
import com.jjos.prototype.interfaces.ICuentaBancaria;
import com.jjos.prototype.interfaces.implement.CuentaAhorro;
import com.jjos.prototype.interfaces.implement.CuentaCorriente;
import com.jjos.prototype.models.Cuenta;

public class Main {
    public static void main(String[] args) {
        Cuenta cuentaNuevaAhorro = new Cuenta(1, "Juan Ortiz");
        ICuentaBancaria cuentaAhorro =  new CuentaAhorro();
        cuentaAhorro.abrirCuenta(cuentaNuevaAhorro);

        Cuenta cuentaNuevaCorriente = new Cuenta(2, "Maria Gil");
        ICuentaBancaria cuentaCorriente = new CuentaCorriente();
        cuentaCorriente.abrirCuenta(cuentaNuevaCorriente);

        //Si deseo agregar una nueva funcionalidad sin afecta mi modelo de cuenta puedo hacer uso del patron decorador
        //donde creo la clase abstracta de la cuenta a decorar para extender luego en la nueva funcionalidad

        Cuenta cuentaNuevaAhorrosBlindada = new Cuenta(3, "Jose Bermudez");
        ICuentaBancaria cuentaAhorroNueva = new CuentaAhorro();
        ICuentaBancaria cuentaAhorroBlindada = new BlindajeDecorado(cuentaAhorroNueva);

        cuentaAhorroBlindada.abrirCuenta(cuentaNuevaAhorrosBlindada);

    }
}