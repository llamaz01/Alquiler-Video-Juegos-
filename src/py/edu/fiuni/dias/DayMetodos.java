/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.dias;

import java.util.Date;

/**
 * Esta clase contiene la fecha, dia y hora que seran necesarias para el
 * registro
 *
 * @author Jorge Martinez
 */
public class DayMetodos {

    public DayMetodos() {
        data = new Date();
    }

    /**
     * Retorna la fecha, mes y año
     *
     * @return
     */
    public String listarFechas() {
        int anio = data.getYear() + 1900;
        int mes = data.getMonth() + 1;
        String datos = String.valueOf(data.getDate() + "/" + mes + "/" + anio);

        return datos;
    }

    /**
     * Retorna la hora
     *
     * @return
     */
    public String listarHoras() {

        String hours = String.valueOf(data.getHours() + ":" + data.getMinutes());
        return hours;
    }
    private final Date data;
}
