/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flappybird.view;

import flappybird.model.BuisBoven;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Gebruiker
 */
public class BuisBovenView extends Region{
    private final BuisBoven model;
    
public BuisBovenView(BuisBoven model){
    this.model = model;
    Rectangle buis = new Rectangle(20, 100);
    buis.setFill(Color.GREEN);
    getChildren().addAll(buis);
    
}
}


