
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import java.lang.Object;

import javafx.scene.control.Label;

import javafx.scene.control.Button;

import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.awt.Checkbox;
import javafx.scene.control.TextField;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane rot=new GridPane();
        rot.setPadding(new Insets(20,20,20,20));
        rot.setHgap(6);
        rot.setVgap(6);
        TextField name =new TextField("dsadasdsa asdasdasda");
        StringBuilder
        TextField name1 =new TextField();
        Label s1 = new Label("1");
        Label s2 = new Label("2");
        Label s3 = new Label();
        Label s4 = new Label();
        Label s5 = new Label();
        Label s6 = new Label();
        Button b1= new Button();
        Button b2 = new Button();


        name1.setDisable(true);
        GridPane.setConstraints(name,1,3);
        rot.getChildren().add(name);

        name1.setDisable(true);
        GridPane.setConstraints(name1,1,4);
        rot.getChildren().add(name1);


        GridPane.setConstraints(s1,0,3);
        rot.getChildren().add(s1);

        GridPane.setConstraints(s2,0,4);
        rot.getChildren().add(s2);

        Scene scene = new Scene(rot ,250,100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
