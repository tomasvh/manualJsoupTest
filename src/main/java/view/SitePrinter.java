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
     * @param site Site
     * @return String
     * */
    public String printSite (Site site) {
        return "title: " + site.getTitle() + "\n" +
                "location: " + site.getLocation() + "\n" +
                "number of div tags: " + site.getDivNumber() + "\n" +
                "number of a tags: " + site.getLinkNumber() + "\n" +
                "number of li tags: " + site.getListNumber() + "\n" +
                "first div content: " + site.getFirstDivContent() + "\n" +
                "first link: " + site.getFirstLink() + "\n";

    }
}
