package com.jjos.prototype;

public interface IPrototype<T extends Cloneable> extends Cloneable {

    /**
     * Metodo para implementar la clonación simple o shallow copy
     * donde los campos de tipos primitivos se copian tal cual y
     * los campos de referencia apuntan a los mismos objetos originales.
     * @return
     */
    T shallowCopy();

    /**
     * Metodo para implementar la clonación profunda
     * donde se crean nuevas instancias para todos los campos de referencia,
     * asegurando que el objeto clonado no comparta referencias con el original.
     * @return
     */
    T deepClone();
}
