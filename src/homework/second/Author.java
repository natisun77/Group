package homework.second;

import java.util.ArrayList;
import java.util.List;

//2.4
public final class Author {
    final private int pages;
    final private String name;
    final private List<Story> stories;

    public Author(int pages, String name, ArrayList<Story> stories) {
        this.pages = pages;
        this.name = name;
        this.stories = (stories == null) ? null : new ArrayList<Story>(stories);
    }

    public int getPages() {
        return pages;
    }

    public String getName() {
        return name;
    }

    public List<Story> getStories() {
        return (stories==null)?null: new ArrayList<Story>(stories);
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
