package lec8.hometask1;

public class SimCard {
    private final String ownerName;
    private final long simNumber;

    public SimCard(String ownerName,long simNumber){
        this.ownerName = ownerName;
        this.simNumber = simNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimCard card = (SimCard) o;
        return simNumber == card.simNumber && ownerName.equals(card.ownerName);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public long getSimNumber() {
        return simNumber;
    }
}
