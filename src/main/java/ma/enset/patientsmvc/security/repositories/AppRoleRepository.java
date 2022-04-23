package ma.enset.patientsmvc.security.repositories;

import ma.enset.patientsmvc.security.entites.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
    AppRole findByRoleName(String roleName);
}
