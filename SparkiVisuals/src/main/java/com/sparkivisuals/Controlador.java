package com.sparkivisuals;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import java.io.IOException;
import javafx.scene.layout.Pane;

public class Controlador {
    
    @FXML 
    private Text meuText;
    @FXML 
    private TextArea areateste;
    @FXML
    private Pane CentroPane;
    
    Sparki sparki = new Sparki(200,280,50,80);

    @FXML
    private void initialize(){     //executada quando inicializa o controlador!!
        CentroPane.getChildren().add(sparki.create());
    }

    @FXML 
    private void Play(ActionEvent event) throws IOException{
        String texto = areateste.getText();
        meuText.setText(texto);
        if (areateste.getText().equals("sparki.moveForward(10)")){
            sparki.moveForward(10);
        }
        if (areateste.getText().equals("sparki.moveRight(90)")){
            sparki.rotate(90);
        }
    }

    @FXML 
    private void Stop(ActionEvent event) throws IOException{
        meuText.setText("opa!");
        
    }

    @FXML private void Walk(ActionEvent event) throws IOException{
        try {
            sparki.moveForward(10);
        } catch (IllegalStateException e) {
            meuText.setText(e.getMessage());
        }
    }

}
