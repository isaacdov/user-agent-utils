package eu.bitwalker.useragentutils;

import java.util.regex.*;
/**
 * Enum constants classifying the different types of languages which are common in user-agent strings
 * @author 
 *
 */

public enum Language {
	
	AFAR ("Afar", "aa", "aar" ),
	ABKHAZIAN ("Abkhazian", "ab", "abk" ),
	AVESTAN ("Avestan", "ae", "ave" ),
	AFRIKAANS ("Afrikaans", "af", "afr" ),
	AKAN ("Akan", "ak", "aka" ),
	AMHARIC ("Amharic", "am", "amh" ),
	ARAGONESE ("Aragonese", "an", "arg" ),
	ARABIC ("Arabic", "ar", "ara" ),
	ASSAMESE ("Assamese", "as", "asm" ),
	AVARIC ("Avaric", "av", "ava" ),
	AYMARA ("Aymara", "ay", "aym" ),
	AZERBAIJANI ("Azerbaijani", "az", "aze" ),
	BASHKIR ("Bashkir", "ba", "bak" ),
	BELARUSIAN ("Belarusian", "be", "bel" ),
	BULGARIAN ("Bulgarian", "bg", "bul" ),
	BIHARI ("Bihari", "bh", "bih" ),
	BISLAMA ("Bislama", "bi", "bis" ),
	BAMBARA ("Bambara", "bm", "bam" ),
	BENGALI ("Bengali", "bn", "ben" ),
	TIBETAN ("Tibetan", "bo", "tib" ),
	BRETON ("Breton", "br", "bre" ),
	BOSNIAN ("Bosnian", "bs", "bos" ),
	CATALAN ("Catalan", "ca", "cat" ),
	CHECHEN ("Chechen", "ce", "che" ),
	CHAMORRO ("Chamorro", "ch", "cha" ),
	CORSICAN ("Corsican", "co", "cos" ),
	CREE ("Cree", "cr", "cre" ),
	CZECH ("Czech", "cs", "cze" ),
	CHURCHSLAVIC ("ChurchSlavic", "cu", "chu" ),
	CHUVASH ("Chuvash", "cv", "chv" ),
	WELSH ("Welsh", "cy", "wel" ),
	DANISH ("Danish", "da", "dan" ),
	GERMAN ("German", "de", "ger" ),
	DHIVEHI ("Dhivehi", "dv", "div" ),
	DZONGKHA ("Dzongkha", "dz", "dzo" ),
	EWE ("Ewe", "ee", "ewe" ),
	GREEK_MODERN ("Greek,Modern(1453-)", "el", "gre" ),
	ENGLISH ("English", "en", "eng" ),
	ESPERANTO ("Esperanto", "eo", "epo" ),
	SPANISH ("Spanish", "es", "spa" ),
	ESTONIAN ("Estonian", "et", "est" ),
	BASQUE ("Basque", "eu", "baq" ),
	PERSIAN ("Persian", "fa", "per" ),
	FULAH ("Fulah", "ff", "ful" ),
	FINNISH ("Finnish", "fi", "fin" ),
	FIJIAN ("Fijian", "fj", "fij" ),
	FAROESE ("Faroese", "fo", "fao" ),
	FRENCH ("French", "fr", "fre" ),
	WESTERNFRISIAN ("WesternFrisian", "fy", "fry" ),
	IRISH ("Irish", "ga", "gle" ),
	GAELIC ("Gaelic", "gd", "gla" ),
	GALICIAN ("Galician", "gl", "glg" ),
	GUARANI ("Guarani", "gn", "grn" ),
	GUJARATI ("Gujarati", "gu", "guj" ),
	MANX ("Manx", "gv", "glv" ),
	HAUSA ("Hausa", "ha", "hau" ),
	HEBREW ("Hebrew", "he", "heb" ),
	HINDI ("Hindi", "hi", "hin" ),
	HIRIMOTU ("HiriMotu", "ho", "hmo" ),
	CROATIAN ("Croatian", "hr", "scr" ),
	HAITIAN ("Haitian", "ht", "hat" ),
	HUNGARIAN ("Hungarian", "hu", "hun" ),
	ARMENIAN ("Armenian", "hy", "arm" ),
	HERERO ("Herero", "hz", "her" ),
	INTERLINGUA_INTERNAT ("Interlingua(Internat", "ia", "ina" ),
	INDONESIAN ("Indonesian", "id", "ind" ),
	INTERLINGUE ("Interlingue", "ie", "ile" ),
	IGBO ("Igbo", "ig", "ibo" ),
	NUOSU ("Nuosu", "ii", "iii" ),
	INUPIAQ ("Inupiaq", "ik", "ipk" ),
	IDO ("Ido", "io", "ido" ),
	ICELANDIC ("Icelandic", "is", "ice" ),
	ITALIAN ("Italian", "it", "ita" ),
	INUKTITUT ("Inuktitut", "iu", "iku" ),
	JAPANESE ("Japanese", "ja", "jpn" ),
	JAVANESE ("Javanese", "jv", "jav" ),
	GEORGIAN ("Georgian", "ka", "geo" ),
	KONGO ("Kongo", "kg", "kon" ),
	GIKUYU ("Gikuyu", "ki", "kik" ),
	KUANYAMA ("Kuanyama", "kj", "kua" ),
	KAZAKH ("Kazakh", "kk", "kaz" ),
	GREENLANDIC ("Greenlandic", "kl", "kal" ),
	CENTRALKHMER ("CentralKhmer", "km", "khm" ),
	KANNADA ("Kannada", "kn", "kan" ),
	KOREAN ("Korean", "ko", "kor" ),
	KANURI ("Kanuri", "kr", "kau" ),
	KASHMIRI ("Kashmiri", "ks", "kas" ),
	KURDISH ("Kurdish", "ku", "kur" ),
	KOMI ("Komi", "kv", "kom" ),
	CORNISH ("Cornish", "kw", "cor" ),
	KIRGHIZ ("Kirghiz", "ky", "kir" ),
	LATIN ("Latin", "la", "lat" ),
	LETZEBURGESCH ("Letzeburgesch", "lb", "ltz" ),
	GANDA ("Ganda", "lg", "lug" ),
	LIMBURGAN ("Limburgan", "li", "lim" ),
	LINGALA ("Lingala", "ln", "lin" ),
	LAO ("Lao", "lo", "lao" ),
	LITHUANIAN ("Lithuanian", "lt", "lit" ),
	LUBA_KATANGA ("Luba-Katanga", "lu", "lub" ),
	LATVIAN ("Latvian", "lv", "lav" ),
	MALAGASY ("Malagasy", "mg", "mlg" ),
	MARSHALLESE ("Marshallese", "mh", "mah" ),
	MAORI ("Maori", "mi", "mao" ),
	MACEDONIAN ("Macedonian", "mk", "mac" ),
	MALAYALAM ("Malayalam", "ml", "mal" ),
	MONGOLIAN ("Mongolian", "mn", "mon" ),
	MOLDAVIAN ("Moldavian", "mo", "mol" ),
	MARATHI ("Marathi", "mr", "mar" ),
	MALAY ("Malay", "ms", "may" ),
	MALTESE ("Maltese", "mt", "mlt" ),
	BURMESE ("Burmese", "my", "bur" ),
	NAURU ("Nauru", "na", "nau" ),
	BOKMåL_NORWEGIAN ("Bokmål,Norwegian", "nb", "nob" ),
	NDEBELE_NORTH ("Ndebele,North", "nd", "nde" ),
	NEPALI ("Nepali", "ne", "nep" ),
	NDONGA ("Ndonga", "ng", "ndo" ),
	DUTCH ("Dutch", "nl", "dut" ),
	NORWEGIANNYNORSK ("NorwegianNynorsk", "nn", "nno" ),
	NORWEGIAN ("Norwegian", "no", "nor" ),
	NDEBELE_SOUTH ("Ndebele,South", "nr", "nbl" ),
	NAVAHO ("Navaho", "nv", "nav" ),
	CHICHEWA ("Chichewa", "ny", "nya" ),
	OCCITAN_POST1500 ("Occitan(post1500)", "oc", "oci" ),
	OJIBWA ("Ojibwa", "oj", "oji" ),
	OROMO ("Oromo", "om", "orm" ),
	ORIYA ("Oriya", "or", "ori" ),
	OSSETIAN ("Ossetian", "os", "oss" ),
	PANJABI ("Panjabi", "pa", "pan" ),
	PALI ("Pali", "pi", "pli" ),
	POLISH ("Polish", "pl", "pol" ),
	PASHTO ("Pashto", "ps", "pus" ),
	PORTUGUESE ("Portuguese", "pt", "por" ),
	QUECHUA ("Quechua", "qu", "que" ),
	ROMANSH ("Romansh", "rm", "roh" ),
	RUNDI ("Rundi", "rn", "run" ),
	ROMANIAN ("Romanian", "ro", "rum" ),
	RUSSIAN ("Russian", "ru", "rus" ),
	KINYARWANDA ("Kinyarwanda", "rw", "kin" ),
	SANSKRIT ("Sanskrit", "sa", "san" ),
	SARDINIAN ("Sardinian", "sc", "srd" ),
	SINDHI ("Sindhi", "sd", "snd" ),
	NORTHERNSAMI ("NorthernSami", "se", "sme" ),
	SANGO ("Sango", "sg", "sag" ),
	SINHALA ("Sinhala", "si", "sin" ),
	SLOVAK ("Slovak", "sk", "slo" ),
	SLOVENIAN ("Slovenian", "sl", "slv" ),
	SAMOAN ("Samoan", "sm", "smo" ),
	SHONA ("Shona", "sn", "sna" ),
	SOMALI ("Somali", "so", "som" ),
	ALBANIAN ("Albanian", "sq", "alb" ),
	SERBIAN ("Serbian", "sr", "scc" ),
	SWATI ("Swati", "ss", "ssw" ),
	SOTHO_SOUTHERN ("Sotho,Southern", "st", "sot" ),
	SUNDANESE ("Sundanese", "su", "sun" ),
	SWEDISH ("Swedish", "sv", "swe" ),
	SWAHILI ("Swahili", "sw", "swa" ),
	TAMIL ("Tamil", "ta", "tam" ),
	TELUGU ("Telugu", "te", "tel" ),
	TAJIK ("Tajik", "tg", "tgk" ),
	THAI ("Thai", "th", "tha" ),
	TIGRINYA ("Tigrinya", "ti", "tir" ),
	TURKMEN ("Turkmen", "tk", "tuk" ),
	TAGALOG ("Tagalog", "tl", "tgl" ),
	TSWANA ("Tswana", "tn", "tsn" ),
	TONGA_TONGAISLANDS ("Tonga(TongaIslands)", "to", "ton" ),
	TURKISH ("Turkish", "tr", "tur" ),
	TSONGA ("Tsonga", "ts", "tso" ),
	TATAR ("Tatar", "tt", "tat" ),
	TWI ("Twi", "tw", "twi" ),
	TAHITIAN ("Tahitian", "ty", "tah" ),
	UIGHUR ("Uighur", "ug", "uig" ),
	UKRAINIAN ("Ukrainian", "uk", "ukr" ),
	URDU ("Urdu", "ur", "urd" ),
	UZBEK ("Uzbek", "uz", "uzb" ),
	VENDA ("Venda", "ve", "ven" ),
	VIETNAMESE ("Vietnamese", "vi", "vie" ),
	VOLAPüK ("Volapük", "vo", "vol" ),
	WALLOON ("Walloon", "wa", "wln" ),
	WOLOF ("Wolof", "wo", "wol" ),
	XHOSA ("Xhosa", "xh", "xho" ),
	YIDDISH ("Yiddish", "yi", "yid" ),
	YORUBA ("Yoruba", "yo", "yor" ),
	CHUANG ("Chuang", "za", "zha" ),
	CHINESE ("Chinese", "zh", "chi" ),
	ZULU ("Zulu", "zu", "zul" ),
	UNKNOWN( "Unknown", null, null );
	
