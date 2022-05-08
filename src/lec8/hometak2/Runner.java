package lec8.hometak2;

public class Runner {
    public static void main(String[] args) {
        TreatmentPlan treatmentPlan = new TreatmentPlan();
        Patient patient = new Patient(treatmentPlan);
        Surgeon surgeon = new Surgeon(41, "surgeon", 15);
        Dentist dentist = new Dentist(34, "dentist", 10);
        Therapist therapist = new Therapist(27, "therapist", 4);

        switch (treatmentPlan.getEmergenceCode()) {
            case 1:
                surgeon.healing();
                break;
            case 2:
                dentist.healing();
                break;
            case 3:
                therapist.healing();
                break;
            default:
                System.out.println("Patient is die without help.");
                break;
        }
    }
}
