package com.epam.infohandling.parsing;

import com.epam.infohandling.model.Composite;

public abstract class AbstractParser implements Parser {

    private Parser successor;
     static String SPLITTER;

    public AbstractParser(Parser successor) {
        this.successor = successor;
    }

    public AbstractParser() {
    }

    protected Parser getSuccessor() {
        return successor;
    }

    @Override
    public Composite parse(String text) {
        Composite composite = new Composite();
        String parts[] = text.split(SPLITTER);
        for ( String part : parts ) {
            Composite inner = getSuccessor().parse(part);
            composite.add(inner);
        }
        return composite;

        // throw new UnsupportedOperationException();
    }
//
//    protected String getSplitter() {
//        return SPLITTER;
//    }

    //protected abstract String getSplitter();

}
