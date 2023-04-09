
package com.example.assignment;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.PasswordField;
        import javafx.scene.control.TextField;
        import javafx.stage.Stage;

        import java.io.IOException;

public class LogInController {

    @FXML
    private Button logInButton;

    @FXML
    private PasswordField password;

    @FXML
    private TextField userName;

    @FXML
    public void onLogInButtonClick(ActionEvent event) throws IOException {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            HomePageController secController= fxmlLoader.getController();
            secController.displayName(userName.getText());
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        }
        catch (Exception e){
            System.out.println("Can't load Home page");
        }
    }

}
