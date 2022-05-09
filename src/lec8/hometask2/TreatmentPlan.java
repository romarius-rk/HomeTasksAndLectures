package lec8.hometask2;

import commons.CmdReader;

public class TreatmentPlan {
    private int emergenceCode;

    public TreatmentPlan(){
        System.out.println("Enter emergence code.");
        CmdReader reader = new CmdReader();
        this.emergenceCode = reader.readInt("");
    }

    public int getEmergenceCode() {
        return emergenceCode;
    }
}
