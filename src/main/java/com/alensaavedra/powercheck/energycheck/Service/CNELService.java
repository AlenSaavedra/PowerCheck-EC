package com.alensaavedra.powercheck.energycheck.Service;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.alensaavedra.powercheck.energycheck.Model.Notificacion;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashMap;

@Service
public class CNELService {

    // Método que consulta la API de CNEL y devuelve las notificaciones filtradas
    public List<Notificacion> consultarCortes(String documentType, String documentNumber) {
        // URL de la API de CNEL con los parámetros del documento
        
        String url = "https://api.cnelep.gob.ec/servicios-linea/v1/notificaciones/consultar/" 
                     + documentNumber + "/" + documentType;

        RestTemplate restTemplate = new RestTemplate();

        // Llamar a la API y recibir los datos
        ResponseEntity<Map<String, Object>> response = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<Map<String, Object>>() {});

        // Obtener la lista de notificaciones
        Map<String, Object> responseBody = response.getBody();
        List<Map<String, Object>> notificacionesList = (List<Map<String, Object>>) responseBody.get("notificaciones");

        // Lista para almacenar las notificaciones filtradas
        List<Notificacion> notificacionesFiltradas = new ArrayList<>();

        // Mapa para agrupar las notificaciones por fecha de corte
        Map<String, Notificacion> notificacionesAgrupadas = new LinkedHashMap<>();

        // Iterar sobre las notificaciones y agrupar los datos
        for (Map<String, Object> notificacion : notificacionesList) {
            List<Map<String, Object>> detalles = (List<Map<String, Object>>) notificacion.get("detallePlanificacion");

            for (Map<String, Object> detalle : detalles) {
                String fechaCorte = (String) detalle.get("fechaCorte");
                String horaDesde = (String) detalle.get("horaDesde");
                String horaHasta = (String) detalle.get("horaHasta");

                // Si la fecha ya existe en el mapa, agregar el horario
                if (notificacionesAgrupadas.containsKey(fechaCorte)) {
                    Notificacion notificacionExistente = notificacionesAgrupadas.get(fechaCorte);
                    notificacionExistente.addHorario(horaDesde, horaHasta);  // Agregar nuevo horario a la lista
                } else {
                    // Si la fecha no existe, crear una nueva notificación
                    Notificacion notificacionNueva = new Notificacion();
                    notificacionNueva.setAlimentador((String) detalle.get("alimentador"));
                    notificacionNueva.setFechaCorte(fechaCorte);
                    notificacionNueva.addHorario(horaDesde, horaHasta);  // Agregar primer horario
                    notificacionesAgrupadas.put(fechaCorte, notificacionNueva);  // Guardar en el mapa
                }
            }
        }

        // Convertir el mapa en una lista de notificaciones agrupadas
        notificacionesFiltradas.addAll(notificacionesAgrupadas.values());

        return notificacionesFiltradas;
    }
}