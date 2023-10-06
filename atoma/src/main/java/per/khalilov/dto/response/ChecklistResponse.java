package per.khalilov.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChecklistResponse {
    private UUID id;
    private String title;
    private UUID parentTaskId;
    private Integer ordInParentTask;
    private Boolean archived;
}
