package br.com.taskexecutor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1973098008948737582L;
    public String nome;
}
