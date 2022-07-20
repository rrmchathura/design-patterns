public class MoviePlayer {

    private static volatile MoviePlayer moviePlayer;

    private MoviePlayer() {
        if (moviePlayer != null){
            throw new RuntimeException("Please use getInstance Method");
        }
    }

    public static MoviePlayer getInstance(){
        if (moviePlayer == null) {
            synchronized (MoviePlayer.class){
                if (moviePlayer == null){
                    moviePlayer = new MoviePlayer();
                }
            }
        }
        return moviePlayer;
    }

    public void playMovie(String movie) {
        System.out.println("Now playing " + movie);
    }


}
