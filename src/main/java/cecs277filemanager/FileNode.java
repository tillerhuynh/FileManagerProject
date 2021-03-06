/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cecs277filemanager;

import java.io.File;

/**
 *
 * @author glitc
 */
public class FileNode {
    File file;
    String filename;
    
    public FileNode(String filename){
        file = new File(filename);
    }
    public FileNode(String name, File f){
        filename = name;
        file = f;
    }
    
    public File getFile(){
        return file;
    }
    
    @Override
    public String toString(){
        if(file.getName().equals(""))
            return file.getPath();
        return file.getName();
    }
    
    public boolean isDirectory(){
        return file.isDirectory();
    }
}