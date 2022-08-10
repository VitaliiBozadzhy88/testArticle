package article.test_task.service.mapper;

import article.test_task.model.Journal;
import article.test_task.model.dto.requestdto.JournalRequestDto;
import article.test_task.model.dto.responsedto.JournalResponseDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class JournalMapper {
    public Journal toModel(@RequestBody JournalRequestDto journalRequestDto) {
        Journal journal = new Journal();
        journal.setTitle(journalRequestDto.getJournalTitle());
        return journal;
    }

    public JournalResponseDto toDto(@RequestBody Journal journal) {
        JournalResponseDto journalResponseDto = new JournalResponseDto();
        journalResponseDto.setId(journal.getId());
        journalResponseDto.setJournalTitle(journal.getTitle());
        return journalResponseDto;
    }
}
