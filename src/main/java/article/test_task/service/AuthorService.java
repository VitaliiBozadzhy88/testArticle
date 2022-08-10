package article.test_task.service;

import article.test_task.model.Author;

import java.util.List;

public interface AuthorService {
    Author save(Author author);

    Author getById(Long id);

    List<Author> getAll();

    Author update(Author author);

    void remove(Long id);
}
