package chapterFourteen;

public class SentenceGenerator {
    private String[] articles = {"the", "a", "one", "some","any"};
    private String[] nouns = {"boy", "girl", "dog", "town", "car"};

    public String[] getArticles() {
        return articles;
    }

    public void setArticles(String[] articles) {
        this.articles = articles;
    }

    public String[] getNouns() {
        return nouns;
    }

    public void setNouns(String[] nouns) {
        this.nouns = nouns;
    }

    public String[] getVerbs() {
        return verbs;
    }

    public void setVerbs(String[] verbs) {
        this.verbs = verbs;
    }

    public String[] getPreposition() {
        return preposition;
    }

    public void setPreposition(String[] preposition) {
        this.preposition = preposition;
    }

    private String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
    private String[] preposition = {"to", "from", "over", "under", "on"};
}
