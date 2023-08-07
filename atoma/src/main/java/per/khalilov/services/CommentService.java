package per.khalilov.services;

import per.khalilov.dto.request.CommentRequest;
import per.khalilov.dto.request.CommentUpdateRequest;
import per.khalilov.dto.response.CommentResponse;

import java.util.List;
import java.util.UUID;

public interface CommentService {
    List<CommentResponse> findAllByTaskId(UUID id);
    CommentResponse createComment(CommentRequest request);
    void deleteById(UUID id);
    CommentResponse updateCommentById(CommentUpdateRequest request);
}
