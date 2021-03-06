import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.*;


public class CountriesList extends JPanel {
    public static JComboBox countriesList;
    public static JComboBox countriesList2;
    public static ImageIcon[] images;
    public static String s =
            "AbkhazianApsar(ABK)\n" +
                    "AfghanistanAfghani(AFN)\n" +
                    "AlbanianLek(ALL)\n" +
                    "AlderneyPound(none)\n" +
                    "AlgerianDinar(DZD)\n" +
                    "AndorranFranc(ADF)\n" +
                    "AndorranPeseta(ADP)\n" +
                    "AngolanKwanza(AOA)\n" +
                    "AngolanOldKwanza(AON)\n" +
                    "ArgentinePeso(ARS)\n" +
                    "ArmenianDram(AMD)\n" +
                    "ArtsakhDram(none)\n" +
                    "ArubanFlorin(AWG)\n" +
                    "AustralianDollar(AUD)\n" +
                    "AustrianSchilling(ATS)\n" +
                    "AzerbaijaninewManat(AZN)\n" +
                    "AzerbaijanOldManat(AZM)\n" +
                    "BahamianDollar(BSD)\n" +
                    "BahrainiDinar(BHD)\n" +
                    "BangladeshiTaka(BDT)\n" +
                    "BarbadosDollar(BBD)\n" +
                    "BelarusianOldRuble(BYR)\n" +
                    "BelarusianRuble(BYN)\n" +
                    "BelgianFranc(BEF)\n" +
                    "BelizeDollar(BZD)\n" +
                    "BermudianDollar(BMD)\n" +
                    "BhutaneseNgultrum(BTN)\n" +
                    "Bitcoin(BTC)\n" +
                    "Bolivianboliviano(BOB)\n" +
                    "BosniaandHerzegovinaconvertiblemark(BAM)\n" +
                    "BotswanaPula(BWP)\n" +
                    "BrazilianReal(BRL)\n" +
                    "BritishPound(GBP)\n" +
                    "BruneiDollar(BND)\n" +
                    "BulgarianLev(BGN)\n" +
                    "BulgarianOldLev(BGL)\n" +
                    "BurmeseKyat(MMK)\n" +
                    "BurundianFranc(BIF)\n" +
                    "CambodianRiel(KHR)\n" +
                    "CanadianDollar(CAD)\n" +
                    "CapeVerdeanEscudo(CVE)\n" +
                    "CaymanIslandsDollar(KYD)\n" +
                    "CentralAfricanCFAfranc(BEAC/XAF)\n" +
                    "CentralPacificFranc(CFP)\n" +
                    "CFPFranc(XPF)\n" +
                    "ChileanPeso(CLP)\n" +
                    "ChileanUnidaddeFomento(CLF)\n" +
                    "ChineseYuanRenminbi(CNY)\n" +
                    "ChineseYuanRenminbi(offshore)(CNH)\n" +
                    "ColombianPeso(COP)\n" +
                    "ComorianFranc(KMF)\n" +
                    "CongoleseFranc(CDF)\n" +
                    "CookIslandsDollar(CKD)\n" +
                    "CostRicanColon(CRC)\n" +
                    "CroatianKuna(HRK)\n" +
                    "CubanConvertiblePeso(CUC)\n" +
                    "CubanPeso(CUP)\n" +
                    "CyprusPound(CYP)\n" +
                    "CzechKoruna(CZK)\n" +
                    "DanishKrone(DKK)\n" +
                    "DjiboutianFranc(DJF)\n" +
                    "DominicanPeso(DOP)\n" +
                    "DutchGuilder(NLG)\n" +
                    "EasternCaribbeanDollar(XCD)\n" +
                    "EcuadorSucre(ECS)\n" +
                    "EgyptianPound(EGP)\n" +
                    "ElSalvadorColon(SVC)\n" +
                    "EritreanNakfa(ERN)\n" +
                    "EstonianKroon(ERN)\n" +
                    "Ethereum(ETH)\n" +
                    "EthiopianBirr(ETB)\n" +
                    "Euro(EUR)\n" +
                    "EuropeanCurrencyUnit(ECU)\n" +
                    "FalklandIslandsPound(FKP)\n" +
                    "FaroeseKrona(FOK)\n" +
                    "FijianDollar(FJD)\n" +
                    "FinnishMarkka(FIM)\n" +
                    "FrenchFranc(FRF)\n" +
                    "GambianDalasi(GMD)\n" +
                    "GeorgianLari(GEL)\n" +
                    "GermanMark(DEM)\n" +
                    "GhanaianCedi(GHC)\n" +
                    "GhanaianNewCedi(GHS)\n" +
                    "GibraltarPound(GIP)\n" +
                    "Gold(oz.)(XAU)\n" +
                    "GreekDrachma(GRD)\n" +
                    "GuatemalanQuetzal(GTQ)\n" +
                    "GuernseyPound(GGP)\n" +
                    "GuineanFranc(GNF)\n" +
                    "GuyaneseDollar(GYD)\n" +
                    "HaitianGourde(HTG)\n" +
                    "HonduranLempira(HNL)\n" +
                    "HongKongDollar(HKD)\n" +
                    "HungarianForint(HUF)\n" +
                    "IcelandicKrona(ISK)\n" +
                    "IndianRupee(INR)\n" +
                    "IndonesianRupiah(IDR)\n" +
                    "IranianRial(IRR)\n" +
                    "IraqiDinar(IQD)\n" +
                    "IrishPunt(IEP)\n" +
                    "IsraeliNewShekel(ILS)\n" +
                    "ItalianLira(ITL)\n" +
                    "JamaicanDollar(JMD)\n" +
                    "JapaneseYen(JPY)\n" +
                    "JerseyPound(JEP)\n" +
                    "JordanianDinar(JOD)\n" +
                    "KazakhstaniTenge(KZT)\n" +
                    "KenyanShilling(KES)\n" +
                    "KiribatiDollar(KID)\n" +
                    "KuwaitiDinar(KWD)\n" +
                    "KyrgyzstaniSom(KGS)\n" +
                    "LaoKip(LAK)\n" +
                    "LebanesePound(LBP)\n" +
                    "LesothoLoti(LSL)\n" +
                    "LiberianDollar(LRD)\n" +
                    "LibyanDinar(LYD)\n" +
                    "Litecoin(LTC)\n" +
                    "LithuanianLitas(LTL)\n" +
                    "LuxembourgFranc(LUF)\n" +
                    "MacanesePataca(MOP)\n" +
                    "MacedonianDenar(MKD)\n" +
                    "MalagasyAriary(MGA)\n" +
                    "MalagasyFranc(MGF)\n" +
                    "MalawianKwacha(MWK)\n" +
                    "MalaysianRinggit(MYR)\n" +
                    "MaldivianRufiyaa(MVR)\n" +
                    "MalteseLira(MTL)\n" +
                    "ManxPound(IMP)\n" +
                    "MauritanianOldOuguiya(MRO)\n" +
                    "MauritanianOuguiya(MRU)\n" +
                    "MauritianRupee(MUR)\n" +
                    "MexicanPeso(MXN)\n" +
                    "MoldovanLeu(MDL)\n" +
                    "MongolianTugrik(MNT)\n" +
                    "MoroccanDirham(MAD)\n" +
                    "MozambiqueMetical(MZM)\n" +
                    "MozambiqueNewMetical(MZN)\n" +
                    "MyanmarKyat(MMK)\n" +
                    "NamibianDollar(NAD)\n" +
                    "NepaleseRupee(NPR)\n" +
                    "NetherlandsAntilleanGuilder(ANG)\n" +
                    "NewTaiwanDollar(TWD)\n" +
                    "NewZealandDollar(NZD)\n" +
                    "NicaraguanCordobaOro(NIO)\n" +
                    "NigerianNaira(NGN)\n" +
                    "NiueDollar(none)\n" +
                    "NorthKoreanWon(KPW)\n" +
                    "NorwegianKroner(NOK)\n" +
                    "OmaniRial(OMR)\n" +
                    "PakistaniRupee(PKR)\n" +
                    "Palladium(oz.)(XPD)\n" +
                    "PanamanianBalboa(PAB)\n" +
                    "PapuaNewGuineanKina(PGK)\n" +
                    "ParaguayanGuarani(PYG)\n" +
                    "PeruvianNuevoSol(PEN)\n" +
                    "PhilippinePeso(PHP)\n" +
                    "PitcairnIslandsDollar(PND)\n" +
                    "Platinum(oz.)(XPT)\n" +
                    "PolishOldZloty(PLZ)\n" +
                    "PolishZloty(PLN)\n" +
                    "PortugueseEscudo(PTE)\n" +
                    "QatariRiyal(QAR)\n" +
                    "RomanianLeu(ROL)\n" +
                    "RomanianNewLeu(RON)\n" +
                    "RTGSDollar(ZWB)\n" +
                    "RussianRuble(RUB)\n" +
                    "RwandanFranc(RWF)\n" +
                    "SahrawiPeseta(none)\n" +
                    "SaintHelenaPound(SHP)\n" +
                    "SamoanTala(WST)\n" +
                    "SaoTomeandPrincipeDobra(STN)\n" +
                    "SaoTomeandPrincipeOldDobra(STD)\n" +
                    "SaudiRiyal(SAR)\n" +
                    "SerbianDinar(RSD)\n" +
                    "SerbianOldDinar(CSD)\n" +
                    "SeychellesRupee(SCR)\n" +
                    "SierraLeoneanLeone(SLL)\n" +
                    "Silver(oz.)XAG\n" +
                    "SingaporeDollar(SGD)\n" +
                    "SlovakKoruna(SKK)\n" +
                    "SlovenianTolar(SIT)\n" +
                    "SolomonIslandsDollar(SBD)\n" +
                    "SomaliShilling(SOS)\n" +
                    "SouthAfricanRand(ZAR)\n" +
                    "SouthKoreanWon(KRW)\n" +
                    "SouthSudanesepound\n" +
                    "SpanishPeseta(ESP)\n" +
                    "SriLankanRupee(LKR)\n" +
                    "SudaneseDinar(SDD)\n" +
                    "SudaneseOldPound(SDP)\n" +
                    "SudanesePound(SDG)\n" +
                    "SurinameGuilder(SRG)\n" +
                    "SurinameseDollar(SRD)\n" +
                    "SwazilandLilangeni(SZL)\n" +
                    "SwedishKrona(SEK)\n" +
                    "SwissFranc(CHF)\n" +
                    "SyrianPound(SYP)\n" +
                    "TaiwanDollar(TWD)\n" +
                    "TajikistaniSomoni(TJS)\n" +
                    "TanzanianShilling(TZS)\n" +
                    "ThaiBaht(THB)\n" +
                    "TonganPa???anga(TOP)\n" +
                    "TransnistrianRuble(PRB)\n" +
                    "TrinidadandTobagoDollar(TTD)\n" +
                    "TunisianDinar(TND)\n" +
                    "TurkishLira(TRY)\n" +
                    "TurkishOldLira(TRL)\n" +
                    "TurkmenistanManat(TMM)\n" +
                    "TurkmenistanNewManat(TMT)\n" +
                    "TuvaluanDollar(TVD)\n" +
                    "UgandanShilling(UGX)\n" +
                    "UgandaOldShilling(UGS)\n" +
                    "UkrainianHryvnia(UAH)\n" +
                    "UnitedArabEmiratesDirham(AED)\n" +
                    "UnitedStatesDollar(USD)\n" +
                    "UruguayanOldPeso(UYP)\n" +
                    "UruguayanPeso(UYU)\n" +
                    "UzbekistanSom(UZS)\n" +
                    "VanuatuVatu(VUV)\n" +
                    "VenezuelanBolivar(VEB)\n" +
                    "VenezuelanBolivarFuerte(VEF)\n" +
                    "VenezuelanBolivarSoberano(VES)\n" +
                    "VietnameseDong(VND)\n" +
                    "WestAfricanCFAFranc(XOF)\n" +
                    "YemeniRial(YER)\n" +
                    "YugoslavDinar(YUN)\n" +
                    "ZambianKwacha(ZMW)\n" +
                    "ZimbabweDollar(ZWL)\n";

