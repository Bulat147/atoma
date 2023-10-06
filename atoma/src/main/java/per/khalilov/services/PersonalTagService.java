package per.khalilov.services;

import per.khalilov.dto.request.PersonalTagRequest;
import per.khalilov.dto.request.PersonalTagUpdateRequest;
import per.khalilov.dto.response.PersonalTagResponse;

import java.util.List;
import java.util.UUID;

public interface PersonalTagService {
    List<PersonalTagResponse> findAllPersonalTagsByTaskId(UUID taskId);
    List<PersonalTagResponse> findAllByAccountId(UUID accountId);
    PersonalTagResponse createPersonalTag(PersonalTagRequest request);
    void deleteById(UUID id);
    void addPersonalTagToTask(UUID personalTagId, UUID taskId);
    void removePersonalTagFromTask(UUID personalTagId, UUID taskId);
    PersonalTagResponse updatePersonalTag(PersonalTagUpdateRequest request);
}
