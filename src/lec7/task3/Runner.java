package lec7.task3;

import commons.CmdReader;
import lec7.task3.docImpl.DeliveryOrderDoc;
import lec7.task3.docImpl.EmployeeContractDoc;
import lec7.task3.docImpl.FinancialInvoice;

import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        CmdReader reader = new CmdReader();

        FinancialInvoice financialInvoice = new FinancialInvoice();
        FinancialInvoice financialInvoice1 = new FinancialInvoice("Last deposit.", 1000, 27012000);
        EmployeeContractDoc employeeContractDoc = new EmployeeContractDoc();
        EmployeeContractDoc employeeContractDoc1 = new EmployeeContractDoc("Newbee", "Ivanov Ivan Ivanovich", new Date(27012000));
        DeliveryOrderDoc deliveryOrderDoc = new DeliveryOrderDoc();
        DeliveryOrderDoc deliveryOrderDoc1 = new DeliveryOrderDoc("Computer details delivery", 578249, 200);

        Register register = new Register();

        register.addDoc(financialInvoice);
        register.addDoc(financialInvoice1);
        register.addDoc(employeeContractDoc);
        register.addDoc(employeeContractDoc1);
        register.addDoc(deliveryOrderDoc);
        register.addDoc(deliveryOrderDoc1);

        DocumentAbstract[] documentAbstract = register.getRegisterData();

        System.out.println(documentAbstract[7]);

        register.printDocInfo(reader.read("Enter document name"));
    }
}
