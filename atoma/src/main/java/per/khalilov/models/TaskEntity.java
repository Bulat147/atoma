package per.khalilov.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import per.khalilov.models.enums.TaskPriorityEnum;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class TaskEntity {
    private UUID id;
    private String name;
    private String description;
    private TaskPriorityEnum priority;
    private Date startDate;
    private Date finishDate;
    private Boolean achieved;
    private Date createdDate;
    private Boolean archived;
    private Boolean deleted;
    private List<PersonalTagEntity> personalTags;
    private List<GeneralTagEntity> generalTags;
}
