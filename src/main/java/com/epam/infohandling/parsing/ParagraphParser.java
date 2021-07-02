package com.epam.infohandling.parsing;

import com.epam.infohandling.model.Composite;

public class ParagraphParser extends AbstractParser {
    SPLITTER = "[.|!|?|...]]";

    public ParagraphParser(Parser successor) {
        super(successor);
    }
}
