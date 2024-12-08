import java.util.ArrayList;
import java.util.LinkedList;

class Album {
    private String name;
    private String artist;
    private SongList songList;
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    public void addSong(String title, double duration) {
        if (songList.findSong(title) == null) {
            Song song = new Song(title, duration);
            songList.add(song);
        }

    }
    public static class SongList {
        private ArrayList<Song> songs;
        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            songs.add(song);
            return true;
        }
        public <T> Song findSong(T input) {
            if (input instanceof Integer trackNumber) {
                if (trackNumber > songs.size() || trackNumber < 0) {
                    return null;
                }
                return songs.get(trackNumber);
            } else if (input instanceof String title) {
                for (Song song : songs) {
                    if (song.getTitle().equals(title)) {
                        return song;
                    }
                }
                return null;
            }
            return null;
        }

    }


    private Song findSong(String title) {
        Song song = songList.findSong(title);
        if (song == null) {
            System.out.println("The song " + title  + " is not in this album");
            return null;
        }
        return song;
    }
    public <T> void addToPlayList(T input, LinkedList<Song> playList) {
        Song song = songList.findSong(input);
        if (song != null) {
            // la cancion existe...
            System.out.println("This song already exists");
        }
        songList.add(song);
    }
}
