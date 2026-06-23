/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;

import Interface.Imagem;
import Models.ImagemArquivo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author japa
 */
public class ImagemProxy implements Imagem{
    private String nome;
    private ImagemArquivo imagemarquivo;

    public ImagemProxy(String nome) {
        this.nome = nome;
    }

    @Override
    public ImageIcon exibir() {
        try {
            imagemarquivo = new ImagemArquivo(this.nome);
            return imagemarquivo.exibir();
        } catch (IOException ex) {
            Logger.getLogger(ImagemProxy.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     
}
