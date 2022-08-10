package article.test_task.service.impl;

import article.test_task.model.Journal;
import article.test_task.repository.JournalRepository;
import article.test_task.service.JournalService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JournalServiceImpl implements JournalService {
    private final JournalRepository journalRepository;

    public JournalServiceImpl(JournalRepository journalRepository) {
        this.journalRepository = journalRepository;
    }

    @Override
    public Journal create(Journal journal) {
        return journalRepository.save(journal);
    }

    @Override
    public Journal getById(Long id) {
        return journalRepository.getById(id);
    }

    @Override
    public List<Journal> getAll() {
        return journalRepository.findAll();
    }

    @Override
    public Journal update(Journal journal) {
        return journalRepository.save(journal);
    }

    @Override
    public void delete(Long id) {
        journalRepository.deleteById(id);
    }
}
