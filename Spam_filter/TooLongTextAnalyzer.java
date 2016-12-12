package Spam_filter;

/**
 * Created by SAkopyan on 01.11.16.
 */
public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;
    public TooLongTextAnalyzer(int leght){
        maxLength = leght;
    }

    public Label processText(String text){
        if(text.length()<=maxLength){
            return Label.OK;
        } else {
            return Label.TOO_LONG;
        }
    }
}
