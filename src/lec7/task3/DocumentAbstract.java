package lec7.task3;

import java.util.Date;

public abstract class DocumentAbstract implements Document {
    protected String docName;
    protected final Date created;

    public DocumentAbstract() {
        this.docName = "null";
        this.created = new Date(0);
    }

    protected DocumentAbstract(String docName){
        this.docName = docName;
        this.created = new Date();
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public Date getCreated() {
        return created;
    }
}
