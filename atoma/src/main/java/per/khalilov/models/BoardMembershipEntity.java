package per.khalilov.models;

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
public class BoardMembershipEntity {
    private UUID id;
    private BoardEntity board;
    private AccountEntity account;
    private MembershipModeEnum mode;
    private Boolean deleted;
}
