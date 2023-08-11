package per.khalilov.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TaskChecklistRelationEntity {
    private UUID id;
    private TaskEntity task;
    private ChecklistEntity checklist;
    private Integer ordInChecklist;
    private Boolean archived;
    private Boolean deleted;
}
