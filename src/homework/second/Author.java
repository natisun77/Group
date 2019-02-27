package homework.second;

import java.util.ArrayList;
import java.util.List;
//2.4
public final class Author {
    final private int pages;
    final private String name;
    final private List<Story> stories;

    public int getPages() {
        return pages;
    }

    public String getName() {
        return name;
    }

    public List<Story> getStories() {
        return new ArrayList<Story>(stories);
    }

    public Author(int pages, String name, ArrayList<Story> stories) {
        this.pages = pages;
        this.name = name;
        this.stories = new ArrayList<Story>(stories);
        if (stories==null){
            ArrayList<Story> listOfStory = new ArrayList<Story>();
        }
    }

    public final static class Story {
        final private String name;
        final private int year;

        public Story(String name, int year) {
            this.name = name;
            this.year = year;
        }
    }
}
