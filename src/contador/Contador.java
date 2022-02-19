/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contador;

import java.io.File;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author KDS
 */
public class Contador extends Application {

    private int contador = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label labelTitulo = new Label("Contador");
        labelTitulo.getStyleClass().add("titulo");
        Label labelNumero = new Label("0");
        labelNumero.getStyleClass().add("numero"); 
        Button botaoIncremento = new Button("+");
        botaoIncremento.getStyleClass().add("botoes");
        botaoIncremento.setOnAction(e -> {
            contador++;
            labelNumero.setText(Integer.toString(contador));

        });
        Button botaoDecremento = new Button("-");
        botaoDecremento.getStyleClass().add("botoes");
        botaoDecremento.setOnAction(e -> {
            contador--;
            labelNumero.setText(Integer.toString(contador));
        });

        HBox boxbotoes = new HBox();
        boxbotoes.setAlignment(Pos.CENTER);
        boxbotoes.setSpacing(5);
        boxbotoes.getChildren().add(botaoIncremento);
        boxbotoes.getChildren().add(botaoDecremento);

        VBox caixaPrincipal = new VBox();
        caixaPrincipal.getStyleClass().add("conteudo");
        caixaPrincipal.setAlignment(Pos.CENTER);
        caixaPrincipal.getChildren().add(labelTitulo);
        caixaPrincipal.getChildren().add(labelNumero);
        caixaPrincipal.getChildren().add(boxbotoes);
        Scene cena = new Scene(caixaPrincipal, 400, 400);
        
         cena.getStylesheets().add((new File("src/contador/contador.css")).toURI().toString()); 
        

        primaryStage.setScene(cena);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
