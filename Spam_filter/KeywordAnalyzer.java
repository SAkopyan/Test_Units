package Spam_filter;

/**
 * Created by SAkopyan on 01.11.16.
 */
public abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords();

    protected abstract Label getlabel();

    public Label processText(String text) {
            int q = 0;
            for (int i = 0; i<getKeywords().length; i++){
                if(text.indexOf(getKeywords()[i])!=-1){
                    q=1;
                    break;
                }
            }
            if(q!=1){
                return Label.OK;
            } else {
                return getlabel();
            }
        }


}