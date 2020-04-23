package info.webinformatica.basic.z1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    private static final String dataBanco = "yyyy-MM-dd HH:mm:ss";
    private static final String dataLocal = "dd/MM/yyyy HH:mm:ss";

    public static void salvarDadosComponente(String key, String value, Context classe) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(classe);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public static String carregarDadosComponente(String key, Context classe) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(classe);
        return sharedPreferences.getString(key, "");
    }

    public static String formatarDataHoraBanco(Date dataHora) {
        return new SimpleDateFormat(dataBanco).format(dataHora);
    }

    public static String formatarDataHoraLocal(Date dataHora) {
        return new SimpleDateFormat(dataLocal).format(dataHora);
    }

    public static Date formatarDataHora(String dataHora) {
        try {
            return new SimpleDateFormat(dataBanco).parse(dataHora);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}


