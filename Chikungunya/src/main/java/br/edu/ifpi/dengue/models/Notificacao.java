package br.edu.ifpi.dengue.models;

import java.time.LocalDate;

public class Notificacao {
    private LocalDate dataNotificacao;
    private String agravoDoenca;
    private String uf;
    private String municipio;
    private String unidadeSaude;
    private String nomePaciente;
    private int idade;
    private String nomeMae;
    private String ufResidencia;
    private String municipioResidencia;
    private LocalDate dataNascimento;

    public Notificacao(){}

    public LocalDate getDataNotificacao() {
        return dataNotificacao;
    }

    public void setDataNotificacao(LocalDate dataNotificacao) {
        this.dataNotificacao = dataNotificacao;
    }

    public String getAgravoDoenca() {
        return agravoDoenca;
    }

    public void setAgravoDoenca(String agravoDoenca) {
        this.agravoDoenca = agravoDoenca;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUnidadeSaude() {
        return unidadeSaude;
    }

    public void setUnidadeSaude(String unidadeSaude) {
        this.unidadeSaude = unidadeSaude;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getUfResidencia() {
        return ufResidencia;
    }

    public void setUfResidencia(String ufResidencia) {
        this.ufResidencia = ufResidencia;
    }

    public String getMunicipioResidencia() {
        return municipioResidencia;
    }

    public void setMunicipioResidencia(String municipioResidencia) {
        this.municipioResidencia = municipioResidencia;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}



