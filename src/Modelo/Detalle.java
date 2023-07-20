
package Modelo;

public class Detalle {
    private int id, cantidad, id_venta;
    private String cod_pro;
    private double precio;

    public Detalle() {
    }

    public Detalle(int id, int cantidad, int id_venta, String cod_pro, double precio) {
        this.id = id;
        this.cantidad = cantidad;
        this.id_venta = id_venta;
        this.cod_pro = cod_pro;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getCod_pro() {
        return cod_pro;
    }

    public void setCod_pro(String cod_pro) {
        this.cod_pro = cod_pro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
