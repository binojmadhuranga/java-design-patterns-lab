public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter(new MP4Player());
        player.play("video.mp4");
    }
}
