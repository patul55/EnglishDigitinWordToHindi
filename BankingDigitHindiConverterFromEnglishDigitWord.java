package englishToHindiDigitConversion;
/* Date: 01.02.2024
 * Author: Atul Patil
 * Purpose: Conversion of English number word into Hindi Number word
 */
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankingDigitHindiConverterFromEnglishDigitWord {
    static String hindiPattern = "[\\u0900-\\u097F]";
    static Pattern isHindi = Pattern.compile(hindiPattern);
    private static final Map<String, String> englishToHindiMap = new HashMap<>();
    private static final Map<String, String> englishToHindiMapFor21to99 = new HashMap<>();

    static {
        initializeEnglishToHindiMap();
        initializeEnglishToHindiMapFor21to99();
    }

    private static void initializeEnglishToHindiMap() {
    	englishToHindiMap.put("zero", "शून्य");
		englishToHindiMap.put("one", "एक");
		englishToHindiMap.put("two", "दो");
		englishToHindiMap.put("three", "तीन");
		englishToHindiMap.put("four", "चार");
		englishToHindiMap.put("five", "पाँच");
		englishToHindiMap.put("six", "छह");
		englishToHindiMap.put("seven", "सात");
		englishToHindiMap.put("eight", "आठ");
		englishToHindiMap.put("nine", "नौ");
		englishToHindiMap.put("ten", "दस");
		englishToHindiMap.put("eleven", "ग्यारह");
		englishToHindiMap.put("twelve", "बारह");
		englishToHindiMap.put("thirteen", "तेरह");
		englishToHindiMap.put("fourteen", "चौदह");
		englishToHindiMap.put("fifteen", "पंध्रह");
		englishToHindiMap.put("sixteen", "सोलह");
		englishToHindiMap.put("seventeen", "सत्रह");
		englishToHindiMap.put("eighteen", "अठारह");
		englishToHindiMap.put("nineteen", "उन्नीस");
		englishToHindiMap.put("twenty", "बीस");
		englishToHindiMap.put("thirty", "तीस");
		englishToHindiMap.put("forty", "चालीस");
		englishToHindiMap.put("fifty", "पचास");
		englishToHindiMap.put("sixty", "साठ");
		englishToHindiMap.put("seventy", "सत्तासी");
		englishToHindiMap.put("eighty", "अस्सी");
		englishToHindiMap.put("ninety", "नब्बे");
		englishToHindiMap.put("hundred", "सौ");
		englishToHindiMap.put("thousand", "हजार");
		englishToHindiMap.put("lakh", "लाख");
		englishToHindiMap.put("crore", "करोड़");
		englishToHindiMap.put("rupees", "रुपये");
		englishToHindiMap.put("paise", "पैसे");
		englishToHindiMap.put("and", "और");
    }

    private static void initializeEnglishToHindiMapFor21to99() {
    	englishToHindiMapFor21to99.put("twenty one", "इक्कीस");
		englishToHindiMapFor21to99.put("twenty two", "बाईस");
		englishToHindiMapFor21to99.put("twenty three", "तेईस");
		englishToHindiMapFor21to99.put("twenty four", "चौबीस");
		englishToHindiMapFor21to99.put("twenty five", "पच्चीस");
		englishToHindiMapFor21to99.put("twenty six", "छब्बीस");
		englishToHindiMapFor21to99.put("twenty seven", "सत्तइस");
		englishToHindiMapFor21to99.put("twenty eight", "अठ्ठाइस");
		englishToHindiMapFor21to99.put("twenty nine", "उन्तीस");
		englishToHindiMapFor21to99.put("thirty one", "इकतीस");
		englishToHindiMapFor21to99.put("thirty two", "बत्तीस");
		englishToHindiMapFor21to99.put("thirty three", "तेतीस");
		englishToHindiMapFor21to99.put("thirty four", "चौतीस");
		englishToHindiMapFor21to99.put("thirty five", "पैंतीस");
		englishToHindiMapFor21to99.put("thirty six", "छत्तीस");
		englishToHindiMapFor21to99.put("thirty seven", "सैंतीस");
		englishToHindiMapFor21to99.put("thirty eight", "अड़तीस");
		englishToHindiMapFor21to99.put("thirty nine", "उन्तालीस");
		englishToHindiMapFor21to99.put("forty one", "इकतालीस");
		englishToHindiMapFor21to99.put("forty two", "ब्यालीस");
		englishToHindiMapFor21to99.put("forty three", "तेतालीस");
		englishToHindiMapFor21to99.put("forty four", "चौवालीस");
		englishToHindiMapFor21to99.put("forty five", "पैंतालीस");
		englishToHindiMapFor21to99.put("forty six", "छियालीस");
		englishToHindiMapFor21to99.put("forty seven", "सैतालीस");
		englishToHindiMapFor21to99.put("forty eight", "अड़तालीस");
		englishToHindiMapFor21to99.put("forty nine", "उनंचास");
		englishToHindiMapFor21to99.put("fifty one", "इक्यावन");
		englishToHindiMapFor21to99.put("fifty two", "बावन");
		englishToHindiMapFor21to99.put("fifty three", "तिरेपन");
		englishToHindiMapFor21to99.put("fifty four", "चौअन");
		englishToHindiMapFor21to99.put("fifty five", "पचपन");
		englishToHindiMapFor21to99.put("fifty six", "छप्पन");
		englishToHindiMapFor21to99.put("fifty seven", "सत्तावन");
		englishToHindiMapFor21to99.put("fifty eight", "अठ्ठावन");
		englishToHindiMapFor21to99.put("fifty nine", "उनसठ");
		englishToHindiMapFor21to99.put("sixty one", "इकसठ");
		englishToHindiMapFor21to99.put("sixty two", "बासठ");
		englishToHindiMapFor21to99.put("sixty three", "तिरसठ");
		englishToHindiMapFor21to99.put("sixty four", "चौंसठ");
		englishToHindiMapFor21to99.put("sixty five", "पैंसठ");
		englishToHindiMapFor21to99.put("sixty six", "छियासठ");
		englishToHindiMapFor21to99.put("sixty seven", "सरसठ");
		englishToHindiMapFor21to99.put("sixty eight", "अरसठ");
		englishToHindiMapFor21to99.put("sixty nine", "उनहत्तर");
		englishToHindiMapFor21to99.put("seventy one", "इकहत्तर");
		englishToHindiMapFor21to99.put("seventy two", "बहत्तर");
		englishToHindiMapFor21to99.put("seventy three", "तिहत्तर");
		englishToHindiMapFor21to99.put("seventy four", "चौहत्तर");
		englishToHindiMapFor21to99.put("seventy five", "पिचत्तर");
		englishToHindiMapFor21to99.put("seventy six", "छिहत्तर");
		englishToHindiMapFor21to99.put("seventy seven", "सतत्तर");
		englishToHindiMapFor21to99.put("seventy eight", "अठत्तर");
		englishToHindiMapFor21to99.put("seventy nine", "उनासी");
		englishToHindiMapFor21to99.put("eighty one", "इक्यासी");
		englishToHindiMapFor21to99.put("eighty two", "ब्यासी");
		englishToHindiMapFor21to99.put("eighty three", "तिरासी");
		englishToHindiMapFor21to99.put("eighty four", "चौरासी");
		englishToHindiMapFor21to99.put("eighty five", "पिचासी");
		englishToHindiMapFor21to99.put("eighty six", "छियासी");
		englishToHindiMapFor21to99.put("eighty seven", "सतासी");
		englishToHindiMapFor21to99.put("eighty eight", "अठासी");
		englishToHindiMapFor21to99.put("eighty nine", "नवासी");
		englishToHindiMapFor21to99.put("ninety one", "इक्यानवे");
		englishToHindiMapFor21to99.put("ninety two", "बानवे");
		englishToHindiMapFor21to99.put("ninety three", "तिरानवे");
		englishToHindiMapFor21to99.put("ninety four", "चौरानवे");
		englishToHindiMapFor21to99.put("ninety five", "पिञ्चानवे");
		englishToHindiMapFor21to99.put("ninety six", "छियानवे");
		englishToHindiMapFor21to99.put("ninety seven", "सत्तानवे");
		englishToHindiMapFor21to99.put("ninety eight", "अठ्ठानवे");
		englishToHindiMapFor21to99.put("ninety nine", "निन्यानवे");
    }

    public static String englishToHindiMapFor21to99(String inputString) {
        for (Map.Entry<String, String> entry : englishToHindiMapFor21to99.entrySet()) {
            inputString = inputString.toLowerCase().replace(entry.getKey(), entry.getValue());
        }
        return inputString;
    }

    public static String convertToHindi(String inputString) {
        String[] words = inputString.toLowerCase().split("\\s+");
        StringBuilder hindiAmount = new StringBuilder();

        for (String word : words) {
            Matcher matchedTextToHindi = isHindi.matcher(word);
            if (!matchedTextToHindi.find()) {
                if (englishToHindiMap.containsKey(word)) {
                    hindiAmount.append(englishToHindiMap.get(word)).append(" ");
                } else {
                    return "Invalid Input";
                }
            } else {
                hindiAmount.append(word).append(" ");
            }
        }
        return hindiAmount.toString().trim();
    }

    public static void main(String[] args) {
        String inputString = "twenty one lakh crore Fifty Five Hundred thirty two rupees And zero Paise";
        String hindiAmount1 = englishToHindiMapFor21to99(inputString);
        String hindiAmount = convertToHindi(hindiAmount1);

       // System.out.println(inputString + " in Hindi is: " + hindiAmount1);
        System.out.println(inputString + " in Hindi is: " + hindiAmount);
    }
}
