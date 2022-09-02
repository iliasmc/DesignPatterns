package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class BBCNews extends NewsAgency{
    private List<String> bbcArticles = new ArrayList<>();

    @Override
    public void addArticle(String article){
        bbcArticles.add(article);
        notifyAll("BBC:" + article);
    }

    @Override
    void removeArticle(String article) {
        bbcArticles.remove(article);
    }

}
