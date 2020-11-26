package ch.zli.m223.punchclock.domain;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "role")
    private List<ApplicationUser> applicationUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ApplicationUser> getApplicationUser() {
        return applicationUser;
    }

    public void setApplicationUser(List<ApplicationUser> applicationUser) {
        this.applicationUser = applicationUser;
    }
}
