package publicacion;

public class Periodico extends Publicacion implements Periodicidad
{
    private String secciones;
    private String editor;
    
    public String getSecciones(){
     return secciones;
    }
    
    public void setSecciones(String secci){
        secciones = secci;
    }
    
    public String getEditor(){
     return editor;
    }
    
    public void setEditor(String edi){
        editor = edi;
    }
    
   @Override
    public String getPeriodicidad()//implementaci�n del m�todo
    {
     return periodicidad;
    }
        
  }