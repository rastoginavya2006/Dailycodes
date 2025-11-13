import java.util.*;

public class TinyURL {
    private Map<String, String> map;
    private String baseUrl;
    private int counter;

    public TinyURL() {
        map = new HashMap<>();
        baseUrl = "http://tinyurl.com/";
        counter = 1;
    }

    public String encode(String longUrl) {
        String shortUrl = baseUrl + counter;
        map.put(shortUrl, longUrl);
        counter++;
        return shortUrl;
    }

    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }

    public static void main(String[] args) {
        TinyURL obj = new TinyURL();
        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        String shortUrl = obj.encode(longUrl);
        System.out.println("Encoded URL: " + shortUrl);
        String decodedUrl = obj.decode(shortUrl);
        System.out.println("Decoded URL: " + decodedUrl);
    }
}
