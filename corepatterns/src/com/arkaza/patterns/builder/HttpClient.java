package com.arkaza.patterns.builder;

public class HttpClient {

	private String method;
	private String url;
	private String username;
	private String password;
	private String headers;
	private String body;

	public HttpClient(HttplClientBuilder httplClientBuilder) {
		this.method = httplClientBuilder.method;
		this.url = httplClientBuilder.url;
		this.username = httplClientBuilder.username;
		this.password = httplClientBuilder.password;
		this.headers = httplClientBuilder.headers;
		this.body = httplClientBuilder.body;
	}

	public static class HttplClientBuilder {
		private String method;
		private String url;
		private String username;
		private String password;
		private String headers;
		private String body;

		public HttplClientBuilder method(String method) {
			this.method = method;
			return this;
		}

		public HttplClientBuilder url(String url) {
			this.url = url;
			return this;
		}

		public HttplClientBuilder secure(String username, String password) {
			this.username = username;
			this.password = password;
			return this;
		}

		public HttplClientBuilder headers(String headers) {
			this.headers = headers;
			return this;
		}

		public HttplClientBuilder body(String body) {
			this.body = body;
			return this;
		}

		public HttpClient build() {
			return new HttpClient(this);
		}
	}

	public String getMethod() {
		return method;
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getHeaders() {
		return headers;
	}

	public String getBody() {
		return body;
	}

	@Override
	public String toString() {
		return "HttpClient [method=" + method + ", url=" + url + ", username=" + username + ", password=" + password
				+ ", headers=" + headers + ", body=" + body + "]";
	}

}
