package ch.zli.m223.punchclock.repository;
import ch.zli.m223.punchclock.domain.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
    ApplicationUser findByIdAndUsername(@Param("id") Long id, @Param("username") String username);
}