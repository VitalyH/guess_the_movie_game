import java.util.Scanner;

/**
 *  The game engine
 */
class TheGame {

    // Fields
    boolean isUserWon; // Result of the game

    // Constructor
    TheGame() throws Exception {
        this.isUserWon = getGameResult();
    }

    // Method
    private boolean getGameResult() throws Exception {

        // Get random movie
        RandomMovie myRandomMovie = new RandomMovie();
        String randomMovie = myRandomMovie.randomMovie;

        // Variables
        StringBuilder guessedLetters = new StringBuilder(" ");  // Guessed letters with " " by default
        StringBuilder wrongLetters = new StringBuilder();       // Wrong letters
        int wrongLettersCounter = 0;                            // Wrong letters counter
        int numberOfMistakes = 10;                              // Number of allowed mistakes

        // Ask user for the input
        // Allow him/her to make some mistakes
        while (wrongLettersCounter < numberOfMistakes) {
            // Ask user for a letter
            System.out.println("Guess a letter: ");
            Scanner scanner = new Scanner(System.in);
            String newLetter = scanner.nextLine();

            // Check if entered letter exists in the movie
            if (randomMovie.contains(newLetter)) {
                // Add it to the answer
                guessedLetters.append(newLetter);
            } else {
                // Add it to the wrong letters
                wrongLetters.append(newLetter);
                // Increment counter by one
                wrongLettersCounter++;
            }

            // Replace all letters in the movie with "_" except correctly guessed
            String displayHiddenMovie = randomMovie.replaceAll("[^" + guessedLetters + "]", "_");
            // Print results
            System.out.println("You are guessing: " + displayHiddenMovie);
            System.out.println("You have guessed " + wrongLettersCounter + " wrong letters: " + wrongLetters);

            // If user have guessed movie correctly - stop and break the loop
            if (displayHiddenMovie.equals(randomMovie)) {
                isUserWon = true;
                break;
            }
        }
        return isUserWon;

    }}


