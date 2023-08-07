package per.khalilov.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import per.khalilov.models.enums.MembershipModeEnum;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PermitRequest {
    private java.util.UUID boardId;
    private UUID accountId;
    private MembershipModeEnum mode;
}
