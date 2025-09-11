module org.example.uiu_calculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens org.example.uiu_calculator to javafx.fxml;
    exports org.example.uiu_calculator;
}