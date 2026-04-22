class MediaAdapter implements MediaPlayer {
    private MP4Player mp4Player;
    public MediaAdapter(MP4Player mp4Player) {
        this.mp4Player = mp4Player;
    }
    public void play(String file) {
        mp4Player.playMP4(file);
    }
}