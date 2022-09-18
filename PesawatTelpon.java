public class PesawatTelpon {
    String facsimilie, teleconference, intercom;

    public void setFacsimilie(String facsimilie) {
        this.facsimilie = facsimilie;
    }

    public void setTeleconference(String teleconference) {
        this.teleconference = teleconference;
    }

    public void setIntercom(String intercom) {
        this.intercom = intercom;
    }

    public String getFacsimilie() {
        return facsimilie;
    }

    public String getTeleconference() {
        return teleconference;
    }

    public String getIntercom() {
        return intercom;
    }

    void menelepon(String p) {
        System.out.println("tekan untuk menelepon");
    }
    
    void meengangkat() {
        System.out.println("hallo dengan siapa");
    }
}

    