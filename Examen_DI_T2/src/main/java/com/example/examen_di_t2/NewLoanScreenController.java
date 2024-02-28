package com.example.examen_di_t2;

import Clases.Biblioteca;
import Clases.Prestamo;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewLoanScreenController {

    @FXML
    private TextField bookIdField;

    @FXML
    private TextField borrowerField;

    private Biblioteca biblioteca = new Biblioteca();

    @FXML
    public void addLoan() {
        String bookId = bookIdField.getText();
        String borrower = borrowerField.getText();

        biblioteca.prestar(bookId, borrower);

        // After adding the loan, close the window
        Stage stage = (Stage) bookIdField.getScene().getWindow();
        stage.close();
    }
}