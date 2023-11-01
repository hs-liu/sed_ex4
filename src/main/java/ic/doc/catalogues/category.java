package ic.doc.catalogues;

import java.util.List;

import ic.doc.Book;

/**
 * category
 */
public interface category {
    public List<Book> searchFor(String query);
    public static category getInstance();
} 
