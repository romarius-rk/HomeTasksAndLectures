package lec7.task3.docImpl;

import lec7.task3.DocumentAbstract;

public class FinancialInvoice extends DocumentAbstract {

    private double sum;
    private int departmentCode;

    public FinancialInvoice() {
        super();
        this.sum = 0;
        this.departmentCode = 0;
    }

    public FinancialInvoice(String docName, double sum, int departmentCode) {
        super(docName);
        this.sum = sum;
        this.departmentCode = departmentCode;
    }

    @Override
    public void printInfo() {
        System.out.printf("Document type: financial invoice.\n" +
                "Created: %s.\n" +
                "Document name: %s.\n" +
                "Deposit credits: %f.\n" +
                "Department code: %d",created,docName,sum,departmentCode);
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }
}
