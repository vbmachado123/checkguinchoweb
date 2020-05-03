package br.com.balbino.checkguincho.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pdf  implements Serializable {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;
    private int idInspecao;
    private String caminhoDocumento;

    /**
     * @deprecated hibernate only
     */
    public Pdf(){}
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdInspecao() {
        return idInspecao;
    }

    public void setIdInspecao(int idInspecao) {
        this.idInspecao = idInspecao;
    }

    public String getCaminhoDocumento() {
        return caminhoDocumento;
    }

    public void setCaminhoDocumento(String caminhoDocumento) {
        this.caminhoDocumento = caminhoDocumento;
    }
}
