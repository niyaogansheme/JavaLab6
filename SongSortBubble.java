public class SongSortBubble {
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


        for (int i = 0; i < songNames.length - 1; i++) {
            for (int j = 0; j < songNames.length - 1 - i; j++) {
                if (songNames[j].compareTo(songNames[j+1]) > 0) {

                    String tempSong = songNames[j];
                    songNames[j] = songNames[j+1];
                    songNames[j+1] = tempSong;

                    String tempArtist = artists[j];
                    artists[j] = artists[j+1];
                    artists[j+1] = tempArtist;
                }
            }
        }

        System.out.println("Sorted Song List (A-Z):");
        for (int i = 0; i < songNames.length; i++) {
            System.out.println((i+1) + ". " + songNames[i] + " - " + artists[i]);
        }
    }
}