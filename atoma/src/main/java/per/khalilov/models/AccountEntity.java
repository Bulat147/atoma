package per.khalilov.models;

import jakarta.persistence.*;
import lombok.*;
import per.khalilov.models.enums.AccountRoleEnum;

import javax.annotation.processing.Generated;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "account")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID, generator = "uuid")

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
