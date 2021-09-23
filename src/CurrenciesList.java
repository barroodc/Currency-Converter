import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class CurrenciesList extends JPanel {
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
                    "CentralAfricanCFAfranc(XAF)\n" +
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
                    "CzechoslovakKoruna(CSK)\n" +
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
                    "QatariRial(QAR)\n" +
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
                    "TonganPa’anga(TOP)\n" +
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
        java.net.URL imgURL = CurrenciesList.class.getResource(path);
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
            images[i] = createImageIcon("png/paraguay.png");
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
        Icon icon = new ImageIcon("/Users/christopher/Desktop/switch1.png");
        JButton theSwitch = new JButton(icon);
        JButton convert = new JButton("Convert");
        Dimension size3 = convert.getPreferredSize();
        convert.setBounds(1000,500,size.width,size3.height);


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

        JTextField motto1 = new JTextField();
        motto1.setFont(motto1.getFont().deriveFont(Font.PLAIN, 20));
        motto1.setBounds(50, 325, 200, 30);

        frame.setSize(1200,600);

        frame.add(hERates);
        frame.add(lERates);
        frame.add(theSwitch);
        frame.add(convert);
        frame.add(amount);
        frame.add(from);
        frame.add(to);
        frame.add(motto1);







        //Display the window.
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
            if (uhOhFont == null) { //lazily create this font
                uhOhFont = normalFont.deriveFont(Font.ITALIC);
            }
            setFont(uhOhFont);
            setText(uhOhText);
        }
    }
}
