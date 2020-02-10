package com.example.demo.auth;

import com.example.demo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class SimpleUserDetailsService implements UserDetailsService {
  private final UserRepository userRepository;

  public SimpleUserDetailsService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  /**
   * メールアドレスで検索したユーザーのuserエンティティをSimpleLoginUserクラスのインスタンスへ変換する
   *
   * @param email 検索するユーザーのメールアドレス
   * @return メールアドレスで検索できたユーザーのユーザー情報
   * @throws UsernameNotFoundException メールアドレスでユーザーが検索できなかった場合にスローする。
   */
  @Transactional(readOnly = true)
  @Override
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    assert(email != null);
    log.debug("loadUserByUsername(email):[{}]", email);
    return userRepository.findByEmail(email)
        .map(SimpleLoginUser::new)
        .orElseThrow(() -> new UsernameNotFoundException("User not found by email:[" + email + "]"));
  }
}
