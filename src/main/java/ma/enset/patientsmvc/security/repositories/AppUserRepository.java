package ma.enset.patientsmvc.security.repositories;

import ma.enset.patientsmvc.security.entites.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, String> {
    AppUser findByUsername(String username);
}
