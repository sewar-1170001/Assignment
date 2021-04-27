package sewar_1170001.android.aaaignment1.model;

public class cv {
    private String specialize;
    private String language;
    private String skills;
    private String INFO;

    public cv(String specialize, String language, String skills, String INFO) {
        this.specialize = specialize;
        this.language = language;
        this.skills = skills;
        this.INFO = INFO;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getINFO() {
        return INFO;
    }

    public void setINFO(String INFO) {
        this.INFO = INFO;
    }
}
