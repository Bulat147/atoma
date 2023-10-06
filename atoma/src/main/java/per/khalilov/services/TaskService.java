package per.khalilov.services;

import per.khalilov.dto.request.*;
import per.khalilov.dto.response.TaskResponse;

import java.util.List;
import java.util.UUID;

public interface TaskService {
    List<TaskResponse> findAllTasksByBoardId(UUID boardId);
    List<TaskResponse> findAllDoneTasksByListId(UUID listId);
    List<TaskResponse> findAllDoneTasksByChecklistId(UUID checklistId);
    List<TaskResponse> findAllDoneTasksByBoardIdInDefaultList(UUID boardId);
    List<TaskResponse> findAllNotDoneTasksByListId(UUID listId);
    List<TaskResponse> findAllNotDoneTasksByChecklistId(UUID checklistId);
    List<TaskResponse> findAllNotDoneTasksByBoardIdInDefaultList(UUID boardId);
    List<TaskResponse> findAllByPersonalTagId(UUID personalTagId);
    List<TaskResponse> findAllOnlyDoneByPersonalTagId(UUID personalTagId);
    List<TaskResponse> findAllByGeneralTagId(UUID generalTagId);
    List<TaskResponse> findAllOnlyDoneByGeneralTagId(UUID generalTagId);
    TaskResponse findById(UUID id);
    TaskResponse createTask(TaskRequest request);
    void deleteTaskWithAllProjections(UUID id);
    void removeTaskFromList(RemoveTaskFromListRequest request);
    void changeOrdOfTaskInList(ChangeOrdOfTaskInListRequest request);
    void removeTaskFromChecklist(RemoveTaskFromChecklistRequest request);
    void changeOrdOfTaskInChecklist(ChangeOrdOfTaskInChecklistRequest request);
    TaskResponse updateTaskById(TaskUpdateRequest request);
    TaskResponse markTaskAsDoneById(UUID id);
    TaskResponse markTaskAsNotDoneById(UUID id);
}
