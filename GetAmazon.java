package big_package;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetAmazon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Document doc;
		try {
			doc = Jsoup.connect("http://www.amazon.com/Oracle-Database-Programming-Workbook-Press/dp/0071493697/ref=sr_1_1?ie=UTF8&qid=1395153426&sr=8-1&keywords=mclaughlin%2C+oracle").get();
			
			Elements title = doc.select("#btAsinTitle");
			System.out.println("Title : " + title.text());
			
			Elements price = doc.select(".priceLarge");
			System.out.println(price.text());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
