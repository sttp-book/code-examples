package tudelft.phones;

public class PhonePlan {

    private Boolean international, autoRenewal, loyal = false;

    public Boolean getInternational() {
        return international;
    }

    public void setInternational(Boolean international) {
        this.international = international;
    }

    public Boolean getAutoRenewal() {
        return autoRenewal;
    }

    public void setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
    }

    public Boolean getLoyal() {
        return loyal;
    }

    public void setLoyal(Boolean loyal) {
        this.loyal = loyal;
    }

    int pricePerMonth() {
        if (international) {
            return !loyal && !autoRenewal ? 32: 30;
        } else {
            return !loyal && !autoRenewal ? 15: 10;
        }
    }
}
