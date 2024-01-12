/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flappybird.view;

import flappybird.model.BuisOnder;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Gebruiker
 */
public class BuisOnderView extends Region{
    private final BuisOnder model;
    
public BuisOnderView(BuisOnder model){
    this.model = model;
    Rectangle buis = new Rectangle(20, 100);
    buis.setFill(Color.GREEN);
    getChildren().addAll(buis);
    
}
}


