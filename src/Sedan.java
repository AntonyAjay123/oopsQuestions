public class Sedan implements Car{
    String name;

    int BS01;
    int EF01;
    int CF01;
    int BF01;
    int GF01;
    public Sedan(){
        this.name="Sedan";
        this.BS01=4000;
        this.EF01=8000;
        this.CF01=4000;
        this.BF01=1500;
        this.GF01=6000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBS01() {
        return BS01;
    }

    public void setBS01(int BS01) {
        this.BS01 = BS01;
    }

    public int getEF01() {
        return EF01;
    }

    public void setEF01(int EF01) {
        this.EF01 = EF01;
    }

    public int getCF01() {
        return CF01;
    }

    public void setCF01(int CF01) {
        this.CF01 = CF01;
    }

    public int getBF01() {
        return BF01;
    }

    public void setBF01(int BF01) {
        this.BF01 = BF01;
    }

    public int getGF01() {
        return GF01;
    }

    public void setGF01(int GF01) {
        this.GF01 = GF01;
    }
}
