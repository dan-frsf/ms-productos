package dan.ms.tp.msproductos.modelo;

import java.time.Instant;
import java.util.List;

public class OrdenProvision {
    private Integer id;
    private Instant fechaGeneracion;
    private Instant fechaRecepcion;
    private Boolean esCancelada;
    private Proveedor proveedor;
    private List<OrdenProvisionDetalle> detalles;
}
