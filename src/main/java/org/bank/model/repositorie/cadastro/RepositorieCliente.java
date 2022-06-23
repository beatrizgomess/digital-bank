package org.bank.model.repositorie.cadastro;

import org.bank.model.classes.Cliente;

import java.util.ArrayList;
import java.util.List;

public class RepositorieCliente {

    private static RepositorieCliente myself = null;
    private List<Cliente> clientes = null;

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = new ArrayList<>();
    }

    public static RepositorieCliente getCurrentInstance(){
        if(myself == null){
            myself = new RepositorieCliente();
        }
        return myself;
    }

    public Cliente login(String login, String password){
        for(Cliente cl: this.clientes){
            if(cl.getLogin().equals(login) && cl.getPassword().equals(password)){
                return cl;
            }
        }
        return null;
    }

    public void insert(Cliente cl){
       this.clientes.add(cl);
    }


    public void update(Cliente cliente){
        for(Cliente cl: this.clientes){
            if(cliente.getLogin().equals(cl.getLogin())){
                cl.setPassword(cl.getPassword());
                cl.setEmail(cl.getEmail());
                cl.setPhone(cl.getPhone());
                return;
            }
        }
    }


    public Cliente readOne(String login){
        for(Cliente cl: this.clientes){
            if(cl.getLogin().equals(login)){
                return cl;
            }
        }
        return null;
    }


    public List<Cliente> readAll(){
        return this.clientes;
    }


    public void delete(Cliente cl){
        this.clientes.remove(cl);
    }

}
