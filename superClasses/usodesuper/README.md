# Super

## https://www.codewars.com/kata/547274e24481cfc469000416/solutions/java


La palabra clave `super` se utiliza en Java para referirse al supertipo (superclase o interfaz) de una clase. Se puede utilizar para acceder a los miembros del supertipo que no son accesibles de otra manera.

## Uso de `super` para acceder a métodos

Se puede utilizar `super` para llamar a un método del supertipo. Esto es útil cuando el subtipo tiene un método con el mismo nombre que un método del supertipo y desea llamar al método del supertipo.

### Ejemplo:

```Java
class Animal {
    public void speak() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        //super.speak(); // Llama al método speak() de la clase Animal
        System.out.println("I am a dog.");
    }
}
```

## Uso de `super` para acceder a variables

Se puede utilizar `super` para acceder a una variable del supertipo. Esto es útil cuando el subtipo tiene una variable con el mismo nombre que una variable del supertipo y desea acceder a la variable del supertipo.

### Ejemplo:

```Java
class Animal {
    public String name = "Animal";
}

class Dog extends Animal {
    public String name = "Dog";

    public void printName() {
        System.out.println("My name is " + super.name); // Accede a la variable name de la clase Animal
    }
}
```

## Uso de `super` para llamar a constructores

Se puede utilizar `super` para llamar a un constructor del supertipo. Esto es útil para inicializar el estado del supertipo antes de inicializar el estado del subtipo.

### Ejemplo:

```Java
class Animal {
    public Animal() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    public Dog() {
        super(); // Llama al constructor de la clase Animal
        System.out.println("I am a dog.");
    }
}
```
