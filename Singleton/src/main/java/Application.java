public class Application {

    public static void main(String[] args){
        String movie = "Spider Man";

        MoviePlayer moviePlayer = MoviePlayer.getInstance();
        moviePlayer.playMovie(movie);
    }
}
