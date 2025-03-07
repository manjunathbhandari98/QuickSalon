package com.quodex.quicksalon.repository;

import com.quodex.quicksalon.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
