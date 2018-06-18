import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 Helper class for getting random movie from the list of the movies
 */
class RandomMovie {
    // Fields
    String randomMovie;     // Random movie from the list

    // Constructor
    RandomMovie() throws Exception {
        this.randomMovie = getRandomMovie();
    }

    // Method of getting random movie
    private String getRandomMovie() throws Exception {
        // Create arrayList of movies
        ArrayList<String> allMovies = new ArrayList<>();
        // Open the file with movies list
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);
        // Populate ArrayList with movies, line by line
        while (scanner.hasNextLine()) {
            String movieLine = scanner.nextLine(); // Line with movie inside the list
            allMovies.add(movieLine);
        }

        // Get random movie from the list = random number * number of movies in the list
        return randomMovie = allMovies.get((int) (Math.random() * allMovies.size()));

    }
}