package per.khalilov.services;

import per.khalilov.dto.request.BoardRequest;
import per.khalilov.dto.request.BoardUpdateRequest;
import per.khalilov.dto.response.BoardResponse;

import java.util.List;
import java.util.UUID;

public interface BoardService {
    List<BoardResponse> findAllWithoutPersonal();
    List<BoardResponse> findAllWithoutArchivedAndPersonal();
    List<BoardResponse> findAllArchivedWithoutPersonal();
    List<BoardResponse> findAllPublicBoards();
    List<BoardResponse> findAllPrivateBoards();
    List<BoardResponse> findAllByThemeOrNameLikeWithoutPersonal(String query);

    // This 4 methods contain personal boards:
    List<BoardResponse> findAllMembershipBoardsOfAccount(UUID accountId);
    List<BoardResponse> findAllBoardsWithoutArchivedOfAccount(UUID accountId);
    List<BoardResponse> findAllFavoriteBoardsOfAccount(UUID accountId);
    List<BoardResponse> findAllArchivedBoardsOfAccount(UUID accountId);

    // If personal - don't show even title
    BoardResponse findById(UUID id);
    BoardResponse createBoard(BoardRequest request);
    void addBoardToFavorites(UUID boardId, UUID accountId);
    void deleteBoardFromFavorites(UUID boardId);
    void deleteById(UUID id);

    // Only on board - other elements archived/unarchived this method inside
    void archiveBoardById(UUID id);
    void unarchiveBoardById(UUID id);
    BoardResponse updateBoardById(BoardUpdateRequest newBoard);


}
