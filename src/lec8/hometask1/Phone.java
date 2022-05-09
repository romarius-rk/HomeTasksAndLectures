package lec8.hometask1;

public class Phone implements PhoneSkills {
    protected String model = "Kirpeach";
    protected int weight;
    protected SimCard card;

    public Phone() {
    }

    public Phone(String model, SimCard card) {
        this.model = model;
        this.card = card;
    }

    public Phone(String model, int weight, SimCard card) {
        this(model, card);
        this.weight = weight;
    }

    @Override
    public void receiveCall(SimCard card) {
        if (this.card == null){
            System.out.println("You have a premonition that someone is trying to call you.");
            return;
        }
        if (!card.equals(this.card)) {
            System.out.printf("Incoming call.\n%s: %d\n", card.getOperator(), card.getSimNumber());
            return;
        }
        System.out.println("It's your phone number.");
    }

    public void receiveCall(SimCard card, Owner owner) {
        if (this.card == null){
            System.out.println("You have a premonition that someone is trying to call you.");
            return;
        }
        if (!card.equals(this.card)) {
            System.out.printf("Incoming call.\n%s: %d\n%s\n%s\n", owner.getOwnerName(),
                    card.getSimNumber(), card.getOperator(), owner.getPhotoInfo());
            return;
        }
        System.out.println("It's your phone number.");
    }

    public void sendingMassage (SimCard ... simCards) {
        if (this.card == null) {
            System.out.println("Try again, but without sim card it's impossible");
            return;
        } else {
            for (int i = 0; i < simCards.length; i++) {
                System.out.println("You send massage to the number: " + simCards[i].getSimNumber());
            }
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public SimCard getCard() {
        return this.card;
    }

    public void setCard(SimCard card) {
        this.card = card;
    }
}
