package com.sparkivisuals;

import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Paint;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class Sparki {
    private double posX = 200;
    private double posY = 280;
    private double rot = 0;     //rotação do robô, importante para determinar para qual direção é a frente
    private int SIZEX = 50;
    private int SIZEY = 80 ;
    private Rectangle retangulo;

    private Timeline movimento;
    private Timeline movimentoR;

    public Sparki(double posX, double posY, int SIZEX, int SIZEY){
        this.SIZEX = SIZEX;
        this.SIZEY = SIZEY;
        this.posX = posX;
        this.posY = posY;
    }

    public void moveForward(int d){
        if (retangulo == null){
            throw new IllegalStateException("nao criou o retangulo dur");
        }
        if (d<=0){
            return;
        }
        if (movimento != null){
            movimento.stop();
        }
        movimento = new Timeline(new KeyFrame(Duration.millis(30), event -> {
            posY -= 1;
            retangulo.setY(posY);
        }));
        movimento.setCycleCount(d);
        movimento.play();
    }

    public void rotate(int r){
        if (retangulo == null){
            throw new IllegalStateException("nao tem retangulo");
        }
        if (r <= 0){
            return;
        }
        if (movimento != null){
            movimentoR.stop();
        } 
        movimentoR = new Timeline(new KeyFrame(Duration.millis(30), event -> {
            rot += 1;
            retangulo.setRotate(rot);
        }));
        movimentoR.setCycleCount(r);
        movimentoR.play();
    }

    public Rectangle create(){
        retangulo = new Rectangle();
        retangulo.setX(posX);
        retangulo.setY(posY);
        retangulo.setWidth(SIZEX);
        retangulo.setHeight(SIZEY);
        retangulo.setArcWidth(5);
        retangulo.setArcHeight(5);
        retangulo.setFill(Paint.valueOf("green"));
        return retangulo;
    }


}
