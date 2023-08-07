package per.khalilov.services;

import per.khalilov.dto.request.*;
import per.khalilov.dto.response.AccountAdministrativeResponse;
import per.khalilov.dto.response.AccountResponse;

import java.util.List;
import java.util.UUID;

public interface AccountService {
    List<AccountAdministrativeResponse> findAll();
    List<AccountResponse> findByUsernameLike(String query);
    AccountResponse findById(UUID id);
    AccountAdministrativeResponse findAdministrativeById(UUID id);
    // TODO: photo to save
    AccountResponse signUp(SignUpRequest form);
    AccountResponse signIn(SignInRequest form); // ??? -> Security
    // TODO: photo to save
    AccountResponse updateAccountById(AccountUpdateRequest request);
    void deleteById(UUID id);
    void resetPassword(PasswordRequest passwordRequest);
    void resetUsername(UsernameRequest usernameRequest);
    void banAccountById(UUID id); // Действительно секьюрность при раздельных методах повышается,
                                                // тк можно дать доступ к этому методу только админу
    void unbanAccountById(UUID id);
}
