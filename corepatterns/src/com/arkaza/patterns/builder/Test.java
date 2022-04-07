package com.arkaza.patterns.builder;

public class Test {

	public static void main(String[] args) {
		HttpClient httpclient = new HttpClient.HttplClientBuilder().method("GET").url("url").body("{}")
				.secure("user", "pass").build();
		System.out.println(httpclient);

	}

}
