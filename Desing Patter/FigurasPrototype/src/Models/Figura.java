/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author anibal.jukemura
 */
public abstract class Figura implements Cloneable{
    private String id;
    protected String tipo;
    int area;
    
    public abstract void desenhar();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
    public Object clone()
    {
        Object clone=null;
        try
        {
            clone=super.clone();
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
}
