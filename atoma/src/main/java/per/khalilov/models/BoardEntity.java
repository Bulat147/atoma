package per.khalilov.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import per.khalilov.models.enums.AccessModeEnum;

import java.util.Date;
import java.util.UUID;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardEntity {
    private UUID id;
    private String title;
    private AccountEntity owner;
    private String description;
    private AccessModeEnum accessMode;
    private Date createdDate;
    private Boolean archived;
    private Boolean deleted;
}
