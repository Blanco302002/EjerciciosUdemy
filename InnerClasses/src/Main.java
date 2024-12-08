import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");

        album.addSong("Stormbringer", 4.62);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        // albums.add(album);

        Album album2 = new Album("For those about to rock", "AC/DC");
        album2.addSong("For those about to rock", 5.44);
        album2.addSong("I put the finger on you", 3.25);
        album2.addSong("Lets go", 3.45);
        album2.addSong("Inject the venom", 3.33);
        album2.addSong("Snowballed", 4.51);
        album2.addSong("Evil walks", 3.45);
        album2.addSong("C.O.D.", 5.25);
        album2.addSong("Breaking the rules", 5.32);
        album2.addSong("Night of the long knives", 5.12);

        LinkedList<Song> playList = new LinkedList<Song>();
        album.addToPlayList("You can't do it right", playList);
        album.addToPlayList("Holy man", playList);
        album.addToPlayList("Speed king", playList);  // Does not exist
        album.addToPlayList(9, playList);
        album2.addToPlayList(8, playList);
        album2.addToPlayList(3, playList);
        album2.addToPlayList(2, playList);
        album2.addToPlayList(24, playList);  // There is no track 24

    }
}
