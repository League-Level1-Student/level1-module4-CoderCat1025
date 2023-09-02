package _08_pig_latin;

public class PigLatinTranslatorRunner {
@SuppressWarnings("static-access")
public static void main(String[] args) {
	PigLatinTranslator translator = new PigLatinTranslator();
	System.out.println(translator.translatePigLatinToEnglish("an-Cay ou-yay eak-spay ig-pay atin-lay?"));
	System.out.println(translator.translateEnglishToPigLatin("Hello. I am speaking Pig Latin."));
}
}
