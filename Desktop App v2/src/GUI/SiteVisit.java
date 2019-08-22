/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author zy395907
 */
class SiteVisit {
    private String name, site, timestamp;
    
    public SiteVisit(String name, String site, String timestamp){
        this.name = name;
        this.site = site;
        this.timestamp = timestamp;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSite() {
        return site;
    }
    
    public String getTimestamp() {
        return timestamp.substring(11);
    }
}
