package com.spring_boot_project.entity;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class User implements UserDetails{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    private String login;

    @NonNull
    private String email;

    @NonNull
    private String password;

    @NonNull
    private String pathImage;

    private Boolean enabled;

    private Boolean nonExpired;

    private Boolean nonLocked;

    private String uuid;

    @Enumerated
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<Rate> rates = new ArrayList<>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(role.name()));
        return authorities;

    }

    @Override
    public String getUsername() {
        return String.valueOf(id);
    }

    @Override
    public boolean isAccountNonExpired() {
        return nonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return nonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}

