/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.Date;
/**
 *
 * @author Asus
 */
public class cliente {
    private  String carrera;
    private String nombre;
    private int id;
    private int celular;
    private String email;
    
    
    public cliente(String carrera, String nombre, int id, int celular, String email){
        
    this.carrera=carrera;
    this.nombre=nombre;
    this.id=id;
    this.celular=celular;
    this.email=email;
    }
    
    
   
    
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public int getid(){
        return id;
    }
    public void setid(int codigo){
        this.id=codigo;
    }
    public int getcelular(){
        return celular;
    }
    public void setcelular(int celular){
        this.celular=celular;
    }
    public String getemail(){
        return email;
    }
    public void setemail(String email){
        this.email=email;
    }
    public String getcarrera(){
        return carrera;
    }
    public void setcarrera(String carrera){
        this.carrera = carrera;
    }
}
