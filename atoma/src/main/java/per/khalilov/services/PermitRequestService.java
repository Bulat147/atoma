package per.khalilov.services;

import per.khalilov.dto.request.PermitRequest;
import per.khalilov.dto.request.SolvePermitRequest;
import per.khalilov.dto.response.PermitRequestResponse;

public interface PermitRequestService {
    PermitRequestResponse sendRequestToGetPermit(PermitRequest request);
    PermitRequestResponse solveRequest(SolvePermitRequest request);
}
