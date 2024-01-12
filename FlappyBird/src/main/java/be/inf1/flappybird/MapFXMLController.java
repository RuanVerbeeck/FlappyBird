/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package be.inf1.flappybird;

import flappybird.model.Bird;
import flappybird.model.Map;
import flappybird.view.MapView;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

public class MapFXMLController {

    @FXML
    private AnchorPane paneel;
    private Map model;
    private MapView view;
    private Bird bird;
    public Label labelscore;
    
    void initialize() {
        model = new Map();
        view = new MapView(model);
        
        paneel.getChildren().add(view);
        paneel.setOnKeyPressed(this :: omhoogKeyBoard);
        paneel.setFocusTraversable(true);
        
        
    }
    
    private void omhoogKeyBoard(KeyEvent e) {
        switch (e.getCode()) {
            case SPACE:
                bird.omhoogBird();
        }
    }

}
