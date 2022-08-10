package article.test_task.model.dto.responsedto;

import lombok.Data;
import article.test_task.model.Author;
import article.test_task.model.Journal;
import java.time.LocalDate;

@Data
public class ArticleResponseDto {
    private Long id;
    private String title;
    private String content;
    private LocalDate localDate;
    private Journal journal;
    private Author author;
}
