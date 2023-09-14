package chasebank;

public class Languages {

    private int languageId;
    private String languageName;
    public Languages(){}

    public Languages(int languageId,String languageName){
        this.languageId=languageId;
        this.languageName=languageName;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    /*
        language id-1
        language name-English
     */

    /*
        language id-2
        language name-Nepali
     */

    /*
        language id-3
        language name-French
     */
}
