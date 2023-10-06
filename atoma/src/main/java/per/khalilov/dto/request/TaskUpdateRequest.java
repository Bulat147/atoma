package per.khalilov.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import per.khalilov.models.enums.TaskPriorityEnum;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskUpdateRequest {
    private UUID id;
    private String name;
    private String description;
    private TaskPriorityEnum priority;
    private Date startDate;
    private Date finishDate;
}
