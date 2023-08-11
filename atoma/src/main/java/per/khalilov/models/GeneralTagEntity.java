package per.khalilov.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import per.khalilov.models.enums.TagColorEnum;

import java.util.UUID;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class GeneralTagEntity {
    private UUID id;
    private BoardEntity board;
    private String name;
    private TagColorEnum color;
    private Boolean archived;
    private Boolean deleted;
}
