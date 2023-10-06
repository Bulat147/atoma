package per.khalilov.dto.request;

import java.util.UUID;

public class ChangeOrdOfTaskInChecklistRequest {
    private UUID taskId;
    private UUID checklistId;
    private Integer newOrd;
}
