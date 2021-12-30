import model.Site;
import view.SitePrinter;
import java.util.Scanner;

/**
 * Main application start class
 * @author Tomas Marx-Raacz von Hidvég
 * */
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
                    Site site = new Site(str);
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
