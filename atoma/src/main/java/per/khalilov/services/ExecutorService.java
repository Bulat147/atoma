package per.khalilov.services;

import per.khalilov.dto.request.ExecutorRequest;
import per.khalilov.dto.request.ExecutorUpdateRequest;
import per.khalilov.dto.response.ExecutorResponse;

import java.util.List;
import java.util.UUID;

public interface ExecutorService {
    List<ExecutorResponse> findAllTaskExecutors(UUID taskId);
    ExecutorResponse addExecutorToTask(ExecutorRequest request);
    void deleteExecutorByTaskIdAndAccountId(UUID taskId, UUID accountId);
    ExecutorResponse updateExecutorById(ExecutorUpdateRequest request);
    void deleteExecutorById(UUID id);
    void deleteAllExecutorsByTaskId(UUID taskId);
}
