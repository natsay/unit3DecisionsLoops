
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import info.gridworld.actor.Actor;

/**
 * The test class GameOfLifeTest.
 *
 * @author  @Natalie Tse
 * @version Novemeber 17 2015
 */
public class GameOfLifeTest
{
    /**
     * Default constructor for test class GameOfLifeTest
     */
    public GameOfLifeTest()
    {
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

    @Test
    public void testInitialState()
    {
        /* expected pattern for initial state
         *  (X: alive; -: dead)
         * 
         *    0 1 2 3 4 5 6 7 8 9 10 11
         *  0 - - - - - - - - - - - - - 
         *  1 - - - - - - - - - - - - - 
         *  2 - - - - - - - - - - - - - 
         *  3 - - - -X X X X X - - - - -
         *  4 - - - -X - - - X - - - - -
         *  5 - - - -X - X - X - - - - -
         *  6 - - - -X - - - X - - - - -
         *  7 - - - -X X X X X - - - - -
         *  8 - - - - - - - - - - - - - 
         *  9 - - - - - - - - - - - - - 
         *  10 - - - - - - - - - - - - - 
         *  11 - - - - - - - - - - - - - 
         *  
         */
        
        
        
        
        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 3 && col == 3) ||
                        (row == 3 && col == 4) ||
                        (row == 3 && col == 5) ||
                        (row == 3 && col == 6) ||
                        (row == 3 && col == 7) ||
                        
                        (row == 7 && col == 3) ||
                        (row == 7 && col == 4) ||
                        (row == 7 && col == 5) ||
                        (row == 7 && col == 6) ||
                        (row == 7 && col == 7) ||
                        
                        (row == 3 && col == 7) ||
                        (row == 4 && col == 7) ||
                        (row == 5 && col == 7) ||
                        (row == 6 && col == 7) ||
                        (row == 7 && col == 7) ||
                        
                        (row == 3 && col == 3) ||
                        (row == 4 && col == 3) ||
                        (row == 5 && col == 3) ||
                        (row == 6 && col == 3) ||
                        (row == 7 && col == 3) || 
                        
                        (row == 5 && col == 5))  
                        
                        
                        
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }

    @Test
    public void testFinalState() throws InterruptedException 
    {
       /* expected pattern for final state
          *  (X: alive; -: dead)
         * 
         *    0 1 2 3 4 5 6 7 8 9 10 11
         *  0 - - - - - - - - - - - - -
         *  1 - - - - - - - - - - - - -
         *  2 - - - - - - - - - - - - -
         *  3 - - - - - - - - - - - - -        
         *  4 - - - - - X - - - - - - -
         *  5 - - - - X - X - - - - - -
         *  6 - - - - - X - - - - - - -
         *  7 - - - - - - - - - - - - -     
         *  8 - - - - - - - - - - - - -
         *  9 - - - - - - - - - - - - -
         *  10 - - - - - - - - - - - - -
         *  11 - - - - - - - - - - - - -
         *  
         */
       GameOfLife game = new GameOfLife();
       final int ROWS = game.getNumRows();
       final int COLS = game.getNumCols();
       for( int i=0; i<=3; i++) 
       {
           Thread.sleep(3000);
           game.createNextGeneration();
       } 

       for(int row = 0; row < ROWS; row++)
       {
           for(int col = 0; col < COLS; col++)
           {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
              Actor cell = game.getActor(row, col);
              
              if(     ( row== 4 && col == 5) ||
                      ( row== 5 && col == 4) ||
                      ( row== 6 && col == 5) ||
                      ( row== 5 && col == 6)) 
              {
                  assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
              }    
              else
              {
                  assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
              }    
                      
           }
       } 
       
          
    }
      
}
