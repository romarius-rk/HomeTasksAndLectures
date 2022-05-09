package lec8.hometask1;

public class SimCard {
    private final String operator;
    private final long simNumber;

    public SimCard(String operator,long simNumber){
        this.operator = operator;
        this.simNumber = simNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimCard card = (SimCard) o;
        return simNumber == card.simNumber && operator.equals(card.operator);
    }

    public String getOperator() {
        return operator;
    }

    public long getSimNumber() {
        return simNumber;
    }
}
