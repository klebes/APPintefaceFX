/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package contador;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author KDS
 */
public class JavaFXApplication1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   Button butaoA = new  Button("A");
   Button butaoB = new Button("B");
   Button butaoc = new Button("B");
   
   butaoA.setOnAction(e ->System.exit(0));
   butaoB.setOnAction(e ->System.out.print("B"));
        HBox  box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.setSpacing(10);
        box.getChildren().add(butaoA);
        box.getChildren().add(butaoB);
        box.getChildren().add(butaoc);
        Scene cena = new Scene(box,100,100);
        primaryStage.setScene(cena);
        primaryStage.show();
        
//        box.getChildren();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
