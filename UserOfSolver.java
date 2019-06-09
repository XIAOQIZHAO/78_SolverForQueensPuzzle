/**
  test SolverForQueensPuzzle

  command line argument: the width of biggest board
  to test, like...
      > java UserOfSolver 4
  10 has a pause; 11 is tolerable; 12 requires patience
 */

public class UserOfSolver {

    public static void main(String[] commandLine) {
        System.out.println();

        // command line argument is required
        if( commandLine.length < 1) {
            System.out.println(
                "Error: missing command-line argument."
              + System.lineSeparator()
              + "On the command line, "
              + "specify the width of biggest board to test, "
              + "like..." + System.lineSeparator()
              + "    > java UserOfSolver 4"
              );
            System.exit(1);
        }

        // tests
        for( int boardSize = 0
           ; boardSize <= Integer.parseInt( commandLine[0])
           ; boardSize++)
            oneTest( boardSize);
    }


    /**
      run one test
     */
    private static void oneTest( int size
                               ) {

        /* Announce the board size before invoking the
           Solver, so that the announcement precedes any
           debugging output.
         */
        System.out.println( size + "x" + size + " board");

        long startAt = System.currentTimeMillis();
        System.out.println(
            new SolverForQueensPuzzle( size)
          + "elapsed time: "
          + (System.currentTimeMillis() - startAt) / 1000.
          + " seconds" + System.lineSeparator()
          );
    }
}
