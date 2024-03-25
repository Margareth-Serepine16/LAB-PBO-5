class Dog {
    private String nama;
    private String ras;
    private String warna;
    private String gender;
    private double usia;

    Dog(String nama, String ras, String warna, String gender, double usia) {
        this.nama = nama;
        this.ras = ras;
        this.warna = warna;
        this.gender = gender;
        this.usia = usia;
    }

    public String getNama() {
        return this.nama;
    }
    public String getRas(){
        return this.ras;
    }
    public String getWarna(){
        return this.warna;
    }
    public String getGender(){
        return this.gender;
    }
    public double getUSia() {
        return this.usia;
    }
    public void bermain() {
        System.out.println(this.nama + " sedang bermain");
    }
    public void berlari() {
        System.out.println(this.nama + " berlari lari");
    }
    public void makan(){
        System.out.println(this.nama + " memakan makanannya");
    }
    public void  tidur(){
        System.out.println("Zzzz.. " + this.nama+ " mengantuk dan sedang tidurr");
    }
    public void  bersuara(){
        System.out.println("woof!! woof!! arrgff.. woof!");
    }

}