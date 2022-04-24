package lec7.task3.docImpl;

import lec7.task3.DocumentAbstract;

public class FinancialInvoice extends DocumentAbstract {

    private double sum;
    private int departmentCode;

    public FinancialInvoice(String docName) {
        super(docName);
    }

    @Override
    public void printInfo() {

    }
}
