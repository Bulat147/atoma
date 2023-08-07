package per.khalilov.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import per.khalilov.models.enums.TagColorEnum;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GeneralTagUpdateRequest {
    private UUID id;
    private UUID boardID;
    private String name;
    private TagColorEnum color;
    private Boolean archived;
}
