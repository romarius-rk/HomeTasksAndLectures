package lec7.task3.docImpl;

import lec7.task3.DocumentAbstract;

public class DeliveryOrderDoc extends DocumentAbstract {

    private int indexProd;
    private int amount;

    public DeliveryOrderDoc(String docName) {
        super(docName);
    }

    @Override
    public void printInfo() {

    }
}
