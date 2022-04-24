package lec7.task3;

import java.util.Date;

public abstract class DocumentAbstract implements Document {
    protected String docName;
    protected Date created;

    protected DocumentAbstract(String docName){
        this.docName = docName;
        this.created = new Date();
    }

}
