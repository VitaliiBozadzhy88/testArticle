package article.test_task.service;

import article.test_task.model.Journal;
import java.util.List;

public interface JournalService {
    Journal create(Journal journal);

    Journal getById(Long id);

    List<Journal> getAll();

    Journal update(Journal journal);

    void delete(Long id);
}
