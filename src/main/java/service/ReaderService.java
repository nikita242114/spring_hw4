package service;



import model.Issue;
import model.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IssueRepository;
import repository.ReaderRepository;

import java.util.List;

@Service
public class ReaderService {

    private final ReaderRepository readerRepository;
    private final IssueRepository issueRepository;

    @Autowired
    public ReaderService(ReaderRepository readerRepository, IssueRepository issueRepository) {
        this.readerRepository = readerRepository;
        this.issueRepository = issueRepository;
    }

    // получить читателя по id
    public Reader getReaderById(Long id) {
        return readerRepository.getReaderById(id);
    }

    //получить список всех читателей
    public List<Reader> getAllReaders() {
        return readerRepository.getAllReaders();
    }

    // создание читателя
    public Reader addReader(Reader reader) {
        return readerRepository.addReader(reader);
    }

    //обновление читателей
    public Reader updateReaders(Long id, Reader reader) {
        return readerRepository.updateReaders(id, reader);
    }

    // удаление читателя
    public void deleteReader(Long id) {
        readerRepository.deleteReader(id);
    }

    //получить список выдач по id читателя
    public List<Issue> getAllIssueByReaderId(Long id) {
        return issueRepository.getAllIssueByReaderId(id);
    }

}