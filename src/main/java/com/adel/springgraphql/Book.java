package com.adel.springgraphql;

import lombok.*;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Book {

    private String id;
    private String name;
    private int pageCount;
    private String authorId;

    private static List<Book> books = Arrays.asList(
            new Book("book-1", "Harry Potter and the Philosopher's Stone", 223, "author-1"),
            new Book("book-2", "Moby Dick", 635, "author-2"),
            new Book("book-3", "Interview with the vampire", 371, "author-3")
    );

    public static Book getById(String id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
    }

}
