public class Main {

    public static void main(String[] args) throws Exception {
        // Get the random movie
        RandomMovie myRandomMovie = new RandomMovie();
        String randomMovie = myRandomMovie.randomMovie;

        // Get the result
        TheGame myTheGame = new TheGame();
        boolean isUserWon = myTheGame.isUserWon;

        // Display results
        if (isUserWon) {
            System.out.println("You win!");
        } else {
            System.out.println("You Lose! Correct movie was: " + randomMovie);
        }
    }
}






