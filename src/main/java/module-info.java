module com.example.tableviewclaseinterfaces {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tableviewclaseinterfaces to javafx.fxml;
    exports com.example.tableviewclaseinterfaces;
}