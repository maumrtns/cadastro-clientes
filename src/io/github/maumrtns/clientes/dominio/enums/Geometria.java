package io.github.maumrtns.clientes.dominio.enums;

public class Geometria {
    public static void main(String[] args) {
        FormaGeometrica formaGeometrica = FormaGeometrica.RETANGULO;
        int ladosRetangulo = formaGeometrica.getLados();
        System.out.println(ladosRetangulo);
    }
}
