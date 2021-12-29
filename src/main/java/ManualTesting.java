import model.Site;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import view.SitePrinter;

import java.util.Scanner;

public class ManualTesting {
    public static void main(String []args) {
        try {
            String url = "";
            Scanner scan = new Scanner(System.in);
            SitePrinter printer = new SitePrinter();
            while (!url.equals("x")){
                System.out.println("Please input a URL (format example: www.whatever.com) or x to exit");
                url = scan.nextLine();
                if (!url.equals("x")) {
                    String str = "https://" + url;
                    Document doc = Jsoup.connect(str).get();
                    Site site = new Site(doc, doc.title(), doc.location(), doc.getElementsByTag("div").size(),
                            doc.getElementsByTag("a").size(), doc.getElementsByTag("li").size());
                    System.out.println(printer.printSite(site));
                } else {
                    System.out.println("Exiting");
                    System.exit(1);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
