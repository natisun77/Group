package homework.second;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//2.4
public final class Author {
    final private int pages;
    final private String name;
    final private List<Story> stories;

    public Author(int pages, String name, List<Story> stories) {
        if (stories == null) {
            this.stories = Collections.emptyList();
        } else {
            this.stories = new ArrayList<Story>(stories);
        }
        this.pages = pages;
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public String getName() {
        return name;
    }

    public List<Story> getStories() {
        return new ArrayList<Story>(stories);
    }

    public final static class Story {
        final private String name;
        final private int year;

        public Story(String name, int year) {
            this.name = name;
            this.year = year;
        }
    }

    public static void main(String[] args) {
        ArrayList<Story> stories = new ArrayList<>();
        Author author = new Author(10, "Abc", stories);
    }
}
