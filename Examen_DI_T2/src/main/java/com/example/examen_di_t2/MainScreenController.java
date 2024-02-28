package com.example.examen_di_t2;

import Clases.Biblioteca;
import Clases.Libro;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainScreenController {

    @FXML
    private ListView<Libro> bookListView;

    private Biblioteca biblioteca = new Biblioteca();

    @FXML
    public void initialize() {
        bookListView.getItems().addAll(biblioteca.getLibros());
    }

    @FXML
    public void openAddBookScreen() throws Exception {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AñadirLibro.fxml"))));
        stage.show();
    }

    @FXML
    public void openNewLoanScreen() throws Exception {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("NuevoPrestamo.fxml"))));
        stage.show();
    }
}