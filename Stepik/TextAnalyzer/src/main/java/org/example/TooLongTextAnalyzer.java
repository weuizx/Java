package org.example;

class TooLongTextAnalyzer implements TextAnalyzer
{
    private final int maxLength;
    public TooLongTextAnalyzer(int i){
        this.maxLength = i;
    }
    @Override
    public Label processText(String text) {
        if(text.length() > maxLength) {
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}
