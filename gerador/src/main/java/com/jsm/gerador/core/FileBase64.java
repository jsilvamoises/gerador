/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.gerador.core;

//import com.sunrise.bicus.util.FacesUtil;

import org.primefaces.model.UploadedFile;
import org.primefaces.util.Base64;

/**
 *
 * @author MOISES
 */
public class FileBase64 {

    private String nome;
    private String extencao;
    private Long size;
    private String base64String;

    private static FileBase64 instance;

    public static FileBase64 getInstance() {
        return instance == null ? instance = new FileBase64() : instance;
    }

    public FileBase64 getFileBase64(UploadedFile f) {
        // FileBase64 fl;
        instance = null;
        try {
            this.nome = f.getFileName();
            this.extencao = f.getContentType();
            this.size = f.getSize();

            base64String = new String(Base64.encodeToByte(f.getContents(), true));

        } catch (Exception e) {
            e.printStackTrace();
          //  FacesUtil.showDialogMessageErro("Erro", "Não foi possivel carregar a imagem");
        }
        return instance;
    }

    public String getNome() {
        return nome;
    }

    public String getExtencao() {
        return extencao;
    }

    public Long getSize() {
        return size;
    }

    public String getBase64String() {
        return base64String;
    }

}
