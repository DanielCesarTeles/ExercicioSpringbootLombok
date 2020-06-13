package Teles.Daniel.ExercicioSpringboosLombok.model;

import lombok.*;

/**
 * @author Daniel Teles
 * @version 1.0
 * @since 13/06/2020 - 00:25
 * @category model
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cliente {


    private String nome;
    private String sobrenome;
    private int idade;
    private String CPF;

    /**
     *
     * @return Retorna se o cliente é maior de idade.
     */
    public String verificarMaioridade() {
        if(this.idade >=18){
            return "Maior de idade.";
        } {
            return "Menor de idade.";
        }
    }

    /**
     *
     * @return Retorna se o cpf do cliente é válido
     */
    public String verificarCPF() {
        if(CPF.length() <14){
            return "CPF inválido";
        } {
            return "CPF válido ";
        }
    }

}