	private String name;
	private String code;
	private String threeLettercode;
	
	
	private Language(String name, String code, String threeLettercode) {
		this.name = name;
		this.code = code;
		this.threeLettercode = threeLettercode;
	}

	public String getName() {
		return name;
	}
	
	public String getCode() {
		return code;
	}
	
	
	public String getThreeLetterCode() {
		return threeLettercode;
	}
	
	
	/**
	 * Iterates over all Browsers to compare the browser signature with 
	 * the user agent string. If no match can be found Language.UNKNOWN will
	 * be returned.
	 * @param agentString
	 * @return Language
	 */
	public static Language parseUserAgentString(String agentString)
	{
		
		for (Language language : Language.values())
		{
			Language match = language.checkUserAgent(agentString);
			if (match != null) {
				return match; 
			}
		}
	
		return Language.UNKNOWN;
	}
	
	public Language checkUserAgent(String userAgentString) {
		Pattern pattern = Pattern.compile("\\s"+this.code+"\\-[a-z][a-z][;|\\)]",Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(userAgentString);
		if (matcher.find()) {			
			return this;				
		} else {
			return null;
		}
	}

	public static Language findLanguageUsingLanguageCode (String code) {
		if (code == null) 
			return Language.UNKNOWN;
		for (Language language : Language.values())
		{
			if (code.equals(language.getCode()) ||  code.equals(language.getThreeLetterCode())) {
				return language;
			}
		}
		return Language.UNKNOWN;
	}
	

}
