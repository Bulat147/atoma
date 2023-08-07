package per.khalilov.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import per.khalilov.models.enums.AccessModeEnum;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardResponse {
    private UUID id;
    private String title;
    private UUID ownerId;
    private String description;
    private AccessModeEnum accessMode;
    private UUID defaultListId;
    private Date createdDate;
    private Boolean archived;
//    private List<ListResponse> lists;
}
