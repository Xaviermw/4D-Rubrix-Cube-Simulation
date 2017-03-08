/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4dcube2x2x2;

import java.util.Random;

/**
 *
 * @author 12576
 */
class CubeEnvironment 
{
    
    Cube[] cubes;
    char[] colors;
    
    public CubeEnvironment()
    {
        colors = new char[8];
        cubes = new Cube[8];
        for (int i = 0; i < 8; i++)
            cubes[i] = new Cube();

    }
    
    public void cubeMove(int cube, int newTop)
    {
        
        if (newTop < 1 || newTop > 6)
        {
            System.out.println("Invalid Move");
            return;
        }
        else if (newTop == 1)
        {
            System.out.println("Cube Not Moved");
            return;
        }
        else if (cube < 1 || cube > 8)
        {
            System.out.println("Invalid Cube Selection");
            return;
        }
    }
    
    public void setColors()
    {
        colors[0] = '@';
        colors[1] = 'M';
        colors[2] = '=';
        colors[3] = '#';
        colors[4] = '?';
        colors[5] = 'B';
        colors[6] = '%';
        colors[7] = 'X';
    }
    
    public void setOriginalEnviroment()
    {
        for (int i = 0; i < 8; i++)
            cubes[i].setMonochrome(colors[i]);
    }
    
    public void printCubes()
    {
        
        String[] faceHolder;
        String[] tempValues;
        
        for (int i = 0; i < 8; i++)
        {
            faceHolder = new String[4];
            faceHolder[1] = "";
            faceHolder[2] = "";
            faceHolder[3] = "";
            
            System.out.println("Cube Number " + (i+1));
            System.out.println();
            faceHolder[0] = ("Top     'Left'  'Front'  'Right'  'Back'  Bottom  ");
            for (int j = 0; j < 6; j++)
            {
                tempValues = cubes[i].displayFace(j);
                faceHolder[1] = faceHolder[1] + tempValues[0] + "      ";
                faceHolder[2] = faceHolder[2] + tempValues[1] + "      ";
            }
            for (int k = 0; k < 4; k++)
                System.out.println(faceHolder[k]);
        }

    }
    
    public void randomize(int randValues) throws InterruptedException
    {
        Random r = new Random();
        for (int i = 0; i < randValues; i++)
        {
            cubeMove(r.nextInt(8)+1, r.nextInt(6)+1);
            Thread.sleep(1000);
            System.out.println(i);
        }
            
    }
}
