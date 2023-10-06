package per.khalilov.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import per.khalilov.models.enums.MembershipModeEnum;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PermitRequestResponse {
    private UUID id;
    private UUID boardId;
    private UUID accountId;
    private MembershipModeEnum mode;
    private Boolean answer;
    private Date createdDate;
}
