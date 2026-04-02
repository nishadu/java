package com.ibm.demo.day4.newfeatures;
import java.net.http.*;
import java.io.IOException;
import java.net.URI;

public class Java8NewFeatures {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		

		HttpClient client = HttpClient.newHttpClient();

		HttpRequest request = HttpRequest.newBuilder()

		.uri(URI.create("https://api.example.com/users"))

		.GET()

		.build();

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		System.out.println("Status: " + response.statusCode());

		System.out.println("Body: " + response.body());

	}

}
