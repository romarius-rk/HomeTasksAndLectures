package lec7.task3.docImpl;

import lec7.task3.DocumentAbstract;

public class DeliveryOrderDoc extends DocumentAbstract {

    private int indexProd;
    private int amount;

    public DeliveryOrderDoc() {
        super();
        this.indexProd = 0;
        this.amount = 0;
    }

    public DeliveryOrderDoc(String docName, int indexProd, int amount) {
        super(docName);
        this.indexProd = indexProd;
        this.amount = amount;
    }

    @Override
    public void printInfo() {
        System.out.printf("Document type: delivery order.\n" +
                "Created: %s.\n" +
                "Document name: %s.\n" +
                "Warehouse index: %d.\n" +
                "In stock items: %d.",created,docName,indexProd,amount);
    }

    public int getIndexProd() {
        return indexProd;
    }

    public void setIndexProd(int indexProd) {
        this.indexProd = indexProd;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
