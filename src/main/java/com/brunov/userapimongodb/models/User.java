package com.brunov.userapimongodb.models;

import java.time.LocalDateTime;

import com.brunov.userapimongodb.models.dto.UserDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user")
public class User {

    @Id
    private String id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    @Field(targetType = FieldType.DATE_TIME)
    private LocalDateTime dataCadastro;

    public static User convert(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setNome(userDTO.getNome());
        user.setCpf(userDTO.getCpf());
        user.setEndereco(userDTO.getEndereco());
        user.setTelefone(userDTO.getTelefone());
        user.setEmail(userDTO.getEmail());
        user.setDataCadastro(userDTO.getDataCadastro());
        return user;
    }
}

