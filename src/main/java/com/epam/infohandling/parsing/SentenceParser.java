package com.epam.infohandling.parsing;

import com.epam.infohandling.model.Component;
import com.epam.infohandling.model.Composite;
import com.epam.infohandling.model.Leaf;

import static com.epam.infohandling.model.LeafType.*;

public class SentenceParser extends AbstractParser {
    private static final String SPLITTER = " ";

    public SentenceParser(Parser successor) {
        super(successor);
    }

    public SentenceParser() {
        super();
    }


    @Override
    public Composite parse(String text) {
        Composite composite = new Composite();
        int j;
        StringBuilder curWord = new StringBuilder();
        char[] currentChar = new char[text.length()];

        if ((text.matches("[ ?!/.!]") || text.equals(" "))) {
            composite.add(new Leaf(text, SYMBOL));
        } else {
            for ( int i = 0; i < text.length(); ) {
                currentChar[i] = text.charAt(i);
                if (currentChar[i] == '[') {
                    j = text.indexOf("]", i);
                    composite.add(new Leaf(text.substring(i, j + 1), EXPRESSION));
                    i = j + 1;
                } else {
                    curWord.append(currentChar[i]);
                    if (currentChar[i] == '-' || currentChar[i] == ':' || currentChar[i] == ';'
                            || currentChar[i] == '(' || currentChar[i] == ')' || currentChar[i] == ' ') {
                        composite.add(new Leaf(curWord.toString(), WORD));
                        curWord = new StringBuilder();
                    }
                    i++;
                }
            }
        }
        return composite;
    }
}
