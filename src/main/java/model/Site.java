package model;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Objects;

public class Site {
    private Document doc = null;
    private String title = "";
    private String location = "";
    private int divNumber = 0;
    private int linkNumber = 0;
    private int listNumber = 0;
    private String firstDivContent = "";
    private String firstLink = "";

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
            this.firstDivContent = Objects.requireNonNull(doc.getElementsByTag("div").first()).wholeText();
            this.firstLink = doc.selectFirst("a").attr("href");
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

    public String getFirstDivContent() {
        return firstDivContent;
    }

    public void setFirstDivContent(String firstDivContent) {
        this.firstDivContent = firstDivContent;
    }

    public String getFirstLink() {
        return firstLink;
    }

    public void setFirstLink(String firstLink) {
        this.firstLink = firstLink;
    }
}
