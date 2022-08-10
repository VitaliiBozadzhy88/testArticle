package article.test_task.model.dto.requestdto;

import java.time.LocalDate;
import lombok.Data;
import article.test_task.model.Author;
import article.test_task.model.Journal;

@Data
public class ArticleRequestDto {
    private String title;
    private String content;
    private LocalDate localDate;
    private Journal journal;
    private Author author;
}
