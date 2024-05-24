

# Guía de Patrones de Diseño para Backend


En este repositorio se implementan varios patrones de diseño comunes en el desarrollo de backend. Los patrones de diseño se clasifican en tres categorías principales: creacionales, estructurales y de comportamiento. A continuación, se describen brevemente los patrones Singleton, Prototype, Builder, Abstract Factory y Factory Method, todos ellos pertenecientes a la categoría creacional.

## Clasificación de Patrones de Diseño

### 1. Patrones Creacionales
Los patrones creacionales se centran en el proceso de creación de objetos. Ayudan a hacer el sistema independiente de cómo se crean, componen y representan los objetos.

### 2. Patrones Estructurales
Los patrones estructurales se ocupan de la composición de clases u objetos. Ayudan a garantizar que si un objeto cambia, la estructura general del sistema no se vea afectada.

### 3. Patrones de Comportamiento
Los patrones de comportamiento se centran en la interacción y responsabilidad entre los objetos. Ayudan a definir cómo los objetos interactúan y cómo se reparten la responsabilidad.

## Patrones Creacionales

### 1. Singleton

#### Descripción
El patrón Singleton asegura que una clase solo tenga una instancia y proporciona un punto de acceso global a ella.

#### Uso
- Controlar el acceso a un recurso compartido (como una conexión a una base de datos).
- Mantener el estado global de una aplicación.

#### Ejemplo
```java
public class Singleton {
    private static Singleton instancia;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
}
```

### 2. Prototype

### Descripción
El patrón Prototype permite crear nuevos objetos copiando un objeto existente, conocido como prototipo.

#### Uso
- Cuando la creación directa de un objeto es costosa (por ejemplo, cuando requiere una configuración compleja).
- Para evitar la creación repetida de objetos similares.

#### Ejemplo
```java
public abstract class Prototipo implements Cloneable {
    public Prototipo clone() throws CloneNotSupportedException {
        return (Prototipo) super.clone();
    }
}

public class ConcretoPrototipo extends Prototipo {
    // Implementación específica
}
```


### 3. Builder

### Descripción
El patrón Builder separa la construcción de un objeto complejo de su representación, permitiendo crear diferentes tipos y representaciones del objeto.

### Uso
- Para construir objetos complejos paso a paso.
- Cuando el constructor de una clase tiene muchos parámetros.

#### Ejemplo
``` java
public class Producto {
    private final String parte1;
    private final String parte2;

    private Producto(Builder builder) {
        this.parte1 = builder.parte1;
        this.parte2 = builder.parte2;
    }

    public static class Builder {
        private String parte1;
        private String parte2;

        public Builder setParte1(String parte1) {
            this.parte1 = parte1;
            return this;
        }

        public Builder setParte2(String parte2) {
            this.parte2 = parte2;
            return this;
        }

        public Producto build() {
            return new Producto(this);
        }
    }
}
```


### 4. Abstract Factory

### Descripción
El patrón Abstract Factory proporciona una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas.

#### Uso
- Cuando una aplicación debe ser independiente de cómo se crean y ensamblan sus productos.
- Para proporcionar una interfaz para crear familias de productos relacionados.

#### Ejemplo
```java
public interface AbstractFactory {
    ProductoA crearProductoA();
    ProductoB crearProductoB();
}

public class ConcreteFactory1 implements AbstractFactory {
    public ProductoA crearProductoA() {
        return new ProductoA1();
    }

    public ProductoB crearProductoB() {
        return new ProductoB1();
    }
}

public class ConcreteFactory2 implements AbstractFactory {
    public ProductoA crearProductoA() {
        return new ProductoA2();
    }

    public ProductoB crearProductoB() {
        return new ProductoB2();
    }
}

```


### 5. Factory Method

### Descripción
El patrón Factory Method define una interfaz para crear un objeto, pero deja que las subclases decidan qué clase instanciar. Permite a una clase delegar la instanciación a subclases.

#### Uso
- Para permitir a las subclases decidir qué objetos crear.
- Para delegar la responsabilidad de creación a subclases específicas.
#### Ejemplo

```java
public abstract class Creator {
    public abstract Producto factoryMethod();

    public void someOperation() {
        Producto producto = factoryMethod();
        // Operaciones con el producto
    }
}

public class ConcreteCreator extends Creator {
    public Producto factoryMethod() {
        return new ConcreteProducto();
    }
}
```