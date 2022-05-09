package lec8.hometask1;

public class Owner {
    private final String ownerName;
    private final String photoInfo;

    public Owner(String ownerName, String photoInfo) {
        this.ownerName = ownerName;
        this.photoInfo = photoInfo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getPhotoInfo() {
        return photoInfo;
    }

    public String printInfo() {
        return  this.ownerName + this.photoInfo;
    }
}
