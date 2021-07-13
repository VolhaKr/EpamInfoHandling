package com.epam.infohandling.parsing;

import com.epam.infohandling.model.Composite;

import java.util.ArrayList;

public class ParagraphParser extends AbstractParser {

    public ParagraphParser(Parser successor) {
        super(successor);
    }

    @Override
    public Composite parse(String text) {
        Composite composite = new Composite();
        String parts[] = splitParagraphIntoSentences(text);
        for ( String part : parts ) {
            Composite inner = getSuccessor().parse(part);
            composite.add(inner);
        }
        return composite;
    }

    private String[] splitParagraphIntoSentences(String text) {
        //doesn't process sentences ending with ...
        ArrayList<String> sentences = new ArrayList<String>();
        char[] ch = new char[text.length()];
        StringBuilder curSentence = new StringBuilder();

        for ( int i = 0; i < text.length(); i++ ) {
            ch[i] = text.charAt(i);
            if (ch[i] == '?' || ch[i] == '!' || ch[i] == '.' || ch[i] == '!') {
                sentences.add(curSentence.toString());
                sentences.add(String.valueOf(ch[i]));
                i++;
                curSentence = new StringBuilder();
            } else {
                curSentence.append(ch[i]);
            }
        }
        return sentences.toArray(new String[0]);
    }
}
