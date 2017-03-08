/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4dcube2x2x2;

/**
 *
 * @author 12576
 */
class Cube 
{
    Hemicube[] hcs;
    int state;
    String[][] faces;
    
    public Cube()
    {
        hcs = new Hemicube[6];
        for (int i = 0; i < 6; i++)
            hcs[i] = new Hemicube();
        
    }
    
    public String[][] displayCube()
    {
        
        for (int i = 0; i < 6; i++)
            faces[i] = hcs[i].getFace();
        
        return faces;
    }
    
    public void setMonochrome(char color)
    {
        for (int i = 0; i < 6; i++)
            hcs[i].setMono(color);
        
    }
    
    public String[] displayFace(int face)
    {
        return hcs[face].getFace();
    }
           
            
    
}
