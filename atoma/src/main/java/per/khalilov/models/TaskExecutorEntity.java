package per.khalilov.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class TaskExecutorEntity {
    private UUID id;
    private TaskEntity task;
    private AccountEntity executor;
    private Boolean archived;
    private Boolean deleted;
}
