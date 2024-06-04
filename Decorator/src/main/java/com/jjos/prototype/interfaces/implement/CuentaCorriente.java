package com.jjos.prototype.interfaces.implement;

import com.jjos.prototype.interfaces.ICuentaBancaria;
import com.jjos.prototype.models.Cuenta;

public class CuentaCorriente implements ICuentaBancaria {
    @Override
    public void abrirCuenta(Cuenta cuenta) {
        System.out.println("------------------------------------");
        System.out.println("Se abrió una cuenta corriente");
        System.out.println("Cliente " + cuenta.getCliente());
    }
}
