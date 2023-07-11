public class RealEstateAdvertisement extends Advertisement {
    private String realEstateType;
    private double size;
    private double price;

    public RealEstateAdvertisement(int advertisementId, String adDescription, String realEstateType, double size, double price) {
        super(advertisementId, adDescription);
        this.realEstateType = realEstateType;
        this.size = size;
        this.price = price;
    }

    public String getRealEstateType() {
        return realEstateType;
    }

    public double getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
}
