package academy.atl.panel.models;

import lombok.*;


/**
 * @Data= @Getter @Setter @ToString  @NoArgsConstructor
 */
@Data @AllArgsConstructor
public class Usuario {
    /**
     * lombok
     * Cuando trabajemos con Hibernate y estemos modelando tablas
     * Puede ser que traiga problemas más que nada en el generado del ToString
     */
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer telefono;
    private String  email;

}
