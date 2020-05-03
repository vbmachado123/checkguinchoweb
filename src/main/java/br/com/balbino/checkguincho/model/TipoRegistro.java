package br.com.balbino.checkguincho.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoRegistro  implements Serializable {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String tipoRegistro;

    /**
     * @deprecated hibernate only
     */
    public TipoRegistro(){}
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }
}
