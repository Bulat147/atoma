package per.khalilov.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ListEntity {
    private UUID id;
    private String title;
    private BoardEntity board;
    private Integer ordInBoard;
    private Boolean defaultList;
    private Boolean archived;
    private Boolean deleted;
    // Можно ли как-то менять промежуточнык таблицы для ManyToMany
    // Если можно - тогда убрать ListTaskRelationEntity и ChecklistTaskRelationEntity
}
