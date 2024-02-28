module com.example.examen_di_t2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;


    opens com.example.examen_di_t2 to javafx.fxml;
    exports com.example.examen_di_t2;
}