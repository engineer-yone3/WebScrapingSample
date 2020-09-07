package jp.co.example.app;

public class ApplicationMain {

	public static void main(String[] args) {
		try {
			Scraping scraping = new Scraping();
			scraping.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
