/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flappybird.model;

/**
 *
 * @author Gebruiker
 */
public class Map {
    private final Bird bird;
    private final BuisBoven buisboven;
    private final BuisOnder buisonder;
    private int aantalKeerGejumped = 0;
    private boolean stopgame = false;


    public Map(){
        bird = new Bird(200, 200);
        buisboven = new BuisBoven(500, 0);
        buisonder = new BuisOnder(500, 500);
    }
                 
    public int berekenScore(int aantalKeerGejumped) {
        int score = 0;
        score = score + aantalKeerGejumped;
        return score;
    }
    
    public int getAantalKeerGejumped() {
        return aantalKeerGejumped;
    }
    
    public void setAantalKeerGejumped(int aantalKeerGejumped) {
        this.aantalKeerGejumped = aantalKeerGejumped;
    }

    public Bird getBird() {
        return bird;
    }

    public BuisBoven getBuisBoven() {
        return buisboven;
    }

    public BuisOnder getBuisOnder() {
        return buisonder;
    }

    public void omhoogBird(Bird bird) {
         bird.omhoogBird();
    }    

    public boolean isStopgame() {
        return stopgame;
    }

    public void setStopgame(boolean stopgame) {
        this.stopgame = stopgame;
    }
    
}



