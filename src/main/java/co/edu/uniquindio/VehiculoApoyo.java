package co.edu.uniquindio;

public class VehiculoApoyo extends Vehiculo {
    private TipoFucion tipoFuncion;

    public VehiculoApoyo(String id, String modelo, int anioFabricacion, EstadoOperativo estadoOperativo, TipoFuncion tipoFuncion) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo);
        this.tipoFuncion = tipoFuncion;
    }
    @Override
    public void desplazar() {
    }

    public TipoFuncion getTipoFuncion (){
        return tipoFuncion;
    }

    public void setTipoFuncion(TipoFuncion tipoFuncion){
        this.tipoFuncion = tipoFuncion;
    }
}

