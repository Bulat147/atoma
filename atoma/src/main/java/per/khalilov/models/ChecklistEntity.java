package per.khalilov.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChecklistEntity {
    private UUID id;
    private String title;
    private TaskEntity parentTask;
    private Integer ordInParentTask;
    private Boolean archived;
    private Boolean deleted;
}
