/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

/**
 *
 * @author Asus
 */
public class arbinCol <E> implements arbin<E> {
    E dato;
    arbin <E> izq;
    arbin <E> der;
    
    public arbinCol(E dato){
        this.dato = dato;
    }
    
    
    
    @Override 
    public E obtener(){
        return dato;
    }
    
    @Override 
    public arbin<E> izq(){
        return izq;
    }
    @Override 
    public arbin<E> der(){
        return der;
    }
    
    @Override 
    public void enlIzq (arbin<E> x){
        izq=x;
    }
    
    @Override 
    public void enlDer (arbin<E> x){
        der=x;
    }
    
    @Override 
    public void modificar (E x){
        dato=x;
    }
    
}
