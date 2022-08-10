package article.test_task.model.dto.responsedto;

import lombok.Data;

@Data
public class AuthorResponseDto {
    private Long id;
    private String authorsFirstName;
    private String authorsLastName;
}
