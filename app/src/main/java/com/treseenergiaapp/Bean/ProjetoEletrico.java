package com.treseenergiaapp.Bean;

/**
 * Created by andre on 02/06/2017.
 */

public class ProjetoEletrico {
    private String descricao;
    private String tipoImovel;
    private String quantidadePavimentos;
    private String endereco;
    private String nomeResponsavel;
    private String data;
    private String hora;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public String getQuantidadePavimentos() {
        return quantidadePavimentos;
    }

    public void setQuantidadePavimentos(String quantidadePavimentos) {
        this.quantidadePavimentos = quantidadePavimentos;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
