package per.khalilov.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import per.khalilov.models.enums.TagColorEnum;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonalTagEntity {
    private UUID id;
    private AccountEntity account;
    private String name;
    private TagColorEnum color;
    private Boolean archived;
    private Boolean deleted;
}
