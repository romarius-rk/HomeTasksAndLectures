package lec7.task3.docImpl;

import lec7.task3.DocumentAbstract;

import java.util.Date;

public class EmployeeContractDoc extends DocumentAbstract {

    private String nameEmp;
    private Date expire;

    public EmployeeContractDoc(){
        super();
        this.nameEmp = "null";
        this.expire = new Date(0);
    }

    public EmployeeContractDoc(String docName,String nameEmp, Date expire) {
        super(docName);
        this.nameEmp = nameEmp;
        this.expire = expire;
    }


    @Override
    public void printInfo() {
        System.out.printf("Document type: employee contract.\n" +
                "Created: %s.\n" +
                "Document name: %s.\n" +
                "Employee name: %s.\n" +
                "Expire date: %s.",created,docName,nameEmp,expire);
    }

    public String getNameEmp() {
        return nameEmp;
    }

    public void setNameEmp(String nameEmp) {
        this.nameEmp = nameEmp;
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }
}
