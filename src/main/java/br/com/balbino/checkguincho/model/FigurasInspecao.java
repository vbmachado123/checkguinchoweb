package br.com.balbino.checkguincho.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FigurasInspecao  implements Serializable {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private int idInspecao;
    private String caminhoFigura;
    private String caminhoAssinaturaRetira;
    private String caminhoAssinaturaEntrega;
    
    /**
     * @deprecated hibernate only
     */
    public FigurasInspecao() {}

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

    public String getCaminhoFigura() {
        return caminhoFigura;
    }

    public void setCaminhoFigura(String caminhoFigura) {
        this.caminhoFigura = caminhoFigura;
    }

    public String getCaminhoAssinaturaRetira() {
        return caminhoAssinaturaRetira;
    }

    public void setCaminhoAssinaturaRetira(String caminhoAssinaturaRetira) {
        this.caminhoAssinaturaRetira = caminhoAssinaturaRetira;
    }

    public String getCaminhoAssinaturaEntrega() {
        return caminhoAssinaturaEntrega;
    }

    public void setCaminhoAssinaturaEntrega(String caminhoAssinaturaEntrega) {
        this.caminhoAssinaturaEntrega = caminhoAssinaturaEntrega;
    }
}
