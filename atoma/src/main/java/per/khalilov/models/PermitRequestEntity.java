package per.khalilov.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import per.khalilov.models.enums.AccessModeEnum;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class PermitRequestEntity {
    private UUID id;
    private BoardEntity board;
    private AccountEntity account;
    private AccessModeEnum mode;
    private Boolean answer;
    private Date createdDate;
    private Boolean deleted;
}
