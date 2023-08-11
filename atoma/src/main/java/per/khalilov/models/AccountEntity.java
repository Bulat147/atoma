package per.khalilov.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import per.khalilov.models.enums.AccountRoleEnum;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountEntity {
    private UUID id;
    private String username;
    private Boolean active;
    private AccountRoleEnum role;
    private String email;
    private String hashPassword;
    private String photoPath;
    private Date signUpDate;
    private Boolean deleted;
    private List<BoardEntity> favoriteBoards;
}
