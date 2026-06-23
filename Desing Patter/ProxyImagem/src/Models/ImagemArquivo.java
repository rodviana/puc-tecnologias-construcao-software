/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Interface.Imagem;
import java.io.IOException;
import javax.swing.ImageIcon;

/**
 *
 * @author japa
 */
public class ImagemArquivo implements Imagem {
    private String nome;
    private ImageIcon icone;
    
    public ImagemArquivo(String nome) throws IOException {
        this.nome = nome;        
        this.icone = new ImageIcon(nome);   
   }
    
    @Override
    public ImageIcon exibir() {
       return icone;
    }
    
}
