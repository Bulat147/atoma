package per.khalilov.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskListRelationEntity {
    private UUID id;
    private TaskEntity task;
    private ListEntity list;
    private Integer ordInList;
    private Boolean archived;
    private Boolean deleted;
}
