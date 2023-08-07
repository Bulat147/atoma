package per.khalilov.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class ExecutorUpdateRequest {
    private UUID taskId;
    private UUID executorId;
    private Boolean archived;
}
