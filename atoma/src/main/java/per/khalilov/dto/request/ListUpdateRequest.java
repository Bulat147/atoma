package per.khalilov.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ListUpdateRequest {
    private UUID id;
    private String title;
    private UUID boardId;
    private Integer ordInBoard;
    private Boolean archived;
}
