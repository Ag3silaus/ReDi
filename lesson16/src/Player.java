import java.util.HashMap;
import java.util.Map;

public class Player {
    StreamingStatistics rediStatistics = new StreamingStatistics();
    Map<User, UserStatistics> userStatistics = new HashMap<>();
    Map<Artist, ArtistStatistics> artistStatistics = new HashMap<>();

    public void play(Track track, User user) {
        rediStatistics.recordPlay();
        if (userStatistics.containsKey(user)) {
            userStatistics.get(user).recordPlay(track);
        } else {
            userStatistics.put(user, new UserStatistics());
        }
        if (artistStatistics.containsKey(track.getArtist())) {
            artistStatistics.get(track.getArtist()).recordPlay(user);
        } else {
            artistStatistics.put(track.getArtist(), new ArtistStatistics());
        }

        System.out.println("User " + user.getName() + " plays the track " + track.getName());
//    "Now playing: <artist_name> - <track_name>"
    }

//    public void getTopFanForArtist(Artist artist) {
//        return artistStatistics.get(artist).getTopFan();
//    }


}
//How many streams have there been in total?
