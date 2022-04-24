package lec7.task3.docImpl;

import lec7.task3.DocumentAbstract;

import java.util.Date;

public class EmployeeContractDoc extends DocumentAbstract {

    private String nameEmp;
    private Date expire;

    public EmployeeContractDoc(String docName) {
        super(docName);
    }

    @Override
    public void printInfo() {

    }
}
