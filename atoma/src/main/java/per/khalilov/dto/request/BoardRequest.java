package per.khalilov.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import per.khalilov.models.enums.AccessModeEnum;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardRequest {
    private String title;
    private UUID ownerId;
    private String description;
    private AccessModeEnum accessMode;
//    private UUID defaultListId; -> in the model
}
