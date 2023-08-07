package per.khalilov.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import per.khalilov.models.enums.TagColorEnum;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GeneralTagResponse {
    private UUID id;
    private UUID boardID;
    private String name;
    private TagColorEnum color;
    private Boolean archived;
}
