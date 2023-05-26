
package menu;

import java.util.Vector;
/**
 *
 * @author Asus
 */
public class arbolobjetos {
    
    private arbin<cliente> raiz;
    
    public arbin<cliente> getraiz(){
        return raiz;
    }
    
    void insertar(cliente a){
        if(raiz==null){
            raiz=new arbinCol<>(a);
        }else{
            insertar(raiz, a);
        }
    }

    private void insertar(arbin<cliente> r, cliente a) {
        if(a.getid()<r.obtener().getid()){
        if(r.izq()==null){
            r.enlIzq(new arbinCol<>(a));
            
        }else{
            insertar(r.der(), a);
        }
    }
    }
    String mos="";
    public void mostrarTodo(arbin<cliente> r){
        if(r!=null){
            visitar(r);
            mostrarTodo(r.izq());
            mostrarTodo(r.der());
        }
    }

    private void visitar(arbin<cliente> r) {
       mos+= "nombre: "+r.obtener().getnombre()+";        carrera:: "+r.obtener().getcarrera()+";    codigo:"+r.obtener()getid()+";          email:"+r.obtener().getemail()+";       celular: "+r.obtener().getcelular()+"/n";
    }
public String mostrar(arbin<cliente> r){
    mos="";
    mostrarTodo(r);
    return mos;
}
public arbin<cliente> buscarPorCodigo(int cc){
    if(raiz==null){
    return null;
}else{
    return buscar(raiz, cc);
}
}

private arbin<cliente> buscar(arbin<cliente>r, int id){
    if(id==r.obtener().getid()){
        return r;
    }else{
        if(id<r.obtener().getid()){
          if(r.izq()==null){
              return null;
          }  else{
              return buscar(r.izq(), id);
          }
        }else{
          if(r.der()==null){
              return null;
          }  else{
              return buscar(r.der(), id);
          }   
        }
    }
   
    
}
public void modify (arbin<cliente>r, int identificacion, String e, int cel){
    if(buscarPorCodigo(identificacion)!=null){
        if(r.obtener().getid()== identificacion){
            r.obtener().setemail(e);
            r.obtener().setcelular(cel);
        }
    }
}
public void eliminar(int x){
    if(buscarPorCodigo(x)!=null){
        raiz=eliminar(raiz, x);
    }
}
private arbin<cliente> eliminar(arbin<cliente> r,int x){
    if(r.obtener().getid()==x){
        return borrar(r, x);
        
    }else{
        if(x<r.obtener().getid()){
            r.enlIzq(eliminar(r.izq(),x));
            
        }else{
            r.enlDer(eliminar(r.der(), x));
        }
        return r;
    }
    
}
public arbin<cliente>mayor(arbin<cliente> r){
    if(r!=null){
        if(r.der()!=null){
            return mayor(r.der());
    }else{
            return r;
        }
    }else{
        return null;
    }
}

    private arbin<cliente> borrar(arbin<cliente> r, int x) {
    if(r.izq()==null && r.der()==null){
        return null;
        
    }else{
        if(r.izq()==null && r.der()==null){
            return r.der();
        }else{
            if(r.der()==null){
                return r.izq();
                
            }else{
                arbin<cliente>may= mayor (r.izq());
                r.modificar(may.obtener());
                r.enlIzq(eliminar(r.izq(), may.obtener().getid()));
                return r;
                }
                
            }
        }
    }
}