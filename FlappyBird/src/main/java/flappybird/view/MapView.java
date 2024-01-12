/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flappybird.view;

import flappybird.model.Map;
import javafx.scene.layout.Region;

/**
 *
 * @author Gebruiker
 */
public class MapView extends Region{
    private final Map model;
    
    public MapView(Map model) {
        this.model = model;
        update();
    }
    
    public void update() {
        this.tekenBuisBoven();
        this.tekenBuisOnder();
        model.omhoogBird(model.getBird());
        this.tekenBird();
        this.tekenScore();
    }
    
    public void tekenBird() {
        BirdView birdView = new BirdView(model.getBird());
        
        birdView.setTranslateY(model.getBird().getY());
        getChildren().add(birdView);
    }
    
    public void tekenBuisBoven() {
        BuisBovenView buisBovenView = new BuisBovenView(model.getBuisBoven());
        
        buisBovenView.setTranslateX(model.getBuisBoven().getY());
        getChildren().add(buisBovenView);
    }
    
    public void tekenBuisOnder(){
        BuisOnderView buisOnderView = new BuisOnderView(model.getBuisOnder());
        
        buisOnderView.setTranslateX(model.getBuisOnder().getY());
        getChildren().add(buisOnderView);
    }
    
    public void tekenScore() {
        ScoreView scoreView = new ScoreView(model);
        scoreView.setTranslateX(600);
        scoreView.setTranslateY(450);
        getChildren().add(scoreView);
    }
        
}

