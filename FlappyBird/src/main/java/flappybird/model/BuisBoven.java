/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flappybird.model;

/**
 *
 * @author Gebruiker
 */
public class BuisBoven {
    private int x;
    private int y;
    private int dx;
    private final int breedte = 50;
    private int hoogte;
    
    public BuisBoven(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getBreedte() {
        return breedte;
    }

    public int getHoogte() {
        return hoogte;
    }
    
    private void setHoogte(int hoogte) {
        this.hoogte = 200;
    }
    
    public void naarLinks(){
        dx = -1;
    
    }
    
    public void tick() {
        x = x + dx;
    }
}

