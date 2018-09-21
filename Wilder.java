public class Wilder {

    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname=firstname;
    }

    public boolean isAware(){
        return this.aware;
    }

    public void setAwareness(boolean aware){
        this.aware=aware;
    }

    public String whoAmI(){
        String phrase = "Je m'appelle "+this.firstname;
        phrase += aware ? " et je suis aware" : " et je ne suis pas aware";
        return phrase;
        
    }
}

