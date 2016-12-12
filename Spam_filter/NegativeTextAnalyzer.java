package Spam_filter;

/**
 * Created by SAkopyan on 01.11.16.
 */
public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private String[] keywords = {":(","=(",":|"};

    protected String[] getKeywords(){
        return keywords;
    }

    protected Label getlabel(){
        return Label.NEGATIVE_TEXT;
    }
}
