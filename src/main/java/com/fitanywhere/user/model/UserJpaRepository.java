package com.fitanywhere.user.model;

import com.fitanywhere.user.model.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//處理登入時依據會員信箱查詢所需資料
@Repository
public interface UserJpaRepository extends JpaRepository<UserVO, Integer> {

    @Query("FROM UserVO WHERE uMail = :uMail")
    UserVO findByUMail(String uMail);
}