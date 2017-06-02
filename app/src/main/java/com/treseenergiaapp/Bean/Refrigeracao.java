package com.treseenergiaapp.Bean;

/**
 * Created by andre on 02/06/2017.
 */

public class Refrigeracao {
    private String servico;
    private String[] ambientes;
    private boolean circuitoInstalado;
    private String tipoManutencao;
    private String necessidade;
    private String problemasEncontrados;
    private String endereco;
    private String nomeResponsavel;
    private String data;
    private String hora;
    private String comentarios;

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String[] getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(String[] ambientes) {
        this.ambientes = ambientes;
    }

    public boolean isCircuitoInstalado() {
        return circuitoInstalado;
    }

    public void setCircuitoInstalado(boolean circuitoInstalado) {
        this.circuitoInstalado = circuitoInstalado;
    }

    public String getTipoManutencao() {
        return tipoManutencao;
    }

    public void setTipoManutencao(String tipoManutencao) {
        this.tipoManutencao = tipoManutencao;
    }

    public String getNecessidade() {
        return necessidade;
    }

    public void setNecessidade(String necessidade) {
        this.necessidade = necessidade;
    }

    public String getProblemasEncontrados() {
        return problemasEncontrados;
    }

    public void setProblemasEncontrados(String problemasEncontrados) {
        this.problemasEncontrados = problemasEncontrados;
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

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
