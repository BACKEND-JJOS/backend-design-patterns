package com.jjos.prototype.decorators;

import com.jjos.prototype.interfaces.ICuentaBancaria;
import com.jjos.prototype.models.Cuenta;

public class BlindajeDecorado extends  CuentaDecorador {

    public BlindajeDecorado(ICuentaBancaria cuentaDecorada) {
        super(cuentaDecorada);
    }

    @Override
    public void abrirCuenta(Cuenta cuenta) {
        cuentaDecorada.abrirCuenta(cuenta);
        agregarBlindaje(cuenta);
    }

    private void agregarBlindaje(Cuenta cuenta) {
        System.out.println("Se agregó blindaje a la cuenta del cliente " + cuenta.getCliente());
    }
}
