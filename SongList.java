public class SongList {
    public static void main(String[] args) {
        String[] songNames = {
            "Shape of You",
            "Blinding Lights",
            "Someone Like You",
            "Hello",
            "Perfect",
            "Uptown Funk",
            "See You Again",
            "Counting Stars",
            "Thinking Out Loud",
            "Shake It Off"
        };
        String[] artists = {
            "Ed Sheeran",
            "The Weeknd",
            "Adele",
            "Adele",
            "Ed Sheeran",
            "Mark Ronson",
            "Wiz Khalifa",
            "OneRepublic",
            "Ed Sheeran",
            "Taylor Swift"
        };

        System.out.println("Song List:");
        for (int i = 0; i < songNames.length; i++) {
            System.out.println((i+1) + ". " + songNames[i] + " - " + artists[i]);
        }
    }
}
