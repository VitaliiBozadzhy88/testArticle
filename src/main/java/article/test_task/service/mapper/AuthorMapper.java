package article.test_task.service.mapper;

import article.test_task.model.Author;
import article.test_task.model.dto.requestdto.AuthorRequestDto;
import article.test_task.model.dto.responsedto.AuthorResponseDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class AuthorMapper {
    public Author toModel(@RequestBody AuthorRequestDto authorRequestDto) {
        Author author = new Author();
        author.setFirstName(authorRequestDto.getAuthorsFirstName());
        author.setLastName(authorRequestDto.getAuthorsLastName());
        return author;
    }

    public AuthorResponseDto toDto(@RequestBody Author author) {
        AuthorResponseDto authorResponseDto = new AuthorResponseDto();
        authorResponseDto.setId(author.getId());
        authorResponseDto.setAuthorsFirstName(author.getFirstName());
        authorResponseDto.setAuthorsLastName(author.getLastName());
        return authorResponseDto;
    }
}
