package org.bank.model.classes;

import java.util.List;

public class Cliente {
    private String name;
    protected List<Conta> contas;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
