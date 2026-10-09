package com.sparkivisuals;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import java.io.IOException;


public class Controlador {
    
    @FXML 
    private Text meuText;
    @FXML 
    private TextArea areateste;
    //@FXML 
    //private Circle sparki;

    //double teste = sparki.getLayoutY();

    
    @FXML 
    private void Play(ActionEvent event) throws IOException{
        String texto = areateste.getText();
        System.out.println(texto);
        meuText.setText(texto);
    }

    @FXML 
    private void Stop(ActionEvent event) throws IOException{
        meuText.setText("opa!");

    }

}
