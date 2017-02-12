package com.yonyou.cloud.repository;

import com.yonyou.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by liuxin on 2017/2/10.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
