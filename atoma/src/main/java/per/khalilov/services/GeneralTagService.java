package per.khalilov.services;

import per.khalilov.dto.request.GeneralTagRequest;
import per.khalilov.dto.request.GeneralTagUpdateRequest;
import per.khalilov.dto.response.GeneralTagResponse;

import java.util.List;
import java.util.UUID;

public interface GeneralTagService {
    List<GeneralTagResponse> findAllGeneralTagsByTaskId(UUID taskId);
    List<GeneralTagResponse> findAllByAccountId(UUID accountId);
    GeneralTagResponse createGeneralTag(GeneralTagRequest request);
    void deleteById(UUID id);
    void addGeneralTagToTask(UUID GeneralTagId, UUID taskId);
    void removeGeneralTagFromTask(UUID GeneralTagId, UUID taskId);
    GeneralTagResponse updateGeneralTag(GeneralTagUpdateRequest request);
}
