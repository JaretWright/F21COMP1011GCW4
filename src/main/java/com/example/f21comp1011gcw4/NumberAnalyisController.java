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
        getAreaCode(phoneNumber.replaceAll("[^0-9]+",""));
        if (phoneNumber.matches("[(]?[2-9]\\d{2}\\)?[-.\\s]?[2-9]\\d{2}[-.\\s]?\\d{4}"))
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

    private void getAreaCode(String phoneNumber)
    {
        //simple solution if the area code is just the first 3 digits
        if (phoneNumber.length()>=3 && phoneNumber.substring(0,3).matches("[2-9]\\d{2}"))
            areaCodeLabel.setText("Area code: "+ phoneNumber.substring(0,3));
        if (phoneNumber.length()>=6 && phoneNumber.substring(3,6).matches("[2-9]\\d{2}"))
            cityCodeLabel.setText("City code: " + phoneNumber.substring(3,6));

    }
}
