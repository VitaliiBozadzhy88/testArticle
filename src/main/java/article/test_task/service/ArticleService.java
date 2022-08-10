package article.test_task.service;

import article.test_task.model.Article;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ArticleService {
    List<Article> inject(Article article);

    Article save(Article article);

    Article update(Article article);

    List<Article> findAll();

    Optional<Article> findById(Long id);

    List<Article> getByBetweenData(LocalDate from, LocalDate  to);

    List<Article> getByKeyWord (String keyword);

    void remove(Long id);
}
