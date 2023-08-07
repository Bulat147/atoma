package per.khalilov.services;

import per.khalilov.dto.request.ChecklistRequest;
import per.khalilov.dto.request.ChecklistUpdateRequest;
import per.khalilov.dto.response.ChecklistResponse;

import java.util.List;
import java.util.UUID;

public interface ChecklistService {
    List<ChecklistResponse> findAllByTaskId(UUID taskId);
    ChecklistResponse findById(UUID id);
    ChecklistResponse createChecklist(ChecklistRequest request);
    void deleteById(UUID id);
    ChecklistResponse updateChecklistById(ChecklistUpdateRequest request);
}
