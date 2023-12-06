package poo.Ejercicio2_11;

import java.util.Arrays;

public class ArticuloCientifico {

    private String nameArticle;
    private String nameAuthor;
    private String [] keyWords = new String[3];
    private String publicationName;




    private int year;
    private String summary;

    public ArticuloCientifico(String nameAuthor, String publicationName) {
        this.nameAuthor = nameAuthor;
        this.publicationName = publicationName;
    }

    public ArticuloCientifico(String nameAuthor, String[] keyWords, String publicationName, int year) {
        this(nameAuthor,publicationName);
        this.keyWords = keyWords;
        this.year = year;
    }
    public ArticuloCientifico(String nameArticle, String nameAuthor, String[] keyWords, String publicationName, int year, String summary) {
        this(nameAuthor,keyWords,publicationName,year);
        this.nameArticle = nameArticle;
        this.summary = summary;
    }

    public String getNameArticle() {
        return nameArticle;
    }

    public void setNameArticle(String nameArticle) {
        this.nameArticle = nameArticle;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String[] getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String[] keyWords) {
        this.keyWords = keyWords;
    }

    public String getPublicationName() {
        return publicationName;
    }

    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }


    @Override
    public String toString() {
        return "ArticuloCientifico{" +
                "nameArticle='" + nameArticle + '\'' +
                ", nameAuthor='" + nameAuthor + '\'' +
                ", keyWords=" + Arrays.toString(keyWords) +
                ", publicationName='" + publicationName + '\'' +
                ", year=" + year +
                ", summary='" + summary + '\'' +
                '}';
    }
}
