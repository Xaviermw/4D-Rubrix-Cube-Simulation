/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4dcube2x2x2;


class Hemicube 
{
    char[] values;
    String[] face;
    
    public Hemicube()
    {
        /*
        Values 0-3 correspond to the center 
        4-5, 6-7, 8-9, 10-11 are the outside pairs
        */
        values = new char[12];
        face = new String[2];
    }
    
    public String[] getFace()
    {
       return face;
    }
    
    public void setMono(char c)
    {
        
        for (int i = 0; i < 12; i++)
        {
            values[i] = c;
        }
        setFace();
    }
    
    private void setFace()
    {
        String s;
        face[0] = new StringBuilder().append(values[0]).append(values[1]).toString();
        face[1] = new StringBuilder().append(values[2]).append(values[3]).toString();
    }

   
    
    
}
