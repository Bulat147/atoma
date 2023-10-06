package per.khalilov.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CommentEntity {
    private UUID id;
    private TaskEntity task;
    private AccountEntity author;
    private String comment;
    private Date createdDate;
    private Boolean archived;
    private Boolean deleted;
}
