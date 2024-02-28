package com.example.examen_di_t2;

import Clases.Libro;
import Clases.Tematica;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Date;

public class AddBookScreenController {

    @FXML
    private TextField idLibroField;
    @FXML
    private TextField titleField;
    @FXML
    private TextField isbnField;
    @FXML
    private TextField authorField;
    @FXML
    private TextField tematicaField;
    @FXML
    private TextField fechaEdicionField;

    @FXML
    public void addBook() {
        String idLibro = idLibroField.getText();
        String title = titleField.getText();
        String isbn = isbnField.getText();
        String author = authorField.getText();
        Tematica tematica = Tematica.valueOf(tematicaField.getText().toUpperCase());
        Date fechaEdicion = new Date(fechaEdicionField.getText()); // You might need to parse the date from the text field

        Libro newBook = new Libro(idLibro, title, isbn, author, tematica, fechaEdicion);

        // Add the new book to the library
        // You'll need to implement this part based on how your library is set up

        // After adding the book, close the window
        Stage stage = (Stage) titleField.getScene().getWindow();
        stage.close();
    }
}