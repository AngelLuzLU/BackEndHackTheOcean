package com.axojonautas.backend.repo;

import com.axojonautas.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<User, Long> {

}
