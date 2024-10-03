package com.example.tableviewclaseinterfaces;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {

    @FXML
    private Label welcomeText;
    @FXML
    private TableColumn<Person, String> Nombre;
    @FXML
    private TableColumn<Person, String> Apellido;
    @FXML
    private TableColumn<Person, Integer> Edad;
    @FXML
    private TableView<Person> Table;

    private ObservableList<Person> people;

    @FXML
    public void initialize() {
        // Inicializamos la lista de personas
        people = FXCollections.observableArrayList(
                new Person("Juan", "Pérez", 25),
                new Person("Ana", "García", 30),
                new Person("Pedro", "Martínez", 22)
        );

        // Configuramos las columnas del TableView
        Nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        Apellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        Edad.setCellValueFactory(new PropertyValueFactory<>("edad"));

        // Añadimos los datos a la tabla
        Table.setItems(people);
        Table.setOnKeyTyped(event -> handleKeyTyped(event));

    }

    @FXML
    public void handleMouseClicked(MouseEvent event) {
        Person selectedPerson = Table.getSelectionModel().getSelectedItem();
        if (selectedPerson != null) {
            welcomeText.setText("Seleccionado: " + selectedPerson.getNombre() + " " + selectedPerson.getApellido());
            System.out.println("Evento de clic del mouse activado: " + selectedPerson.getNombre());
        } else {
            System.out.println("Evento de clic del mouse activado, pero no se seleccionó nada.");
        }
    }

    @Deprecated
    public void handleKeyTyped(KeyEvent event) {
        welcomeText.setText("Tecla presionada: " + event.getCharacter());
        System.out.println("Evento de tecla activado: " + event.getCharacter());
    }
}