package jpablog.jpablog.service;

import jpablog.jpablog.domain.Account;
import jpablog.jpablog.dto.AccountForm;
import jpablog.jpablog.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    @Transactional
    public Long createUser(AccountForm form) {
        Account account = form.toEntity();
        accountRepository.save(account);
        return account.getId();
    }
}
