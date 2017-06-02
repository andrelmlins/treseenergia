package com.treseenergiaapp.Bean;

/**
 * Created by andre on 02/06/2017.
 */

public class EnergiaFotovoltaica {
    private String descricao;
    private String tipoImovel;
    private String[] ambientes;
    private boolean aterramento;
    private String servico;
    private String necessidade;

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

    public String[] getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(String[] ambientes) {
        this.ambientes = ambientes;
    }

    public boolean isAterramento() {
        return aterramento;
    }

    public void setAterramento(boolean aterramento) {
        this.aterramento = aterramento;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getNecessidade() {
        return necessidade;
    }

    public void setNecessidade(String necessidade) {
        this.necessidade = necessidade;
    }
}
