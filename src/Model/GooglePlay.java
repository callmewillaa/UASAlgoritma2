package Model;

public class GooglePlay {
    private int filesize;
    private String icon;
    private String inAppBilling;
    private String name;
    private int numdownload;
    private int operatingsytem;

    public GooglePlay(){
    }

    public GooglePlay (int filesize, String icon,String inAppBilling,String Name, int numdownload, int operatingsytem){
        this.filesize = filesize;
        this.icon = icon;
        this.inAppBilling = inAppBilling;
        this.name = Name;
        this.numdownload = numdownload;
        this.operatingsytem = operatingsytem;
    }

    public String getGoogleplay() {
        return String.valueOf(this.filesize);
    }

    public void setFilesize(int filesize) {
        this.filesize = filesize;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getInAppBilling() {
        return this.inAppBilling;
    }

    public void setInAppBilling(String inAppBilling) {
        this.inAppBilling = inAppBilling;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String Name) {
        this.name = Name;
    }
    public int getNumdownload(){
        return this.numdownload;

    }

    public void setNumdownload(){
        this.numdownload = numdownload;

    }
    public int getOperatingsytem(){
        return this.operatingsytem;

    }

    public int setOperatingsytem(){
        return this.operatingsytem = operatingsytem;
    }
}