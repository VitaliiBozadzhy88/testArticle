package article.test_task.service.impl;

import article.test_task.model.Article;
import article.test_task.repository.ArticleRepository;
import article.test_task.service.ArticleService;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<Article> inject(Article article) {
        return null;
    }

    @Override
    public Article save(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article update(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public List<Article> findAll() {
        return articleRepository.findAll();
    }


    @Override
    public Optional<Article> findById(Long id) {
        return articleRepository.findById(id);
    }

    @Override
    public List<Article> getByBetweenData(LocalDate from, LocalDate to) {
        return articleRepository.findArticlesByLocalDateBetween(from, to);
    }

    @Override
    public List<Article> getByKeyWord(String keyword) {
        return articleRepository.findArticlesByTitleContaining(keyword);
    }

    @Override
    public void remove(Long id) {
        articleRepository.deleteById(id);
    }
}
