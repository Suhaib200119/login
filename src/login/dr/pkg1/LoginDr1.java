package login.dr.pkg1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginDr1 extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // creating titel
        primaryStage.setTitle("login page");

        // creating label
        Label title = new Label("LOGIN");

        //creating textfield ---> " username "
        TextField text_userName = new TextField();
        text_userName.setPromptText("Enter your UserName");

        //creating passwordfield ---> " passwordfield "
        PasswordField password_userName = new PasswordField();
        password_userName.setPromptText("Enter the password");

        //Creating a VBox includes a title && username && password
        VBox vbox_title_username_password = new VBox();

        //Adding nodes on Vbox
        vbox_title_username_password.getChildren().addAll(title, text_userName, password_userName);
        //Space 
        vbox_title_username_password.setSpacing(10);
        //Center
        vbox_title_username_password.setAlignment(Pos.CENTER);
        //creating padding
        vbox_title_username_password.setPadding(new Insets(10, 20, 10, 20));

        //creating Buttons
        Button submit = new Button("Submit");
        Button reset = new Button("Reset");

        //Adding nodes on Hbox
        HBox hbox_submit_reset = new HBox(10, submit, reset);
        //Center
        hbox_submit_reset.setAlignment(Pos.CENTER);

        //Create a VBox and add nodes to it
        VBox vbox2 = new VBox(vbox_title_username_password, hbox_submit_reset);
        //Space 
        vbox2.setSpacing(20);

        //Create FlowPane and add a Layout to it
        FlowPane fpRoot = new FlowPane(vbox2);
        //Center
        fpRoot.setAlignment(Pos.CENTER);
        //Create Scene and add FlowPane to it

        Scene scene = new Scene(fpRoot, 500, 300);
        //Put Scene on Stage

        primaryStage.setScene(scene);
        //Show Stage

        primaryStage.show();

    }

}
