package ru.abizgildina.factory;

import ru.abizgildina.model.Incoming;
import ru.abizgildina.model.Outgoing;
import ru.abizgildina.model.Task;

public enum DocumentType {
    Task1(Task.class, new TaskFactory()),
    Outgoing1(Outgoing.class, new OutgoingFactory()),
    Incoming1(Incoming.class, new IncomingFactory());

    private Class clazz;
    private DocumentFactory documentFactory;

    DocumentType(Class clazz, DocumentFactory documentFactory) {
        this.clazz = clazz;
        this.documentFactory = documentFactory;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public DocumentFactory getDocumentFactory() {
        return documentFactory;
    }

    public void setDocumentFactory(DocumentFactory documentFactory) {
        this.documentFactory = documentFactory;
    }
}
