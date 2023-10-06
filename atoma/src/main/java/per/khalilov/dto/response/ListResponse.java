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
public class ListResponse {
    private UUID id;
    private String title;
    private UUID boardId;
    private Integer ordInBoard;
    private Boolean defaultList;
    private Boolean archived;
}
