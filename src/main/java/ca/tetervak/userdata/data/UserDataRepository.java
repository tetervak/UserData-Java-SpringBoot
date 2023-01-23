package ca.tetervak.userdata.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepository extends JpaRepository<UserEntity, Integer>{}
