package com.example.f21comp1011gcw4;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class NumberAnalyisController implements Initializable {

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private Label areaCodeLabel;

    @FXML
    private Label cityCodeLabel;

    @FXML
    private Label msgLabel;

    private void assessPhoneNumber()
    {
        String phoneNumber = phoneNumberTextField.getText();
        if (phoneNumber.matches("[2-9]\\d{2}[2-9]\\d{2}\\d{4}"))
            msgLabel.setText("valid phone number");
        else
            msgLabel.setText("invalid phone number");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        phoneNumberTextField.textProperty().addListener((observableValue, oldValue, newValue) -> {
            assessPhoneNumber();
        });
    }
}