    public static  String[] countries = s.split("\\s");

    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = CountriesList.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    public static void createAndShowGUI() throws IOException {

        images = new ImageIcon[countries.length];
        Integer[] intArray = new Integer[countries.length];
        for (int i = 0; i < countries.length; i++) {
            intArray[i] = new Integer(i);
            images[i] = createImageIcon("png/abkhazian.png");
            images[1] = createImageIcon("png/afghanistan.png");
            images[2] = createImageIcon("png/albania.png");
            images[3] = createImageIcon("png/unitedkingdom.png");
            images[4] = createImageIcon("png/algeria.png");
            images[5] = createImageIcon("png/andorra.png");
            images[6] = createImageIcon("png/andorra.png");
            images[7] = createImageIcon("png/angola.png");
            images[8] = createImageIcon("png/angola.png");
            images[9] = createImageIcon("png/argentina.png");
            images[10] = createImageIcon("png/armenia.png");
            images[11] = createImageIcon("png/armenia.png");
            images[12] = createImageIcon("png/aruba.png");
            images[13] = createImageIcon("png/australia.png");
            images[14] = createImageIcon("png/austria.png");
            images[15] = createImageIcon("png/azerbaijan.png");
            images[16] = createImageIcon("png/azerbaijan.png");
            images[17] = createImageIcon("png/bahamas.png");
            images[18] = createImageIcon("png/bahrain.png");
            images[19] = createImageIcon("png/bangladesh.png");
            images[20] = createImageIcon("png/barbados.png");
            images[21] = createImageIcon("png/belarus.png");
            images[22] = createImageIcon("png/belarus.png");
            images[23] = createImageIcon("png/belgium.png");
            images[24] = createImageIcon("png/belize.png");
            images[25] = createImageIcon("png/bermuda.png");
            images[26] = createImageIcon("png/bhutan.png");
            images[27] = createImageIcon("png/bitcoin.png");
            images[28] = createImageIcon("png/bolivia.png");
            images[29] = createImageIcon("png/bosnia.png");
            images[30] = createImageIcon("png/botswana.png");
            images[31] = createImageIcon("png/brazil.png");
            images[32] = createImageIcon("png/unitedkingdom.png");
            images[33] = createImageIcon("png/brunei.png");
            images[34] = createImageIcon("png/bulgaria.png");
            images[35] = createImageIcon("png/bulgaria.png");
            images[36] = createImageIcon("png/myanmar.png");
            images[37] = createImageIcon("png/burundi.png");
            images[38] = createImageIcon("png/cambodia.png");
            images[39] = createImageIcon("png/canada.png");
            images[40] = createImageIcon("png/capeverde.png");
            images[41] = createImageIcon("png/caymanislands.png");
            images[42] = createImageIcon("png/centralafrica.png");
            images[43] = createImageIcon("png/frenchpolynesia.png");
            images[44] = createImageIcon("png/XPF.png");
            images[45] = createImageIcon("png/chile.png");
            images[46] = createImageIcon("png/chile.png");
            images[47] = createImageIcon("png/china.png");
            images[48] = createImageIcon("png/china.png");
            images[49] = createImageIcon("png/colombia.png");
            images[50] = createImageIcon("png/comoros.png");
            images[51] = createImageIcon("png/demrepofcongo.png");
            images[52] = createImageIcon("png/cookislands.png");
            images[53] = createImageIcon("png/costarica.png");
            images[54] = createImageIcon("png/croatia.png");
            images[55] = createImageIcon("png/cuba.png");
            images[56] = createImageIcon("png/cuba.png");
            images[57] = createImageIcon("png/cyprus.png");
            images[58] = createImageIcon("png/czechrepublic.png");
            images[59] = createImageIcon("png/denmark.png");
            images[60] = createImageIcon("png/djibouti.png");
            images[61] = createImageIcon("png/dominicanrep.png");
            images[62] = createImageIcon("png/netherlands .png");
            images[63] = createImageIcon("png/XCD.png");
            images[64] = createImageIcon("png/ecuador.png");
            images[65] = createImageIcon("png/egypt.png");
            images[66] = createImageIcon("png/elsalvador.png");
            images[67] = createImageIcon("png/eritrea.png");
            images[68] = createImageIcon("png/estonia.png");
            images[69] = createImageIcon("png/ethereum.png");
            images[70] = createImageIcon("png/ethiopia.png");
            images[71] = createImageIcon("png/europeanunion.png");
            images[72] = createImageIcon("png/europeanunion.png");
            images[73] = createImageIcon("png/falklandislands.png");
            images[74] = createImageIcon("png/faroeislands.png");
            images[75] = createImageIcon("png/fiji.png");
            images[76] = createImageIcon("png/finland.png");
            images[77] = createImageIcon("png/france.png");
            images[78] = createImageIcon("png/gambia.png");
            images[79] = createImageIcon("png/georgia.png");
            images[80] = createImageIcon("png/germany.png");
            images[81] = createImageIcon("png/ghana.png");
            images[82] = createImageIcon("png/ghana.png");
            images[83] = createImageIcon("png/gibraltar.png");
            images[84] = createImageIcon("png/gold.png");
            images[85] = createImageIcon("png/greece.png");
            images[86] = createImageIcon("png/guatemala.png");
            images[87] = createImageIcon("png/guernsey.png");
            images[88] = createImageIcon("png/guinea.png");
            images[89] = createImageIcon("png/guyana.png");
            images[90] = createImageIcon("png/haiti.png");
            images[91] = createImageIcon("png/honduras.png");
            images[92] = createImageIcon("png/hongkong.png");
            images[93] = createImageIcon("png/hungary.png");
            images[94] = createImageIcon("png/iceland.png");
            images[95] = createImageIcon("png/india.png");
            images[96] = createImageIcon("png/indonesia.png");
            images[97] = createImageIcon("png/iran.png");
            images[98] = createImageIcon("png/iraq.png");
            images[99] = createImageIcon("png/ireland.png");
            images[100] = createImageIcon("png/israel.png");
            images[101] = createImageIcon("png/italy.png");
            images[102] = createImageIcon("png/jamaica.png");
            images[103] = createImageIcon("png/japan.png");
            images[104] = createImageIcon("png/jersey.png");
            images[105] = createImageIcon("png/jordan.png");
            images[106] = createImageIcon("png/kazakhstan.png");
            images[107] = createImageIcon("png/kenya.png");
            images[108] = createImageIcon("png/kiribati.png");
            images[109] = createImageIcon("png/kuwait.png");
            images[110] = createImageIcon("png/kyrgyzstan.png");
            images[111] = createImageIcon("png/laos.png");
            images[112] = createImageIcon("png/lebanon.png");
            images[113] = createImageIcon("png/lesotho.png");
            images[114] = createImageIcon("png/liberia.png");
            images[115] = createImageIcon("png/libya.png");
            images[116] = createImageIcon("png/litecoin.png");
            images[117] = createImageIcon("png/lithuania.png");
            images[118] = createImageIcon("png/luxembourg.png");
            images[119] = createImageIcon("png/macao.png");
            images[120] = createImageIcon("png/republicofmacedonia.png");
            images[121] = createImageIcon("png/madagascar.png");
            images[122] = createImageIcon("png/madagascar.png");
            images[123] = createImageIcon("png/malawi.png");
            images[124] = createImageIcon("png/malaysia.png");
            images[125] = createImageIcon("png/maldives.png");
            images[126] = createImageIcon("png/malta.png");
            images[127] = createImageIcon("png/isleofman.png");
            images[128] = createImageIcon("png/mauritania.png");
            images[129] = createImageIcon("png/mauritania.png");
            images[130] = createImageIcon("png/mauritius.png");
            images[131] = createImageIcon("png/mexico.png");
            images[132] = createImageIcon("png/moldova.png");
            images[133] = createImageIcon("png/mongolia.png");
            images[134] = createImageIcon("png/morocco.png");
            images[135] = createImageIcon("png/mozambique.png");
            images[136] = createImageIcon("png/mozambique.png");
            images[137] = createImageIcon("png/myanmar.png");
            images[138] = createImageIcon("png/namibia.png");
            images[139] = createImageIcon("png/nepal.png");
            images[140] = createImageIcon("png/netherlands .png");
            images[141] = createImageIcon("png/taiwan.png");
            images[142] = createImageIcon("png/newzealand.png");
            images[143] = createImageIcon("png/nicaragua.png");
            images[144] = createImageIcon("png/nigeria.png");
            images[145] = createImageIcon("png/niue.png");
            images[146] = createImageIcon("png/northkorea.png");
            images[147] = createImageIcon("png/norway.png");
            images[148] = createImageIcon("png/oman.png");
            images[149] = createImageIcon("png/pakistan.png");
            images[150] = createImageIcon("png/palladium.png");
            images[151] = createImageIcon("png/panama.png");
            images[152] = createImageIcon("png/papuanewguinea.png");
            images[153] = createImageIcon("png/paraguay.png");
            images[154] = createImageIcon("png/peru.png");
            images[155] = createImageIcon("png/philippines.png");
            images[156] = createImageIcon("png/pitcairnislands.png");
            images[157] = createImageIcon("png/platinum.png");
            images[158] = createImageIcon("png/poland.png");
            images[159] = createImageIcon("png/poland.png");
            images[160] = createImageIcon("png/portugal.png");
            images[161] = createImageIcon("png/qatar.png");
            images[162] = createImageIcon("png/romania.png");
            images[163] = createImageIcon("png/romania.png");
            images[164] = createImageIcon("png/zimbabwe.png");
            images[165] = createImageIcon("png/russia.png");
            images[166] = createImageIcon("png/rwanda.png");
            images[167] = createImageIcon("png/sahrawiarabdemrep.png");
            images[168] = createImageIcon("png/sainthelena.png");
            images[169] = createImageIcon("png/samoa.png");
            images[170] = createImageIcon("png/saotomeandprince.png");
            images[171] = createImageIcon("png/saotomeandprince.png");
            images[172] = createImageIcon("png/saudiarabia.png");
            images[173] = createImageIcon("png/serbia.png");
            images[174] = createImageIcon("png/serbia.png");
            images[175] = createImageIcon("png/seychelles.png");
            images[176] = createImageIcon("png/sierraleone.png");
            images[177] = createImageIcon("png/silver.png");
            images[178] = createImageIcon("png/singapore.png");
            images[179] = createImageIcon("png/slovakia.png");
            images[180] = createImageIcon("png/slovenia.png");
            images[181] = createImageIcon("png/solomonislands.png");
            images[182] = createImageIcon("png/somalia.png");
            images[183] = createImageIcon("png/southafrica.png");
            images[184] = createImageIcon("png/southkorea.png");
            images[185] = createImageIcon("png/southsudan.png");
            images[186] = createImageIcon("png/spain.png");
            images[187] = createImageIcon("png/srilanka.png");
            images[188] = createImageIcon("png/sudan.png");
            images[189] = createImageIcon("png/sudan.png");
            images[190] = createImageIcon("png/sudan.png");
            images[191] = createImageIcon("png/suriname.png");
            images[192] = createImageIcon("png/suriname.png");
            images[193] = createImageIcon("png/swaziland.png");
            images[194] = createImageIcon("png/sweden.png");
            images[195] = createImageIcon("png/switzerland.png");
            images[196] = createImageIcon("png/syria.png");
            images[197] = createImageIcon("png/taiwan.png");
            images[198] = createImageIcon("png/tajikistan.png");
            images[199] = createImageIcon("png/tanzania.png");
            images[200] = createImageIcon("png/thailand.png");
            images[201] = createImageIcon("png/tonga.png");
            images[202] = createImageIcon("png/transnistria.png");
            images[203] = createImageIcon("png/trinidad.png");
            images[204] = createImageIcon("png/tunisia.png");
            images[205] = createImageIcon("png/turkey.png");
            images[206] = createImageIcon("png/turkey.png");
            images[207] = createImageIcon("png/turkmenistan.png");
            images[208] = createImageIcon("png/turkmenistan.png");
            images[209] = createImageIcon("png/tuvalu.png");
            images[210] = createImageIcon("png/uganda.png");
            images[211] = createImageIcon("png/uganda.png");
            images[212] = createImageIcon("png/ukraine.png");
            images[213] = createImageIcon("png/unitedarabemirates.png");
            images[214] = createImageIcon("png/unitedstates.png");
            images[215] = createImageIcon("png/uruguay.png");
            images[216] = createImageIcon("png/uruguay.png");
            images[217] = createImageIcon("png/uzbekist??n.png");
            images[218] = createImageIcon("png/vanuatu.png");
            images[219] = createImageIcon("png/venezuela.png");
            images[220] = createImageIcon("png/venezuela.png");
            images[221] = createImageIcon("png/venezuela.png");
            images[222] = createImageIcon("png/vietnam.png");
            images[223] = createImageIcon("png/westafrica.png");
            images[224] = createImageIcon("png/yemen.png");
            images[225] = createImageIcon("png/yugoslavia.png");
            images[226] = createImageIcon("png/zambia.png");
            images[227] = createImageIcon("png/zimbabwe.png");




            if (images[i] != null) {
                images[i].setDescription(countries[i]);
            }
        }


        countriesList = new JComboBox(intArray);
        countriesList.setFont(countriesList.getFont().deriveFont(Font.PLAIN, 20));
        countriesList.setBounds(300, 325, 370, 20);
        ComboBoxRenderer renderer= new ComboBoxRenderer();
        renderer.setPreferredSize(new Dimension(200, 130));
        countriesList.setRenderer(renderer);
        countriesList.setMaximumRowCount(3);


        countriesList2 = new JComboBox(intArray);
        countriesList2.setFont(countriesList2.getFont().deriveFont(Font.PLAIN, 20));
        countriesList2.setBounds(825,325,370,20);
        ComboBoxRenderer renderer2 = new ComboBoxRenderer();
        renderer2.setPreferredSize(new Dimension(200,130));
        countriesList2.setRenderer(renderer2);
        countriesList2.setMaximumRowCount(3);

        JFrame.setDefaultLookAndFeelDecorated(true);


        JFrame frame = new JFrame("Currency Converter");
        frame.add(countriesList);
        frame.add(countriesList2);
        JButton hERates = new JButton("Historical Exchange Rates");
        Dimension size = hERates.getPreferredSize();
        hERates.setBounds(50, 180, size.width, size.height);
        JButton lERates = new JButton("Live Exchange Rates");
        Dimension size2 = lERates.getPreferredSize();
        lERates.setBounds(300, 180, size2.width, size2.height);
        JButton convert = new JButton("Convert");
        Dimension size3 = convert.getPreferredSize();
        convert.setBounds(1000,500,size.width,size3.height);
        Icon icon = new ImageIcon("/Users/christopher/Desktop/switch1.png");
        JButton theSwitch = new JButton(icon);




        JLabel amount = new JLabel("Amount");
        amount.setBounds(50, 275, 200, 30);
        Font labelFont = amount.getFont();
        amount.setFont(new Font(labelFont.getName(), Font.PLAIN, 20));

        JLabel from = new JLabel("From");
        from.setBounds(300, 275, 200, 30);
        Font labelFont2 = from.getFont();
        from.setFont(new Font(labelFont2.getName(), Font.PLAIN, 20));

        JLabel to = new JLabel("To");
        to.setBounds(825, 275, 200, 30);
        Font labelFont3 = to.getFont();
        to.setFont(new Font(labelFont3.getName(), Font.PLAIN, 20));

        JTextField currencyType = new JTextField();
        currencyType.setFont(currencyType.getFont().deriveFont(Font.PLAIN, 20));
        currencyType.setBounds(50, 325, 200, 30);
        currencyType.setVisible(true);


        countriesList.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    Object item = e.getItem();
                    if (item.equals(intArray[0])){
                        currencyType.setText("??????????");
                    } else if (item.equals(intArray[1])){
                        currencyType.setText("??");
                    } else if (item.equals(intArray[2])){
                        currencyType.setText("L");
                    } else if (item.equals(intArray[3])){
                        currencyType.setText("??");
                    } else if (item.equals(intArray[4])){
                        currencyType.setText("????");
                    } else if (item.equals(intArray[5])){
                        currencyType.setText("ADF");
                    } else if (item.equals(intArray[6])){
                        currencyType.setText("Pt");
                    } else if (item.equals(intArray[7])){
                        currencyType.setText("Kz");
                    } else if (item.equals(intArray[8])){
                        currencyType.setText("Kz");
                    } else if (item.equals(intArray[9])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[10])){
                        currencyType.setText("??");
                    } else if (item.equals(intArray[11])){
                        currencyType.setText("????.");
                    } else if (item.equals(intArray[12])){
                        currencyType.setText("??");
                    } else if (item.equals(intArray[13])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[14])){
                        currencyType.setText("S");
                    } else if (item.equals(intArray[15])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[16])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[17])){
                        currencyType.setText("B$");
                    } else if (item.equals(intArray[18])){
                        currencyType.setText(".??.??");
                    } else if (item.equals(intArray[19])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[20])){
                        currencyType.setText("Bds$");
                    } else if (item.equals(intArray[21])){
                        currencyType.setText("Br");
                    } else if (item.equals(intArray[22])){
                        currencyType.setText("Br");
                    } else if (item.equals(intArray[23])){
                        currencyType.setText("F");
                    } else if (item.equals(intArray[24])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[25])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[26])){
                        currencyType.setText("Nu.");
                    } else if (item.equals(intArray[27])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[28])){
                        currencyType.setText("Bs");
                    } else if (item.equals(intArray[29])){
                        currencyType.setText("KM");
                    } else if (item.equals(intArray[30])){
                        currencyType.setText("P");
                    } else if (item.equals(intArray[31])){
                        currencyType.setText("R$");
                    } else if (item.equals(intArray[32])){
                        currencyType.setText("??");
                    } else if (item.equals(intArray[33])){
                        currencyType.setText("B$");
                    } else if (item.equals(intArray[34])){
                        currencyType.setText("????.");
                    } else if (item.equals(intArray[35])){
                        currencyType.setText("????.");
                    } else if (item.equals(intArray[36])){
                        currencyType.setText("K");
                    } else if (item.equals(intArray[37])){
                        currencyType.setText("FBu");
                    } else if (item.equals(intArray[38])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[39])){
                        currencyType.setText("C$");
                    } else if (item.equals(intArray[40])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[41])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[42])){
                        currencyType.setText("FCFA");
                    } else if (item.equals(intArray[43])){
                        currencyType.setText("F");
                    } else if (item.equals(intArray[44])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[45])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[46])){
                        currencyType.setText("CLF");
                    } else if (item.equals(intArray[47])){
                        currencyType.setText("??");
                    } else if (item.equals(intArray[48])){
                        currencyType.setText("??");
                    } else if (item.equals(intArray[49])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[50])){
                        currencyType.setText("CF");
                    } else if (item.equals(intArray[51])){
                        currencyType.setText("FC");
                    } else if (item.equals(intArray[52])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[53])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[54])){
                        currencyType.setText("kn");
                    } else if (item.equals(intArray[55])){
                        currencyType.setText("CUC$");
                    } else if (item.equals(intArray[56])){
                        currencyType.setText("$MN");
                    } else if (item.equals(intArray[57])){
                        currencyType.setText("??");
                    } else if (item.equals(intArray[58])){
                        currencyType.setText("K??");
                    } else if (item.equals(intArray[59])){
                        currencyType.setText("Kr.");
                    } else if (item.equals(intArray[60])){
                        currencyType.setText("Fdj");
                    } else if (item.equals(intArray[61])){
                        currencyType.setText("RD$");
                    } else if (item.equals(intArray[62])){
                        currencyType.setText("fl.");
                    } else if (item.equals(intArray[63])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[64])){
                        currencyType.setText("S/.");
                    } else if (item.equals(intArray[65])){
                        currencyType.setText("E??");
                    } else if (item.equals(intArray[66])){
                        currencyType.setText("SVC");
                    } else if (item.equals(intArray[67])){
                        currencyType.setText("Nfk");
                    } else if (item.equals(intArray[68])){
                        currencyType.setText("kr");
                    } else if (item.equals(intArray[69])){
                        currencyType.setText("??");
                    } else if (item.equals(intArray[70])){
                        currencyType.setText("Br");
                    } else if (item.equals(intArray[71])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[72])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[73])){
                        currencyType.setText("??");
                    } else if (item.equals(intArray[74])){
                        currencyType.setText("kr");
                    } else if (item.equals(intArray[75])){
                        currencyType.setText("FJ$");
                    } else if (item.equals(intArray[76])){
                        currencyType.setText("mk");
                    } else if (item.equals(intArray[77])){
                        currencyType.setText("FRF");
                    } else if (item.equals(intArray[78])){
                        currencyType.setText("D");
                    } else if (item.equals(intArray[79])){
                        currencyType.setText("GEL");
                    } else if (item.equals(intArray[80])){
                        currencyType.setText("DM");
                    } else if (item.equals(intArray[81])){
                        currencyType.setText("GH??");
                    } else if (item.equals(intArray[82])){
                        currencyType.setText("GH??");
                    } else if (item.equals(intArray[83])){
                        currencyType.setText("??");
                    } else if (item.equals(intArray[84])){
                        currencyType.setText("XAU");
                    } else if (item.equals(intArray[85])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[86])){
                        currencyType.setText("Q");
                    } else if (item.equals(intArray[87])){
                        currencyType.setText("??");
                    } else if (item.equals(intArray[88])){
                        currencyType.setText("FG");
                    } else if (item.equals(intArray[89])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[90])){
                        currencyType.setText("G");
                    } else if (item.equals(intArray[91])){
                        currencyType.setText("L");
                    } else if (item.equals(intArray[92])){
                        currencyType.setText("HK$");
                    } else if (item.equals(intArray[93])){
                        currencyType.setText("Ft");
                    } else if (item.equals(intArray[94])){
                        currencyType.setText("kr");
                    } else if (item.equals(intArray[95])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[96])){
                        currencyType.setText("Rp");
                    } else if (item.equals(intArray[97])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[98])){
                        currencyType.setText("??.??");
                    } else if (item.equals(intArray[99])){
                        currencyType.setText("??sd");
                    } else if (item.equals(intArray[100])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[101])){
                        currencyType.setText("L");
                    } else if (item.equals(intArray[102])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[103])){
                        currencyType.setText("??");
                    } else if (item.equals(intArray[104])){
                        currencyType.setText("??");
                    } else if (item.equals(intArray[105])){
                        currencyType.setText("??.??");
                    } else if (item.equals(intArray[106])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[107])){
                        currencyType.setText("KSh");
                    } else if (item.equals(intArray[108])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[109])){
                        currencyType.setText("KD");
                    } else if (item.equals(intArray[110])){
                        currencyType.setText("????");
                    } else if (item.equals(intArray[111])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[112])){
                        currencyType.setText("??.??.");
                    } else if (item.equals(intArray[113])){
                        currencyType.setText("L");
                    } else if (item.equals(intArray[114])){
                        currencyType.setText("L$");
                    } else if (item.equals(intArray[115])){
                        currencyType.setText("LD");
                    } else if (item.equals(intArray[116])){
                        currencyType.setText("??");
                    } else if (item.equals(intArray[117])){
                        currencyType.setText("Lt");
                    } else if (item.equals(intArray[118])){
                        currencyType.setText("F");
                    } else if (item.equals(intArray[119])){
                        currencyType.setText("MOP$");
                    } else if (item.equals(intArray[120])){
                        currencyType.setText("??????");
                    } else if (item.equals(intArray[121])){
                        currencyType.setText("Ar");
                    } else if (item.equals(intArray[122])){
                        currencyType.setText("MF");
                    } else if (item.equals(intArray[123])){
                        currencyType.setText("MK");
                    } else if (item.equals(intArray[124])){
                        currencyType.setText("RM");
                    } else if (item.equals(intArray[125])){
                        currencyType.setText("Rf");
                    } else if (item.equals(intArray[126])){
                        currencyType.setText("Lm");
                    } else if (item.equals(intArray[127])){
                        currencyType.setText("??");
                    } else if (item.equals(intArray[128])){
                        currencyType.setText("UM");
                    } else if (item.equals(intArray[129])){
                        currencyType.setText("UM");
                    } else if (item.equals(intArray[130])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[131])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[132])){
                        currencyType.setText("L");
                    } else if (item.equals(intArray[133])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[134])){
                        currencyType.setText("DH");
                    } else if (item.equals(intArray[135])){
                        currencyType.setText("MT");
                    } else if (item.equals(intArray[136])){
                        currencyType.setText("MTn");
                    } else if (item.equals(intArray[137])){
                        currencyType.setText("K");
                    } else if (item.equals(intArray[138])){
                        currencyType.setText("N$");
                    } else if (item.equals(intArray[139])){
                        currencyType.setText("??????");
                    } else if (item.equals(intArray[140])){
                        currencyType.setText("NA??");
                    } else if (item.equals(intArray[141])){
                        currencyType.setText("NT$");
                    } else if (item.equals(intArray[142])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[143])){
                        currencyType.setText("C$");
                    } else if (item.equals(intArray[144])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[145])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[146])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[147])){
                        currencyType.setText("kr");
                    } else if (item.equals(intArray[148])){
                        currencyType.setText("??.??.");
                    } else if (item.equals(intArray[149])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[150])){
                        currencyType.setText("XPD");
                    } else if (item.equals(intArray[151])){
                        currencyType.setText("B/.");
                    } else if (item.equals(intArray[152])){
                        currencyType.setText("K");
                    } else if (item.equals(intArray[153])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[154])){
                        currencyType.setText("S/");
                    } else if (item.equals(intArray[155])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[156])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[157])){
                        currencyType.setText("XPT");
                    } else if (item.equals(intArray[158])){
                        currencyType.setText("z??");
                    } else if (item.equals(intArray[159])){
                        currencyType.setText("z??");
                    } else if (item.equals(intArray[160])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[161])){
                        currencyType.setText(" ??.??");
                    } else if (item.equals(intArray[162])){
                        currencyType.setText("L");
                    } else if (item.equals(intArray[163])){
                        currencyType.setText("L");
                    } else if (item.equals(intArray[164])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[165])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[166])){
                        currencyType.setText("FRw");
                    } else if (item.equals(intArray[167])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[168])){
                        currencyType.setText("??");
                    } else if (item.equals(intArray[169])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[170])){
                        currencyType.setText("Db");
                    } else if (item.equals(intArray[171])){
                        currencyType.setText("Db");
                    } else if (item.equals(intArray[172])){
                        currencyType.setText("??.??, ???");
                    } else if (item.equals(intArray[173])){
                        currencyType.setText("din");
                    } else if (item.equals(intArray[174])){
                        currencyType.setText("din");
                    } else if (item.equals(intArray[175])){
                        currencyType.setText("SR");
                    } else if (item.equals(intArray[176])){
                        currencyType.setText("Le");
                    } else if (item.equals(intArray[177])){
                        currencyType.setText("XAG");
                    } else if (item.equals(intArray[178])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[179])){
                        currencyType.setText("Sk");
                    } else if (item.equals(intArray[180])){
                        currencyType.setText("");
                    } else if (item.equals(intArray[181])){
                        currencyType.setText("Si$");
                    } else if (item.equals(intArray[182])){
                        currencyType.setText("Sh.so.");
                    } else if (item.equals(intArray[183])){
                        currencyType.setText("R");
                    } else if (item.equals(intArray[184])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[185])){
                        currencyType.setText("??");
                    } else if (item.equals(intArray[186])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[187])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[188])){
                        currencyType.setText("??Sd");
                    } else if (item.equals(intArray[189])){
                        currencyType.setText("??SD");
                    } else if (item.equals(intArray[190])){
                        currencyType.setText("??SD");
                    } else if (item.equals(intArray[191])){
                        currencyType.setText("??");
                    } else if (item.equals(intArray[192])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[193])){
                        currencyType.setText("E");
                    } else if (item.equals(intArray[194])){
                        currencyType.setText("kr");
                    } else if (item.equals(intArray[195])){
                        currencyType.setText("CHF");
                    } else if (item.equals(intArray[196])){
                        currencyType.setText("??S");
                    } else if (item.equals(intArray[197])){
                        currencyType.setText("??S");
                    } else if (item.equals(intArray[198])){
                        currencyType.setText("SM");
                    } else if (item.equals(intArray[199])){
                        currencyType.setText("TSh");
                    } else if (item.equals(intArray[200])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[201])){
                        currencyType.setText("T$");
                    } else if (item.equals(intArray[202])){
                        currencyType.setText("p????/??");
                    } else if (item.equals(intArray[203])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[204])){
                        currencyType.setText("??.??");
                    } else if (item.equals(intArray[205])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[206])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[207])){
                        currencyType.setText("T");
                    } else if (item.equals(intArray[208])){
                        currencyType.setText("m");
                    } else if (item.equals(intArray[209])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[210])){
                        currencyType.setText("USh");
                    } else if (item.equals(intArray[211])){
                        currencyType.setText("USh");
                    } else if (item.equals(intArray[212])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[213])){
                        currencyType.setText("??.??");
                    } else if (item.equals(intArray[214])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[215])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[216])){
                        currencyType.setText("$");
                    } else if (item.equals(intArray[217])){
                        currencyType.setText("??????");
                    } else if (item.equals(intArray[218])){
                        currencyType.setText("VT");
                    } else if (item.equals(intArray[219])){
                        currencyType.setText("Bs");
                    } else if (item.equals(intArray[220])){
                        currencyType.setText("Bs.F");
                    } else if (item.equals(intArray[221])){
                        currencyType.setText("Bs.S");
                    } else if (item.equals(intArray[222])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[223])){
                        currencyType.setText("CFA");
                    } else if (item.equals(intArray[224])){
                        currencyType.setText("???");
                    } else if (item.equals(intArray[225])){
                        currencyType.setText("din.");
                    } else if (item.equals(intArray[226])){
                        currencyType.setText("ZK");
                    } else if (item.equals(intArray[227])){
                        currencyType.setText("$");
                    }
                }
            }
        });





        //currencyType.setText(symbol);


        JTextField entryField = new JTextField();


        frame.setSize(1200,600);

        frame.add(hERates);
        frame.add(lERates);
        frame.add(theSwitch).setBounds(715,315,50,50);
        frame.add(convert);
        frame.add(amount);
        frame.add(from);
        frame.add(to);
        frame.add(currencyType);
        frame.add(entryField);


        frame.pack();
        frame.setVisible(true);



    }



    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    createAndShowGUI();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    static class ComboBoxRenderer extends JLabel
            implements ListCellRenderer {
        private Font uhOhFont;

        public ComboBoxRenderer() {
            setOpaque(true);
            setHorizontalAlignment(CENTER);
            setVerticalAlignment(CENTER);
        }




        public Component getListCellRendererComponent(
                JList list,
                Object value,
                int index,
                boolean isSelected,
                boolean cellHasFocus) {

            int selectedIndex = ((Integer)value).intValue();

            if (isSelected) {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            } else {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }


            ImageIcon icon = images[selectedIndex];
            String country = countries[selectedIndex];
            setIcon(icon);
            if (icon != null) {
                setText(country);
                setFont(list.getFont());
            } else {
                setUhOhText(country + " (no image available)",
                        list.getFont());
            }

            return this;
        }


        protected void setUhOhText(String uhOhText, Font normalFont) {
            if (uhOhFont == null) {
                uhOhFont = normalFont.deriveFont(Font.ITALIC);
            }
            setFont(uhOhFont);
            setText(uhOhText);
        }
    }
}


