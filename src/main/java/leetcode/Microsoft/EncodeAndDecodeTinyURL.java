package leetcode.Microsoft;

import java.util.HashMap;

class Codec {

	public static HashMap<String, String> hashMap = new HashMap<>();

	// Encodes a URL to a shortened URL.
	public String encode(String longUrl) {
		String tinyUrl = "http://tinyurl.com/";
		String longUrlToTinyUrlWithHashCode = tinyUrl + longUrl.hashCode();
		hashMap.put(longUrlToTinyUrlWithHashCode,longUrl);
		return longUrlToTinyUrlWithHashCode;
	}

	// Decodes a shortened URL to its original URL.
	public String decode(String shortUrl) {
		return hashMap.get(shortUrl);
	}
}


public class EncodeAndDecodeTinyURL {

	public static void main(String[] args) {
		Codec codec = new Codec();
		String url = "https://leetcode.com/problems/design-tinyurl";
		String encodedUrl = codec.encode(url);
		String decodedUrl = codec.decode(encodedUrl);
		System.out.println(encodedUrl);
		System.out.println(decodedUrl);
	}
}
