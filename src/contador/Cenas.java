/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contador;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author KDS
 */
public class Cenas extends Application {

    private Stage janela;
    private Scene passo1;
    private Scene passo2;
    private Scene passo3;

    @Override
    public void start(Stage primaryStage) throws Exception {
        janela = primaryStage;
        criarMetodoUm();
        criarMetodoDois();
        criarMetodoTres();
        
        janela.setScene(passo1);
        janela.setTitle("Wizzard");
        janela.show();

    }

    public void criarMetodoUm() {
        Button proximopassao = new Button("Ir para passo 2");
        proximopassao.setOnAction(e -> {
            janela.setScene(passo2);
        });

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(proximopassao);
        passo1 = new Scene(box, 400, 400);

    }

    public void criarMetodoDois() {
        Button anteriorpassao = new Button("Voltar para passo 1");  
        anteriorpassao.setOnAction(e ->{
        janela.setScene(passo1);
        });
        Button proximopassao = new Button("Ir para passo 3");
        proximopassao.setOnAction(e ->{
        janela.setScene(passo3);
        });
      
        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(anteriorpassao);
        box.getChildren().add(proximopassao);
        passo2 = new Scene(box, 400, 400);

    }
     public void criarMetodoTres() {
        Button anteriorpassao = new Button("Voltar para passo 2");   
        anteriorpassao.setOnAction(e -> {
        janela.setScene(passo2);
        });
        Button finalizar = new Button("Finalizar");
        finalizar.setOnAction(e ->{
        System.exit(0);
        });
      
        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(anteriorpassao);
        box.getChildren().add(finalizar);
        passo3 = new Scene(box, 400, 400);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
