package br.com.balbino.checkguincho.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Localizacao implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private int idTipoRegistro;
    private int idInspecao;
    private String data;
    private String latitude;
    private String longitude;
    private String endereco;
    
    /**
     * @deprecated hibernate only
     */
    public Localizacao(){}
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTipoRegistro() {
        return idTipoRegistro;
    }

    public void setIdTipoRegistro(int idTipoRegistro) {
        this.idTipoRegistro = idTipoRegistro;
    }

    public int getIdInspecao() {
        return idInspecao;
    }

    public void setIdInspecao(int idInspecao) {
        this.idInspecao = idInspecao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
