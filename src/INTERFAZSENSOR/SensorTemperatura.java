package INTERFAZSENSOR;

public class SensorTemperatura {
    private String idSensor;
    private double valoractual;
    private String unidad;

    public void setIdSensor(String idSensor) {
        if (idSensor != null && !idSensor.isBlank()) {
            System.out.println("El ID es válido");
        } else {
            System.out.println("El ID es nulo");
        }
    }

    public double getValoractual() {
        return valoractual;
    }

    public void setUnidad(String unidad) {
        if (unidad != null && !unidad.isBlank()) {
        System.out.println("La unidad es válida");
    } else

    {
        System.out.println("La unidad es nula");
    }
    }
    void mostrarLectura(){
        System.out.println("EL ID ES: \n"+idSensor);
        System.out.println("El VALOR ES: \n"+valoractual);
        System.out.println("LA UNIDAD ES: \n"+unidad);
    }
}
