package Spam_filter;

/**
 * Created by SAkopyan on 01.11.16.
 */
public class SpamAnalyzer extends KeywordAnalyzer {

    private String[] keywords;

    public SpamAnalyzer(String[] inSpam){
        keywords = inSpam;

    }

    protected String[] getKeywords(){
    return keywords;
    }

    protected Label getlabel(){
        return Label.SPAM;
    }
  }
