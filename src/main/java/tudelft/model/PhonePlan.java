package tudelft.model;

public class PhonePlan {

    private final boolean international, autoRenewal, loyal;

    public PhonePlan(boolean international, boolean autoRenewal, boolean loyal) {
        this.international = international;
        this.autoRenewal = autoRenewal;
        this.loyal = loyal;
    }

    int pricePerMonth() {
        boolean isStandard = !(loyal || autoRenewal);
        return international
                ? isStandard ? 32 : 30
                : isStandard ? 15 : 10;
    }
}
