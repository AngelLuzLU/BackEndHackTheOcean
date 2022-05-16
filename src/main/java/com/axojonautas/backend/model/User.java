package com.axojonautas.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "Firmados")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "estado")
    private String estado;

    public User(String nombre, String apellido, String email, String telefono, String estado){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.estado = estado;
    }

    public User() {

    }

    public int getId(){  return id;  }
    public String getNombre(){  return nombre;  }
    public String getApellido(){  return apellido;  }
    public String getEmail(){  return email;  }
    public String getTelefono(){  return telefono;  }
    public String getEstado(){  return estado;  }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setApellido(String apellido){
        if(!apellido.isEmpty()){
            this.apellido = apellido;
            return true;
        }else
            return false;
    }

    public boolean setEmail(String email){
        if(!email.isEmpty()){
            this.email = email;
            return true;
        }else
            return false;
    }

    public boolean setTelefono(String telefono){
        if(!telefono.isEmpty()){
            this.telefono = telefono;
            return true;
        }else
            return false;
    }

    public boolean setEstado(String estado){
        if(!estado.isEmpty()){
            this.estado = estado;
            return true;
        }else
            return false;
    }

}
