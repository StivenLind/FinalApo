/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package menu;

/**
 *
 * @author Asus
 */
public interface arbin<E>{
    E obtener ();
    arbin<E> izq();
    arbin<E> der();
    void enlIzq(arbin<E> x);
    void enlDer(arbin<E> x);
    void modificar(E x);
    
}
