package com.example.tableviewclaseinterfaces;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Person {
    private final SimpleStringProperty nombre;
    private final SimpleStringProperty apellido;
    private final SimpleIntegerProperty edad;

    public Person(String nombre, String apellido, int edad) {
        this.nombre = new SimpleStringProperty(nombre);
        this.apellido = new SimpleStringProperty(apellido);
        this.edad = new SimpleIntegerProperty(edad);
    }

    public String getNombre() {
        return nombre.get();
    }

    public SimpleStringProperty nombreProperty() {
        return nombre;
    }

    public String getApellido() {
        return apellido.get();
    }

    public SimpleStringProperty apellidoProperty() {
        return apellido;
    }

    public int getEdad() {
        return edad.get();
    }

    public SimpleIntegerProperty edadProperty() {
        return edad;
    }
}
