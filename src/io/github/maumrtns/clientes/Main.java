package io.github.maumrtns.clientes;

import io.github.maumrtns.clientes.dominio.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println(cliente.getCodigo());
    }
}
