package article.test_task.model;

import lombok.Data;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "Articles")
@Data
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private LocalDate localDate;

    @OneToOne(cascade = CascadeType.ALL)
    private Journal journal;

    @OneToOne(cascade = CascadeType.ALL)
    private Author author;
}
