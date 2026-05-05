public class Main {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();
        Subscriber s1 = new User("Alice");
        Subscriber s2 = new User("Bob");
        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.uploadVideo("Observer Pattern Tutorial");
    }
}