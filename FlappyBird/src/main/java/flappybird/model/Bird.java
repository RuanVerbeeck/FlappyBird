/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flappybird.model;

/**
 *
 * @author Gebruiker
 */
public class Bird {
    
    private int x;
    private int y;
    private int moveY = -2;
    private int dy;
    
    public Bird(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
    
    public int getMoveY() {
        return moveY;
    }
    
    public void setMoveY() {
        this.moveY = moveY;
    }
    
    public void omhoogBird(){
        y = y + (this.moveY);
    }
    
    public void valBird(){
        dy = 1;
    }
    
    public void tick(){
        y = y + dy;
    }
    
    public void reset() {
        
    }
    
    public boolean raaktBuisBoven(int x,int y, BuisBoven buisboven){
        if (x == buisboven.getX() && y == buisboven.getY()){
            return true;
        }
        return false;
    }
    
    public boolean raaktBuisOnder(int x,int y, BuisOnder buisonder){
        if (x == buisonder.getX() && y == buisonder.getY()){
            return true;
        }
        return false;
        
    }
}

