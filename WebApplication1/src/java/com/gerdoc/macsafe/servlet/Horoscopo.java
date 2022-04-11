package com.gerdoc.macsafe.servlet;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Horoscopo {

    String fecha;

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoroscopo() {
        String horoscopo = "";

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate fechaNac = LocalDate.parse(fecha, format);

        int año = fechaNac.getYear();

        if (año == 2020 || año == 2008 || año == 1996 || año == 1984 || año == 1972 || año == 1960) {
            horoscopo = "Rata";
        } else if (año == 2021 || año == 2009 || año == 1997 || año == 1985 || año == 1973 || año == 1961) {
            horoscopo = "Buey";
        } else if (año == 2022 || año == 2010 || año == 1998 || año == 1986 || año == 1974 || año == 1962) {
            horoscopo = "Tigre";
        } else if (año == 2023 || año == 2011 || año == 1999 || año == 1987 || año == 1975 || año == 1963) {
            horoscopo = "Conejo";
        } else if (año == 2024 || año == 2012 || año == 2000 || año == 1988 || año == 1976 || año == 1964) {
            horoscopo = "Dragon";
        } else if (año == 2025 || año == 2013 || año == 2001 || año == 1989 || año == 1977 || año == 1965) {
            horoscopo = "Serpíente";
        } else if (año == 2026 || año == 2014 || año == 2002 || año == 1990 || año == 1978 || año == 1966) {
            horoscopo = "Caballo";
        }else if (año == 2027 || año == 2015 || año == 2003 || año == 1991 || año == 1979 || año == 1967) {
            horoscopo = "Cabra";
        }else if (año == 2028 || año == 2016 || año == 2004 || año == 1992 || año == 1980 || año == 1968) {
            horoscopo = "Mono";
        }else if (año == 2029 || año == 2017 || año == 2005 || año == 1993 || año == 1981 || año == 1969) {
            horoscopo = "Gallo";
        }else if (año == 2030 || año == 2018 || año == 2006 || año == 1994 || año == 1982 || año == 1970) {
            horoscopo = "Perro";
        }else if (año == 2031 || año == 2019 || año == 2007 || año == 1995 || año == 1983 || año == 1971) {
            horoscopo = "Cerdo";
        }

        return horoscopo;
    }

}
