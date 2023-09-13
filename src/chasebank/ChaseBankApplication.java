package chasebank;

public class ChaseBankApplication {


    public static  void main(String[] args){

        new Menu();

        Languages english = new Languages();
        english.setLanguageId(1);
        english.setLanguageName("English");

        Languages nepali = new Languages();
        nepali.setLanguageId(2);
        nepali.setLanguageName("Nepali");

        Languages french = new Languages();
        french.setLanguageId(3);
        french.setLanguageName("French");

        Menu personalMenu = new Menu();
        personalMenu.setMenuId(1);
        personalMenu.setMenuName("Personal");
        personalMenu.setSlug("");
        personalMenu.setExternal(false);
        personalMenu.setExternalURL(null);
        personalMenu.setActive(true);
        personalMenu.setLanguageId(english.getLanguageId());

        personalMenu.toString();

        Menu personalNepali = new Menu();
        personalNepali.setMenuId(2);
        personalNepali.setMenuName("Personal NP");
        personalNepali.slug="";
        personalNepali.isExternal=false;
        personalNepali.externalURL=null;
        personalNepali.isActive=true;
        personalNepali.setLanguageId(nepali.getLanguageId());

        personalNepali.toString();

        Menu businessMenu = new Menu();
        Menu commercialMenu = new Menu();

    }
}
