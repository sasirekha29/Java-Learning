package languages;

class Language{
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
    //contructor that sets each fields to the values passed in
    Language(String langName, int speakers, String regions, String wdOrder){
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = wdOrder;
    }
    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder);
    }
    public static void main(String[] args){
        Language korean = new Language("Korean", 2000000, "north and south korea, some what in china and japan", "Subject-Object-Verb");
        korean.getInfo();

        //instantiate a new Mayan language:
        Mayan kiche = new Mayan("Ki che", 2330000);
        kiche.getInfo();

        //instantiate a new mandarin and burmese language:
        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
        mandarin.getInfo();
        SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
        burmese.getInfo();
    }
}
