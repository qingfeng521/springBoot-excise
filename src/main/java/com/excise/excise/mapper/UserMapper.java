package com.excise.excise.mapper;


import com.excise.excise.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    UserEntity getUser();
}
