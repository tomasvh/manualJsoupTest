package model;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Site {
    private Document doc = null;
    private String title = "";
    private String location = "";
    private int divNumber = 0;
    private int linkNumber = 0;
    private int listNumber = 0;

    public Site () {

    }

    public Site (String str) {

        try {
            this.doc = Jsoup.connect(str).get();
            this.title = doc.title();
            this.location = doc.location();
            this.divNumber = doc.getElementsByTag("div").size();
            this.linkNumber = doc.getElementsByTag("a").size();
            this.listNumber = doc.getElementsByTag("li").size();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDivNumber() {
        return divNumber;
    }

    public void setDivNumber(int divNumber) {
        this.divNumber = divNumber;
    }

    public int getLinkNumber() {
        return linkNumber;
    }

    public void setLinkNumber(int linkNumber) {
        this.linkNumber = linkNumber;
    }

    public int getListNumber() {
        return listNumber;
    }

    public void setListNumber(int listNumber) {
        this.listNumber = listNumber;
    }

    public Document getDoc() {
        return doc;
    }

    public void setDoc(Document doc) {
        this.doc = doc;
    }
}
