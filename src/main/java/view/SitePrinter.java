package view;

import model.Site;

/**
 * Class for preparing site for printing
 * @author Tomas Marx Raacz von Hidveg
 * */
public class SitePrinter {
    public SitePrinter () {

    }
    /**
     * Method for preparing a site object for printing using Site class getters
     * @param site String
     * @return String
     * */
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
