package home.netology.javabase.OOP.inheritance.booksgenre.bookcontent;

import home.netology.javabase.OOP.inheritance.booksgenre.GenreEnum;

public class DetectiveGenre extends GenreByContent{
    public DetectiveGenre(String attribute) {
        super(attribute);
    }

    @Override
    public String getGenreName() {
        return GenreEnum.DETECTIVE.name();
    }

}
