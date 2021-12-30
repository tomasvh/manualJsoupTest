package view;

import model.Site;

public class SitePrinter {
    public SitePrinter () {

    }
    public String printSite (Site site) {
        StringBuilder strb = new StringBuilder();
        strb.append("title: ").append(site.getTitle()).append("\n");
        strb.append("location: ").append(site.getLocation()).append("\n");
        strb.append("number of div tags: ").append(site.getDivNumber()).append("\n");
        strb.append("number of a tags: ").append(site.getLinkNumber()).append("\n");
        strb.append("number of li tags: ").append(site.getListNumber()).append("\n");
        strb.append("first div content: ").append(site.getFirstDivContent()).append("\n");
        strb.append("first link: ").append(site.getFirstLink()).append("\n");
        return strb.toString();

    }
}
