package per.khalilov.services;

import per.khalilov.dto.request.ListRequest;
import per.khalilov.dto.request.ListUpdateRequest;
import per.khalilov.dto.response.ListResponse;

import java.util.List;
import java.util.UUID;

public interface ListService {
    List<ListResponse> findAllListsOfBoard(UUID boardId);
    ListResponse findByIdWithoutArchived(UUID id);
    ListResponse createDefaultListByBoardId(UUID boardId);
    ListResponse createList(ListRequest request);
    void deleteById(UUID id);
    ListResponse updateList(ListUpdateRequest request);
}
