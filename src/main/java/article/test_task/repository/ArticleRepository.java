package article.test_task.repository;

import article.test_task.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    public List<Article> findArticlesByLocalDateBetween(LocalDate from, LocalDate to);

    public List<Article> findArticlesByTitleContaining(String keyWord);

    public List<Article> findArticlesByContentContaining(String keyWord);
}
