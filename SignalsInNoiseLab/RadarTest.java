

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Scanner;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    
     final int ROWS=100;
     final int COLS=100;
    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
        final int ROWS=100;
        final int COLS=100;
         boolean[][] currentScan;
        int[][] accumulator;
      int monsterLocationRow;
         int monsterLocationCol;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    public void testScan(){
       
    }
    
  
    @Test
    public void testRadar123(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter monster row");
        int monsRow= scan.nextInt();
        System.out.println("Enter monster col");
        int monsCol= scan.nextInt();
        Radar radar= new Radar(ROWS,COLS);
        radar.setMonsterLocation(monsRow, monsCol);
        for(int i=0; i< 10; i++){
            radar.scan();
        }
        int rows= radar.getNumRows();
        int cols= radar.getNumCols();
        int scans= radar.getNumScans();
        for( int l=0; l<rows; l++){
            for( int j=0; j<cols; j++)
            if(radar.getAccumulatedDetection( l, j)== scans){
                assertEquals(monsRow, l);
                assertEquals(monsCol,j);
            }
        }
        
    }
    
    @Test
    public void testRadar1234(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter monster row");
        int monsRow= scan.nextInt();
        System.out.println("Enter monster col");
        int monsCol= scan.nextInt();
        Radar radar= new Radar(ROWS,COLS, monsRow, monsCol);
       
        for(int i=0; i< 37; i++){
            radar.scan();
        }
        int rows= radar.getNumRows();
        int cols= radar.getNumCols();
        int scans= radar.getNumScans();
        for( int l=0; l<rows; l++){
            for( int j=0; j<cols; j++)
            if(radar.getAccumulatedDetection( l, j)== scans){
                assertEquals(monsRow, l);
                assertEquals(monsCol,j);
            }
        }
        
    }
}
