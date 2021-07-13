package com.epam.infohandling.parsing;

import com.epam.infohandling.model.Composite;
import com.epam.infohandling.model.Leaf;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.notNull;
import static org.mockito.Mockito.when;

public class TextParserTest {
 @Test
    public void testTextParseShouldReturnparagraphs() {
     Parser successor = Mockito.mock(Parser.class);
     when(successor.parse(anyString())).thenAnswer(invocation -> {
         String argument = (String) invocation.getArguments()[0];
         //return new Leaf((String)invocation.getArguments()[0]));
         return new Leaf(argument);
     });
     TextParser textParser = new TextParser(successor);
     Composite composite = textParser.parse("1\n2");
     Assert.assertEquals(new Leaf("1"), composite.getChild(0));
     Assert.assertEquals(new Leaf("2"), composite.getChild(0));

 }


    }
// @Test
//when(successor.parse(anyString())).thenReturn("This is a text \n" +
//                                                      "This is also a text \n"
//                                                      +"This is the 3d paragraph");
//    public void testTextParseShouldReturnparagraphs(){
//        Parser successor = Mockito.mock (Parser.class);
//    when(successor.parse(anyString())).thenReturn("This is a text \n" +
//            "This is also a text \n"
//            +"This is the 3d paragraph");
//        String text =  "This is a text \n" +
//                "This is also a text \n"
//    +"This is the 3d paragraph";
//        Composite expectedValue = new Composite();
//        Composite parsedVAlue =
//    Parser successor = Mockito.mock (Parser.class);
//    when(successor.parse(anyString())).thenAnswer(invocation -> {
//        String argument = (String)invocation.getArguments()[0];
//    //return new Leaf((String)invocation.getArguments()[0]));
//    return new Leaf(argument);
//    });
//    TextParser textParser = new TextParser(successor);
//    Composite composite = textParser.parse("1\n2");
//        Assert.assertEquals(new Leaf("1"), composite.getChild(0));
//        Assert.assertEquals(new Leaf("2"), composite.getChild(0));



//        public Composite parse(String text) {
//            Composite composite = new Composite();
//            String parts[] = text.split(getSplitter());
//            for ( String part : parts ) {
//                Composite inner = getSuccessor().parse(part);
//                composite.add(inner);
//            }
//            return composite;

