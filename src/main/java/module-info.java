module com.example.f21comp1011gcw4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.f21comp1011gcw4 to javafx.fxml;
    exports com.example.f21comp1011gcw4;
}