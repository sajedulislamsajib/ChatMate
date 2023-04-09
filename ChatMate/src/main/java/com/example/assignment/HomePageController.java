package com.example.assignment;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomePageController {

    @FXML
    private Label name;


    public void displayName(String userName){
        name.setText("Hello, "+userName+". Welcome to Home page!");
    }
}
