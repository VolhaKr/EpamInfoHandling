package com.epam.infohandling.parsing;

import com.epam.infohandling.model.Composite;

public class TextParser extends AbstractParser {

    private static final String SPLITTER = "\n";

    public TextParser(Parser successor) {
        super(successor);
    }

    @Override
    protected String getSplitter() {
        return SPLITTER;
    }
}
