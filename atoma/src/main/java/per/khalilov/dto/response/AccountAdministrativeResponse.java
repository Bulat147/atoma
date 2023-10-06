package per.khalilov.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import per.khalilov.models.enums.AccountRoleEnum;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountAdministrativeResponse {
    private UUID id;
    private String username;
    private String email;
    private String photoPath;
    private Date signUpDate;
    private Boolean active;
    private AccountRoleEnum role;
}
