public class MatrimonialAdvertisement extends Advertisement {
    private String gender;
    private int age;
    private String occupation;

    public MatrimonialAdvertisement(int advertisementId, String adDescription, String gender, int age, String occupation) {
        super(advertisementId, adDescription);
        this.gender = gender;
        this.age = age;
        this.occupation = occupation;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }
}

