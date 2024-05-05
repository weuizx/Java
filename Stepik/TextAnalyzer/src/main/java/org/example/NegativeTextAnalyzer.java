package org.example;

class NegativeTextAnalyzer extends KeywordAnalyzer {
    private final Label label;
    private final String[] keywords;
    public NegativeTextAnalyzer(){
        this.keywords  = new String[] {":(", "=(", ":|"};
        this.label = Label.NEGATIVE_TEXT;
    }
    @Override
    protected String[] getKeywords(){
        return keywords;
    }
    @Override
    protected Label getLabel(){
        return label;
    }
}
