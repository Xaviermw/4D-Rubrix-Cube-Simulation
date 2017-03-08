/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4dcube2x2x2;


import java.util.Scanner;

/**
 *
 * @author 12576
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CubeEnvironment ce = new CubeEnvironment();
        ce.setColors();
        ce.setOriginalEnviroment();
        boolean quit = false;
      
        String select;
        int cube;
        int side;
        int randValue;
        
        Scanner scan = new Scanner(System.in);
        
        while (!quit)
        {
            ce.printCubes();
            System.out.println();
            System.out.println();
            System.out.print("Enter Cube to Turn: ");
            select = scan.next();
            try
            {
                cube = Integer.parseInt(select);
                System.out.print("Select Side to Move to Top: ");
                side = scan.nextInt();
                ce.cubeMove(cube, Integer.parseInt(select));
            }
            catch (Exception e)
            {
                if (select.equals("r"))
                {
                    System.out.print("How many random turns: ");
                    randValue = scan.nextInt();
                    ce.randomize(randValue);
                }
                else if (select.equals("m"))
                    ce.setOriginalEnviroment();
                else if (select.equals("q"))
                    System.exit(0);
                else
                    System.out.println("Invalid Value");
            }
        }
      
    }
    
}
