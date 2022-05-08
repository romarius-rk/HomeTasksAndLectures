package lec7.task3;

import java.util.Objects;

public class Register {
    private final DocumentAbstract[] registerData = new DocumentAbstract[10];
    
    public void addDoc(DocumentAbstract anyDoc){
        DocumentAbstract[] registerData = this.registerData;

        for (int i = 0; i < registerData.length; i++) {
            if (registerData[i]== null){
                registerData[i] = anyDoc;
                break;
            }
        }
    }

    public void printDocInfo(String docName){
        DocumentAbstract[] registerData = this.registerData;

        for (DocumentAbstract i: registerData) {
            if(i!= null) {
                if (docName.equals(i.getDocName())) {
                    i.printInfo();
                    break;
                }
            }else {
                System.out.println("This document is not found.");
                break;
            }
        }
    }

    public DocumentAbstract[] getRegisterData() {
        return registerData;
    }
}
