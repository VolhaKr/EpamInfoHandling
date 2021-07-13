package com.epam.infohandling.parsing;

import com.epam.infohandling.model.Composite;

public abstract class AbstractParser implements Parser {

    private Parser successor;

    public AbstractParser(Parser successor) {
        this.successor = successor;
    }

    public AbstractParser() {

    }

    protected Parser getSuccessor() {
        return successor;
    }

}
