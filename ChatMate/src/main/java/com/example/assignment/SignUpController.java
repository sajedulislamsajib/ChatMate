package com.example.assignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class SignUpController {

    @FXML
    private Button SignUpButton;

    @FXML
    private AnchorPane anchorpane;

    @FXML
    private TextField emailAddressBar;

    @FXML
    private TextField fullName;

    @FXML
    private ImageView loginprogileimage;

    @FXML
    private Pane pane;

    @FXML
    private PasswordField password;

    @FXML
    private TextField userName;
//onSignUpButtonClick ei button e click korle signin page a niye jabe
    @FXML
    void onSignUpButtonClick(ActionEvent event) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LogInPage.fxml"));
            Parent root = (Parent) fxmlLoader.load();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        }
        catch (Exception e){
            System.out.println("Can't load Home page");
        }

    }

}
