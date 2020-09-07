package jp.co.example.app;

import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class Scraping {

	public void execute() throws Exception {

		try {

			// Load URL
			Document document = Jsoup.connect("http://xxx.com").get();

			// Get Elements
			Elements elements = document.select("css selector");

			// example.1: get from selector
			for (int i = 0; i < elements.size(); i++) {

				Element element = elements.get(i).selectFirst("css selector");
				String value = element.ownText().trim();

				System.out.println("element value is " + value);

			}

			// example.2: get from node
			Element parentElement = elements.get(0);
			List<Node> childNodes = parentElement.childNodes();
			for (int j = 0; j < childNodes.size(); j++) {

				Node node = childNodes.get(j);
				String value = node.toString();

				System.out.println("node value is " + value);

			}

		} catch (Exception e) {
			throw e;
		}
	}
}
