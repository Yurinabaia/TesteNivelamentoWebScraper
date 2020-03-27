import java.io.IOException;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Demo {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		try {

			//Site1 PetShopDelivery
			
			Document Conexao = Jsoup.connect("https://www.petshopbhdelivery.com.br/racoes-caes-cachorro-bh-delivery?gclid=Cj0KCQjwyPbzBRDsARIsAFh15JaFsEHBRRzm6HVyZ1nK3BAGisBLa-P-3EHSnT83NIwlgB7qKds1vf0aAvuIEALw_wcB").get();
			Elements TempCon = Conexao.select("h3._2BULo");
			int i = 0;
			for (Element moviLisElement : TempCon) 
			{
				i++;
				System.out.println(i + " " + moviLisElement.getElementsByTag("h3").first().text());
			}
			
			/*//Site2 https://www.conectareducacional.com.br/
			Document Conexao = Jsoup.connect("https://www.conectareducacional.com.br/").get();
			Elements TempCon = Conexao.select("p.product-title");
			int i = 0;
			for (Element moviLisElement : TempCon) 
			{
				i++;
				System.out.println(i + " " + moviLisElement.getElementsByTag("a").first().text());
			}*/
			/*//Site3 https://www.elo7.com.br/lista/venda-de-croche/
			Document Conexao = Jsoup.connect("https://www.elo7.com.br/lista/venda-de-croche/").get();
			Elements TempCon = Conexao.select("li.product");
			int i = 0;
			for (Element moviLisElement : TempCon) 
			{
				i++;
				System.out.println(i + " " + moviLisElement.getElementsByTag("h2").first().text());
			}
			System.out.println("\n\n\n\nPrimeiro post: " + TempCon.text());
			 */
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}

}
