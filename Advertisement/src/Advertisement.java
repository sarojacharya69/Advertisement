public class Advertisement {
    private int advertisementId;
    private String adDescription;

    public Advertisement(int advertisementId, String adDescription) {
        this.advertisementId = advertisementId;
        this.adDescription = adDescription;
    }

    public int getAdvertisementId() {
        return advertisementId;
    }

    public String getAdDescription() {
        return adDescription;
    }
}
