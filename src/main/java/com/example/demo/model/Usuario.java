package com.example.demo.model;

import com.example.demo.dto.UsuarioDTO;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Usuario {

    public Usuario(UsuarioDTO usuarioDTO){
        rfID = usuarioDTO.getRfID();
        username = usuarioDTO.getRfID();
        password = usuarioDTO.getPassword();
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rfID;
    private String username;
    private String password;
    @ManyToMany(fetch=FetchType.EAGER)
    private Collection<Role> roles=new ArrayList<>();
}