import com.google.gson.annotations.SerializedName;

import java.util.Map;

public record MonedaAPI(@SerializedName("base_code") String baseCode, @SerializedName("conversion_rates") Map<String,Double> conversionRates) {

    public String calcularConversion(Double valor, String baseCodeAConvertir) {

        return valor + "["+ baseCode + "]" + "son " + conversionRates.get(baseCodeAConvertir)*valor + " ["+ baseCodeAConvertir + "]";
    }


}
