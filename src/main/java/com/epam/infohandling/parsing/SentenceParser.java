package com.epam.infohandling.parsing;

import com.epam.infohandling.model.Component;
import com.epam.infohandling.model.Composite;

public class SentenceParser extends AbstractParser {


    private static final String SPLITTER = "[[ ]*|[,]*|[:]*|[/]*|[+]*]+\"";

    public SentenceParser(Parser successor) {
        super(successor);
    }

    public SentenceParser() {

        super();
    }

//    String strPattern = "[^A-Za-zА-Яа-я]+";
//    CustomerSortingComparator comp = new CustomerSortingComparator();
//    Scanner scanner = new Scanner(System.in, "UTF-8").useDelimiter(strPattern);
//
//       Stream.of(scanner).forEach(System.out::println);

//    String strPattern = "[^A-Za-zА-Яа-я0-9]+";
//    ArrayList<String> words = new ArrayList();
//    Scanner scanner = new Scanner(System.in, "UTF-8").useDelimiter(strPattern);
//
//        while (scanner.hasNext()) {
//        try {
//            String nextValue = scanner.next();
//            words.add(nextValue);
//        } catch (Exception e) {
//        }
//    }
//    @Override
//    public Composite parse(String text) {
//        Composite composite = new Composite();
//        String parts[] = text.split(SPLITTER);
//        for ( String part : parts ) {
//            Composite inner = getSuccessor().parse(part);
//            composite.add(inner);
//        }
//        return composite;


    @Override
    public Composite parse(String text) {
        throw new UnsupportedOperationException();
    }



    @Override
    public void remove(Component component) {
        System.out.println("Component -> remove component");
        components.remove(component);
    }
}