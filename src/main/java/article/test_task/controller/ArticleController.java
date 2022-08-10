package article.test_task.controller;

import article.test_task.model.Article;
import article.test_task.model.Author;
import article.test_task.model.Journal;
import article.test_task.model.dto.responsedto.ArticleResponseDto;
import article.test_task.repository.ArticleRepository;
import article.test_task.service.ArticleService;
import article.test_task.service.mapper.ArticleMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/articles")
public class ArticleController {
    private final ArticleRepository articleRepository;
    private final ArticleService articleService;
    private final ArticleMapper articleMapper;

    public ArticleController(ArticleRepository articleRepository, ArticleService articleService, ArticleMapper articleMapper) {
        this.articleRepository = articleRepository;
        this.articleService = articleService;
        this.articleMapper = articleMapper;
    }

    @GetMapping("/inject")
    public String saveArticles() {
        Article article = new Article();
        article.setTitle("Title One");
        article.setContent("Content for first article");
        LocalDate localDate = LocalDate.of(2010, 1, 1);
        article.setLocalDate(localDate);
        Journal journal = new Journal();
        journal.setTitle("First journal Title");
        article.setJournal(journal);
        Author author = new Author();
        author.setFirstName("Bob");
        author.setLastName("Bobinson");
        article.setAuthor(author);
        articleRepository.save(article);

        Article article2 = new Article();
        article2.setTitle("Title Two");
        article2.setContent("Content for second article");
        LocalDate localDate2 = LocalDate.of(2016, 1, 1);
        article2.setLocalDate(localDate2);
        Journal journal1 = new Journal();
        journal1.setTitle("Second journal Title");
        article2.setJournal(journal1);
        Author author2 = new Author();
        author2.setFirstName("Vitalii");
        author2.setLastName("Bozadzhy");
        article2.setAuthor(author2);
        articleRepository.save(article2);

        Article article3 = new Article();
        article3.setTitle("Title Three");
        article3.setContent("Content for third article");
        LocalDate localDate3 = LocalDate.of(2020, 1, 1);
        article3.setLocalDate(localDate3);
        Journal journal3 = new Journal();
        journal3.setTitle("Third journal Title");
        article3.setJournal(journal3);
        Author author3 = new Author();
        author3.setFirstName("Aliexa");
        author3.setLastName("Bozadzhy");
        article3.setAuthor(author3);
        articleRepository.save(article3);

        Article article4 = new Article();
        article4.setTitle("Title Four");
        article4.setContent("Content for fourth article");
        LocalDate localDate4 = LocalDate.of(2019, 1, 1);
        article4.setLocalDate(localDate4);
        Journal journal4 = new Journal();
        journal4.setTitle("Fourth journal Title");
        article4.setJournal(journal4);
        Author author4 = new Author();
        author4.setFirstName("Alisa");
        author4.setLastName("Alison");
        article4.setAuthor(author4);
        articleRepository.save(article4);

        return "👉 New articles: where added SUCCESSFULLY!";
    }

    @GetMapping("/{id}")
    public ArticleResponseDto finById(@PathVariable Long id) {
        return articleMapper.toDto(articleService.findById(id).get());
    }

    @GetMapping("/getAll")
    public List<ArticleResponseDto> findAll() {
        return articleRepository.findAll().stream()
                .sorted(Comparator.comparing(Article::getLocalDate)
                        .reversed()
                        .thenComparing(Article::getLocalDate))
                .map(articleMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/byDate/from{from}/to{to}")
    public List<ArticleResponseDto> findAllDateBetween (@PathVariable String from,
                                                        @PathVariable String to) {
        from = String.valueOf(LocalDate.parse(from));
        to = String.valueOf(LocalDate.parse(to));
        return articleRepository.findArticlesByLocalDateBetween(LocalDate.parse(from),
                        LocalDate.parse(to)).stream()
                .map(articleMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/by-title/{keyWord}")
    public List<ArticleResponseDto> findByKeyWordTitle(@PathVariable String keyWord) {
        return articleRepository.findArticlesByTitleContaining(keyWord).stream()
                .map(articleMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/by-content/{keyWord}")
    public List<ArticleResponseDto> findByKeyWordContent(@PathVariable String keyWord) {
        return articleRepository.findArticlesByContentContaining(keyWord).stream()
                .map(articleMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/create/{title}/{content}/{journalTitle}/{authorName}/{authorLastName}/{localDate}")
    public String getA(@PathVariable String title,
                        @PathVariable String content,
                        @PathVariable String journalTitle,
                        @PathVariable String authorName,
                        @PathVariable String authorLastName,
                        @PathVariable String localDate) {
        Article article = new Article();

        Journal journal1 = new Journal();
        journal1.setTitle(journalTitle);

        Author author1 = new Author();
        author1.setFirstName(authorName);
        author1.setLastName(authorLastName);

        localDate = String.valueOf(LocalDate.parse(localDate));

        article.setTitle(title);
        article.setContent(content);
        article.setJournal(journal1);
        article.setAuthor(author1);
        article.setLocalDate(LocalDate.parse(localDate));
        articleRepository.save(article);

        articleService.findAll().forEach(System.out::println);
        return "Article: " + article.getTitle() +", "+ article.getAuthor() + " was added successful!";
    }

    @GetMapping("/delete{id}")
    public String delete(@PathVariable Long id) {
        articleRepository.deleteById(id);
        return "👉 Article with ID - " + id + " was deleted successfully! 🗑";
    }
}
