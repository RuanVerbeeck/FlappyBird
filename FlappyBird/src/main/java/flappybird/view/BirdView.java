/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flappybird.view;

import flappybird.model.Bird;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author Gebruiker
 */
public class BirdView extends Region {
    private final Bird model;
    
public BirdView(Bird model){
    this.model = model;
    Circle bird = new Circle(8);
    bird.setFill(Color.YELLOW);
    getChildren().addAll(bird);
    
}
}

