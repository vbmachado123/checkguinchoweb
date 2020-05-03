package br.com.balbino.checkguincho.model;

import java.io.Serializable;

public class Usuario implements Serializable {

    private int id;

    /* LOGIN */
    private String email = "";
    private String senha = "";

    /* EMPRESA */
    private String nomeEmpresa = "";
    private String cnpjEmpresa = "";

    /* MOTORISTA */
    private String nomeMorotista = "";
    private String rgMotorista = "";
    private String telefoneMotorista;

    /* IMAGENS */
    private String caminhoImagemLogo = "";
    private String caminhoAssinatura = "";

    public void Usuario(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }

    public String getNomeMorotista() {
        return nomeMorotista;
    }

    public void setNomeMorotista(String nomeMorotista) {
        this.nomeMorotista = nomeMorotista;
    }

    public String getRgMotorista() {
        return rgMotorista;
    }

    public void setRgMotorista(String rgMotorista) {
        this.rgMotorista = rgMotorista;
    }

    public String getTelefoneMotorista() {
        return telefoneMotorista;
    }

    public void setTelefoneMotorista(String telefoneMotorista) {
        this.telefoneMotorista = telefoneMotorista;
    }

    public String getCaminhoImagemLogo() {
        return caminhoImagemLogo;
    }

    public void setCaminhoImagemLogo(String caminhoImagemLogo) {
        this.caminhoImagemLogo = caminhoImagemLogo;
    }

    public String getCaminhoAssinatura() {
        return caminhoAssinatura;
    }

    public void setCaminhoAssinatura(String caminhoAssinatura) {
        this.caminhoAssinatura = caminhoAssinatura;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
