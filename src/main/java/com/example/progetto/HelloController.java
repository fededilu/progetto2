package com.example.progetto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;

public class HelloController {

    private String email = "";
    private String password = "";


    @FXML
    private Label testoInvio;

    @FXML
    private TextField boxEmail;

    @FXML
    private PasswordField boxPassword;
    @FXML
    private Button canella;

    @FXML
    private Button invia;

    @FXML
    void cancella(ActionEvent event) {
        boxPassword.setText("");
        boxEmail.setText("");
    }

    @FXML
    void invia(ActionEvent event) {
        email = boxEmail.getText();
        password = boxPassword.getText();
        testoInvio.setText(email + "" + password);
    }
}