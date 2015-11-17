import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.lang.Object; 
import java.util.AbstractCollection; 
import java.util.AbstractList; 
import java.util.ArrayList; 

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 10 rows and 10 columns
    private final int ROWS = 11;
    private final int COLS = 11;
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the three cells initially alive
        final int X1 = 3, Y1 = 3;
        final int X2 = 3, Y2 = 4;
        final int X3 = 3, Y3 = 5;
        final int X4 = 3, Y4 = 6;
        final int X5 = 3, Y5 = 7;
        
        final int X6 = 7, Y6 = 3;
        final int X7 = 7, Y7 = 4;
        final int X8 = 7, Y8 = 5;
        final int X9 = 7, Y9 = 6;
        final int X10 = 7, Y10 = 7;
        
        final int X11 = 3, Y11 = 7;
        final int X12 = 4, Y12 = 7;
        final int X13 = 5, Y13 = 7;
        final int X14 = 6, Y14 = 7;
        final int X15 = 7, Y15 = 7;
        
        final int X16 = 3, Y16 = 3;
        final int X17 = 4, Y17 = 3;
        final int X18 = 5, Y18= 3;
        final int X19 = 6, Y19 = 3;
        final int X20 = 7, Y20 = 3;
        
        final int X21 = 5, Y21 = 5;
 

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add Flowers (a type of Actor) to the three intial locations
        Flower Flower1 = new Flower();
        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, Flower1);
        Flower Flower2 = new Flower();
        Location loc2 = new Location(Y2, X2);
        grid.put(loc2, Flower2); 
        Flower Flower3 = new Flower();
        Location loc3 = new Location(Y3, X3);
        grid.put(loc3, Flower3);
        Flower Flower4 = new Flower();
        Location loc4 = new Location(Y4, X4);
        grid.put(loc4, Flower4);
        Flower Flower5 = new Flower();
        Location loc5 = new Location(Y5, X5);
        grid.put(loc5, Flower5);
        
        Flower Flower6 = new Flower();
        Location loc6 = new Location(Y6, X6);
        grid.put(loc6, Flower6);
        
        Flower Flower7 = new Flower();
        Location loc7 = new Location(Y7, X7);
        grid.put(loc7, Flower7); 
        
        Flower Flower8 = new Flower();
        Location loc8 = new Location(Y8, X8);
        grid.put(loc8, Flower8);
        Flower Flower9 = new Flower();
        Location loc9 = new Location(Y9, X9);
        grid.put(loc9, Flower9);
        Flower Flower10 = new Flower();
        Location loc10 = new Location(Y10, X10);
        grid.put(loc10, Flower10);
        
        
        Flower Flower11 = new Flower();
        Location loc11 = new Location(Y11, X11);
        grid.put(loc11, Flower11);
        Flower Flower12 = new Flower();
        Location loc12 = new Location(Y12, X12);
        grid.put(loc12, Flower12); 
        Flower Flower13 = new Flower();
        Location loc13 = new Location(Y13, X13);
        grid.put(loc13, Flower13);
        Flower Flower14 = new Flower();
        Location loc14 = new Location(Y14, X14);
        grid.put(loc14, Flower14);
        Flower Flower15 = new Flower();
        Location loc15 = new Location(Y15, X15);
        grid.put(loc15, Flower15);
        
        
        Flower Flower16 = new Flower();
        Location loc16 = new Location(Y16, X16);
        grid.put(loc16, Flower16);
        Flower Flower17 = new Flower();
        Location loc17 = new Location(Y17, X17);
        grid.put(loc17, Flower17); 
        Flower Flower18 = new Flower();
        Location loc18 = new Location(Y18, X18);
        grid.put(loc18, Flower18);
        Flower Flower19 = new Flower();
        Location loc19 = new Location(Y19, X19);
        grid.put(loc19, Flower19);
        Flower Flower20 = new Flower();
        Location loc20 = new Location(Y20, X20);
        grid.put(loc20, Flower20);
        
        Flower Flower21 = new Flower();
        Location loc21 = new Location(Y21, X21);
        grid.put(loc21, Flower21);
        world.show(); 
        
        
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        
        ArrayList<Location> alive= new ArrayList<Location>(); 
        ArrayList<Location> dead= new ArrayList<Location>(); 
        ArrayList<Actor> neighbors= new ArrayList<Actor>(); 
        
        for(int r=0; r<ROWS; r++)
        {
            for(int c=0; c<COLS; c++) 
            {
                Location loc= new Location(r,c);
                Actor cell= grid.get(loc); 
                neighbors= grid.getNeighbors(loc); 
                if(cell== null && neighbors.size()==3)
                {
                    alive.add(loc);
                }
                else if (cell !=null)
                {
                    if(neighbors.size()==2 || neighbors.size()==3)
                    {
                        alive.add(loc);
                    }
                    else
                    {
                        dead.add(loc);
                    }    
                 }               
          }
        }
        
        for( Location newloc:dead)
        {
            grid.remove(newloc);
            Rock rock= new Rock(); 
            grid.put(newloc,rock);
        }
        for(Location newloc:alive) 
        {
            Flower flower= new Flower(); 
            grid.put(newloc,flower); 
        }    

    }
  
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)throws InterruptedException 
    {
        GameOfLife game = new GameOfLife();
  
        for( int i=0; i<=3; i++) 
        {
            Thread.sleep(3000);
            game.createNextGeneration(); 
        } 
    }

}