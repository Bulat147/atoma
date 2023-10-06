package per.khalilov.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExecutorResponse {
    private UUID id;
    private UUID taskId;
    private UUID executorId;
    private Boolean archived;
}
