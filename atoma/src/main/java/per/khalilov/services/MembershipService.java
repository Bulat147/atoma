package per.khalilov.services;

import per.khalilov.dto.request.MembershipRequest;
import per.khalilov.dto.request.MembershipUpdateRequest;
import per.khalilov.dto.response.MembershipResponse;

import java.util.List;
import java.util.UUID;

public interface MembershipService {
    MembershipResponse findMembershipByAccountAndBoard(UUID accountId, UUID boardId);
    MembershipResponse findMembershipById(UUID id);
    List<MembershipResponse> findAllByAccountId(UUID accountId);
    MembershipResponse createMembership(MembershipRequest request);
    MembershipResponse updateById(MembershipUpdateRequest request);
    void deleteById(UUID id);
}
