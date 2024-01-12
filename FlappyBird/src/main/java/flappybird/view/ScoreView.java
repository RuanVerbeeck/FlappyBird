/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flappybird.view;

import flappybird.model.Map;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;

/**
 *
 * @author Gebruiker
 */
public class ScoreView extends Region 
{
    public ScoreView(Map map) {
        Label score = new Label();
        score.setText("Score = " + map.berekenScore(map.getAantalKeerGejumped()));
        score.setTextFill(Color.WHITE);
        getChildren().add(score);
    }
}
