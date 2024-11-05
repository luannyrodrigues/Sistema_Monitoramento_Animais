package com.example.dao;

public interface InterfaceBD {
    public Boolean conexaoAberta();

    public void fecharConexao();

    public Object find(@SuppressWarnings("rawtypes") Class c, Object id) throws Exception;

    public void persist(Object o) throws Exception;

    public void remover(Object o) throws Exception;
}
