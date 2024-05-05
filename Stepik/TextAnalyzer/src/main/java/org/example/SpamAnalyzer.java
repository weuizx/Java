package org.example;

class SpamAnalyzer extends KeywordAnalyzer{
    private final Label label;
    private final String[] keywords;

    public SpamAnalyzer(String[] args) {
        this.keywords = args;
        this.label = Label.SPAM;
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
