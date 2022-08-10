package article.test_task.service.mapper;

import article.test_task.model.Article;
import article.test_task.model.dto.requestdto.ArticleRequestDto;
import article.test_task.model.dto.responsedto.ArticleResponseDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class ArticleMapper {
    public Article toModel(@RequestBody ArticleRequestDto articleRequestDto) {
        Article article = new Article();
        article.setTitle(articleRequestDto.getTitle());
        article.setContent(articleRequestDto.getContent());
        article.setLocalDate(articleRequestDto.getLocalDate());
        article.setJournal(articleRequestDto.getJournal());
        return article;
    }

    public ArticleResponseDto toDto(@RequestBody Article article) {
        ArticleResponseDto articleResponseDto = new ArticleResponseDto();
        articleResponseDto.setId(article.getId());
        articleResponseDto.setContent(article.getContent());
        articleResponseDto.setTitle(article.getTitle());
        articleResponseDto.setLocalDate(article.getLocalDate());
        articleResponseDto.setJournal(article.getJournal());
        return articleResponseDto;
    }
}
