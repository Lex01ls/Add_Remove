module com.example.add_remove {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.add_remove to javafx.fxml;
    exports com.example.add_remove;
}