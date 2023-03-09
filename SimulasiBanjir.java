class BuangSampah {
    String sungai, name;
    int jml_sampah;
    void sembarangan(){
        sungai = "meluap";
    }
    void keTempatSampah(){
        sungai = "aman";
    }
    void akibat(){
        if (sungai == "aman"){
            System.out.println("Sungai aman dari banjir!");
        } else if (sungai == "meluap"){
            System.out.println("Sungai meluap, banjir!!!");
        }
    }
}
class Orang{
    String name;
    Orang (String name){
        this.name = name;
    }
    BuangSampah buang_sampah;
}
class SimulasiBanjir{
    public static void main(String[]args){
        Orang orang = new Orang("Kim");
        BuangSampah buang_sampah = new BuangSampah();
        orang.buang_sampah = buang_sampah;
        
        //System.out.println(orang.name+" membuang sampah sembarangan");
        //orang.buang_sampah.sembarangan();
        
        System.out.println(orang.name+" membuang sampah ke tempat sampah");
        orang.buang_sampah.keTempatSampah();
        
        orang.buang_sampah.akibat();
    }
}
